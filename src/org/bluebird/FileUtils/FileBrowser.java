package org.bluebird.FileUtils;

import org.bluebird.Extractor.LanguageWalker;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;

public class FileBrowser {

    /**
     * Le um arquivo qualquer
     *
     * @param file     Arquivo para ler
     * @param encoding Encoding desejado
     * @return O string do arquivo
     * @throws IOException Erro de leitura de arquivo
     */
    public static String readFile(File file, Charset encoding) throws IOException {
        byte[] encoded = Files.readAllBytes(file.toPath());
        return new String(encoded, encoding);
    }

    /**
     * Retorna o formato do arquivo
     *
     * @param fileName Nome do arquivo
     * @return Formato do arquivo lido
     */

    private static String returnFileFormat(String fileName) {
        int i = fileName.lastIndexOf('.');

        if (i > 0) {
            return fileName.substring(i+1);
        } else {
            return null;
        }
    }

    /**
     * Pecorre o diretorio procurando por arquivos no formato desejado
     *
     * @param walker    Walker da linguagem que vai ser utilizado
     * @param directory Diretorio que deseja pecorrer
     * @throws IOException Erro de leitura de arquivo
     */
    public static void browseDirectory(LanguageWalker walker, File directory) throws IOException {
        for (File child : directory.listFiles()) {
            if (child.isDirectory()) {
                browseDirectory(walker, child);
            } else {
                if (walker.languageFormat().contains(FileBrowser.returnFileFormat(child.getName()))) {
                    walker.walkFileTree(child);
                }
            }
        }
    }
}
