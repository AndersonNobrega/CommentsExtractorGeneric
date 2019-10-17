package org.bluebird.FileUtils;

import java.io.*;

public class FileCreator {

    private static StringBuffer codeTokensFile = new StringBuffer();
    private static StringBuffer commentsTokensFile = new StringBuffer();
    private static StringBuffer statsTxtFile = new StringBuffer();
    private static StringBuffer codeLineFile = new StringBuffer();


    public static StringBuffer getCodeLineFile() {
        return FileCreator.codeLineFile;
    }


    /**
     * Retorna as metricas do projeto
     *
     * @return String das metricas do projeto
     */
    public static StringBuffer getStatsTxtFile() {
        return FileCreator.statsTxtFile;
    }

    /**
     * Retorna o conteudo do arquivo de tokens do codigo
     *
     * @return String dos tokens do codigo
     */
    public static StringBuffer getCodeTokensFile() {
        return FileCreator.codeTokensFile;
    }

    /**
     * Retorna o conteudo do arquivo de tokens dos comentarios
     *
     * @return String dos tokens dos comentarios
     */
    public static StringBuffer getCommentsTokensFile() {
        return FileCreator.commentsTokensFile;
    }

    /**
     * Salva um arquivo
     *
     * @param fileName Nome do arquivo
     * @param path     Caminho do arquivo
     * @param type     String do arquivo para processar
     * @param format   Formato do arquivo
     */
    public static void saveFile(String fileName, String path, StringBuffer type, String format) {
        FileWriter fileWriter;
        BufferedWriter writer;

        if (path.charAt(path.length() - 1) == '/') {
            path = path.substring(0, path.length() - 1);
        }

        File directory = new File(path + "/");
        if (!directory.exists()){
            directory.mkdirs();
        }

        try {
            fileWriter = new FileWriter(path + "/" + fileName + "." + format);
            writer = new BufferedWriter(fileWriter);

            writer.append(type);

            writer.flush();
            type.setLength(0);
            writer.close();
            fileWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("Não foi possivel abrir arquivo");
        } catch (IOException e) {
            System.out.println("Problemas com leitura do arquivo");
        }
    }

    public static void appendToCodeLineFile(String content) {
        FileCreator.codeLineFile.append(content);
    }

    /**
     * Adiciona o token ao arquivo de tokens do codigo
     *
     * @param content Conteudo para adicionar
     */
    public static void appendToCodeTokensFile(String content) {
        FileCreator.codeTokensFile.append(content);
    }

    /**
     * Adiciona as metricas do projeto ao arquivo txt
     *
     * @param content Conteudo para adicionar
     */
    public static void appendToStatsTxtFile(String content) {
        FileCreator.statsTxtFile.append(content);
    }

    /**
     * Adiciona o token ao arquivo de tokens dos comentarios
     *
     * @param content Conteudo para adicionar
     */
    public static void appendToCommentsTokensFile(String content) {
        FileCreator.commentsTokensFile.append(content);
    }
}
