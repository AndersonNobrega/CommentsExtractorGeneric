package org.bluebird;

import org.bluebird.Extractor.Setup.ExtractorInit;

public class Runner {

    /**
     * Classe principal do projeto
     *
     * @param args Deve ter a lista de argumentos para o extrator
     */
    public static void main(String[] args) {
        ExtractorInit extractorInit = new ExtractorInit();
        String languageOption = "", projectName = "", projectPath = "", filePath = "";
        final String MANUAL = "You must set the following options:"
                + "\n\t-lang: language of the project to be extracted"
                + "\n\t-d: the project path must be inserted after this option"
                + "\n\t-n: sets the ProjectName"
                + "\n\t-f: path to save the resulting file(s)"
                + "\n\n\tEXAMPLE: -lang Java,C,CSharp -n Project_name -d ~/SomeProject/ -f ~/Downloads";
        try {
            if (args.length == 0) {
                System.out.println(MANUAL);
                System.exit(0);
            }

            for (int i = 0; i < args.length; i++) {
                switch (args[i]) {
                    case "-lang":
                        languageOption = args[++i];
                        break;
                    case "-d":
                        projectPath = args[++i];
                        break;
                    case "-n":
                        projectName = args[++i];
                        break;
                    case "-f":
                        filePath = args[++i];
                        break;
                    case "-help":
                    default:
                        System.out.println(MANUAL);
                        System.exit(0);
                        break;
                }
            }

            extractorInit.extractVocabulary(languageOption.split(","), projectName, projectPath, filePath);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(MANUAL);
        }
    }
}