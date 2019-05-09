import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class VocabularyExtractorTests {
    private ArrayList<Integer> tokenCodigo = new ArrayList<>();
    private ArrayList<Integer> tokenComentario = new ArrayList<>();
    private ArrayList<Integer> charCodigo = new ArrayList<>();
    private ArrayList<Integer> charComentario = new ArrayList<>();

    VocabularyExtractorTests() {
        lerArquivo();
    }

    private void lerArquivo() {
        Scanner scanner;
        int cont = 0, index = 0;
        String var;

        try {
            scanner = new Scanner(new File("/home/anderson/Programming Projects/Java Projects/Vocabulary_Metrics/test/Metricas.csv"));

            scanner.useDelimiter(",");
            while(scanner.hasNext()){
                if (cont >= 11) {
                    var = scanner.next();
                    index++;
                    if (index == 3 || index == 14) {
                        tokenCodigo.add(Integer.parseInt(var));
                    } else if (index == 4 || index == 15) {
                        tokenComentario.add(Integer.parseInt(var));
                    } else if (index == 6 || index == 17) {
                        charCodigo.add(Integer.parseInt(var));
                    } else if (index == 7 || index == 18) {
                        charComentario.add(Integer.parseInt(var));
                    }
                } else {
                    cont++;
                    scanner.next();
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    void tokenCodigo() {
        assertEquals(14 , tokenCodigo.get(0));
        assertEquals(40, tokenCodigo.get(1));
    }

    @Test
    void tokenComentario() {
        assertEquals(0, tokenComentario.get(0));
        assertEquals(6, tokenComentario.get(1));
    }

    @Test
    void charCodigo() {
        assertEquals(36, charCodigo.get(0));
        assertEquals(85, charCodigo.get(1));
    }

    @Test
    void charComentario() {
        assertEquals(0, charComentario.get(0));
        assertEquals(31, charComentario.get(1));
    }
}
