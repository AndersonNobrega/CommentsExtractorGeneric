package org.bluebird.Utils;

import org.bluebird.FileUtils.FileCreator;

public class MemoryRuntime {

    /**
     * Calcula memória utilizada pelo extrator
     */
    public void calculateAll() {
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();

        long memory = runtime.totalMemory() - runtime.freeMemory();
        FileCreator.appendToStatsTxtFile("Memoria utilizada em bytes: " + memory + "\n");
        FileCreator.appendToStatsTxtFile("Memoria utilizada em megabytes: " + bytesToMegabytes(memory) + "\n");
        FileCreator.appendToStatsTxtFile("Memoria utilizada em Kbytes: " + bytesToKbytes(memory) + "\n");

        memory = runtime.maxMemory();
        FileCreator.appendToStatsTxtFile("Máximo de memória utilizada em Kbytes: " + bytesToKbytes(memory) + "\n");

        long processor = runtime.availableProcessors();
        FileCreator.appendToStatsTxtFile("Número de processadores ativos: " + processor + "\n");
    }

    /**
     * Converte bytes para megabytes
     *
     * @param bytes valor em bytes
     * @return valor convertido em megabytes
     */
    private long bytesToMegabytes(long bytes) {
        final long MEGABYTE = 1024L * 1024L;
        return bytes / MEGABYTE;
    }

    /**
     * Converte bytes para kilobytes
     *
     * @param bytes valor em bytes
     * @return valor convertido em kilobytes
     */
    private long bytesToKbytes(long bytes) {
        final long KBYTE = 1024L;
        return bytes / KBYTE;
    }

}