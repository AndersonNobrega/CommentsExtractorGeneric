package org.bluebird.Extractor.Setup;

import org.bluebird.Extractor.LanguageWalker;
import org.bluebird.FileUtils.FileBrowser;
import org.bluebird.FileUtils.FileCreator;
import org.bluebird.Utils.MemoryRuntime;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ExtractorInit {

    public ExtractorInit() {
    }

    /**
     * Procurar pelo walker que deve ser utilizado
     *
     * @param language Linguagem do Walker
     * @return Walker da Linguagem
     */
    private LanguageWalker returnWalkerObject(String language) {
        try {
            Class walker = Class.forName("org.bluebird.Extractor.Languages." + language + "." + language + "Walker");
            return (LanguageWalker) walker.newInstance();
        } catch (ReflectiveOperationException e) {
            return null;
        }
    }

    /**
     * Extrai o vocabulario do projeto que foi escolhido
     *
     * @param languageOption Linguagens do projeto
     * @param projectName    Nome do projeto
     * @param dirPath        Caminho do projeto
     * @param fileToSavePath Caminho para salvar vxl
     */
    public void extractVocabulary(String[] languageOption, String projectName, String dirPath, String fileToSavePath) {
        long start = System.currentTimeMillis(), elapsedTimeMillis, elapsedTimeSec;

        MemoryRuntime memoryRuntime = new MemoryRuntime();

        System.out.println("Comments Extractor Running...");

        for (String language : languageOption) {
            LanguageWalker walker = returnWalkerObject(language);

            if (walker == null) {
                System.exit(1);
            } else {
                try {
                    FileBrowser.browseDirectory(walker, new File(dirPath));
                } catch (IOException error) {
                    System.out.println("Path not found");
                }
            }
        }

        FileCreator.saveFile(projectName + "_Comments_Tokens", fileToSavePath + "/Tokens/",
                                                    FileCreator.getCommentsTokensFile(), "txt");
        FileCreator.saveFile(projectName + "_Code_Tokens", fileToSavePath + "/Tokens/",
                                                    FileCreator.getCodeTokensFile(), "txt");
        FileCreator.saveFile(projectName + "_Code_Line", fileToSavePath + "/Tokens/",
                                                    FileCreator.getCodeLineFile(), "txt");

        FileCreator.appendToStatsTxtFile("Projeto: " + projectName + "\n" + "Linguagem: " + languageOption[0] + "\n");
        memoryRuntime.calculateAll();
        elapsedTimeMillis = System.currentTimeMillis() - start;
        elapsedTimeSec = TimeUnit.MILLISECONDS.toSeconds(elapsedTimeMillis);
        FileCreator.appendToStatsTxtFile("Tempo em Milisegundos: " + elapsedTimeMillis + "\nTempo em Segundos: " + elapsedTimeSec + "\n");
        FileCreator.saveFile(projectName + "_Metrics", fileToSavePath + "/Metrics/",
                                                        FileCreator.getStatsTxtFile(), "txt");

        System.out.println("Completed.");
    }
}
