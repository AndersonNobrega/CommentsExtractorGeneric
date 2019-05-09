package org.bluebird.Extractor;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public interface LanguageWalker {

    /**
     * Pecorre a arvore gerada do codigo fonte
     *
     * @param file Arquivo a ser pecorrido
     * @throws IOException Erro de leitura do arquivo
     */
    void walkFileTree(File file) throws IOException;

    /**
     * Diz qual formato de arquivo da linguagem
     *
     * @return Formato do arquivo
     */
    ArrayList<String> languageFormat();
}
