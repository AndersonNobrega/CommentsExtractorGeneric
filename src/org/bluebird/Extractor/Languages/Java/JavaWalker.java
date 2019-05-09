package org.bluebird.Extractor.Languages.Java;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.bluebird.Extractor.CommentsExtractor;
import org.bluebird.Extractor.LanguageWalker;
import org.bluebird.LanguagesUtils.Java.JavaLexer;
import org.bluebird.LanguagesUtils.Java.JavaParser;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

import static org.bluebird.FileUtils.FileBrowser.readFile;

public class JavaWalker implements LanguageWalker {

    private ArrayList<String> languageExtensionList = new ArrayList<String>() {
        {
            add("java");
        }

    };

    /**
     * Pecorre a arvore gerada do codigo fonte
     * @param file Arquivo a ser pecorrido
     * @throws IOException Erro de leitura do arquivo
     */
    @Override
    public void walkFileTree(File file) throws IOException {
        String code = readFile(file, Charset.forName("UTF-8"));
        JavaLexer lexer = new JavaLexer(new ANTLRInputStream(code));
        lexer.removeErrorListener(ConsoleErrorListener.INSTANCE);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        CommentsExtractor commentsExtractor = new CommentsExtractor();
        tokens.fill();
        commentsExtractor.getAllComments(tokens.getTokens(), JavaLexer.COMMENTS_CHANNEL);

        JavaParser parser = new JavaParser(tokens);
        parser.removeErrorListener(ConsoleErrorListener.INSTANCE);
        ParserRuleContext tree = parser.compilationUnit();
        ParseTreeWalker walker = new ParseTreeWalker();
        JavaListener extractor = new JavaListener(tokens);
        walker.walk(extractor, tree);
    }

    /**
     * Diz qual formato de arquivo da linguagem
     * @return Formato do arquivo
     */
    @Override
    public ArrayList<String> languageFormat() {
        return languageExtensionList;
    }
}
