package org.bluebird.Extractor.Languages.JavaScript;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.bluebird.Extractor.CommentsExtractor;
import org.bluebird.Extractor.LanguageWalker;
import org.bluebird.LanguagesUtils.JavaScript.JavaScriptLexer;
import org.bluebird.LanguagesUtils.JavaScript.JavaScriptParser;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

import static org.bluebird.FileUtils.FileBrowser.readFile;

public class JavaScriptWalker implements LanguageWalker {

    private ArrayList<String> languageExtensionList = new ArrayList<String>() {
        {
            add("js");
        }

    };

    /**
     * Pecorre a arvore gerada do codigo fonte
     *
     * @param file Arquivo a ser pecorrido
     * @throws IOException Erro de leitura do arquivo
     */
    @Override
    public void walkFileTree(File file) throws IOException {
        String code = readFile(file, Charset.forName("UTF-8"));
        JavaScriptLexer lexer = new JavaScriptLexer(new ANTLRInputStream(code));
        lexer.removeErrorListener(ConsoleErrorListener.INSTANCE);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        CommentsExtractor commentsExtractor = new CommentsExtractor();
        tokens.fill();
        commentsExtractor.getAllComments(tokens.getTokens(), JavaScriptLexer.COMMENTS_CHANNEL);

        JavaScriptParser parser = new JavaScriptParser(tokens);
        parser.removeErrorListener(ConsoleErrorListener.INSTANCE);
        ParserRuleContext tree = parser.program();
        ParseTreeWalker walker = new ParseTreeWalker();
        JavaScriptListener extractor = new JavaScriptListener(tokens);
        walker.walk(extractor, tree);
    }

    /**
     * Diz qual formato de arquivo da linguagem
     *
     * @return Formato do arquivo
     */
    @Override
    public ArrayList<String> languageFormat() {
        return languageExtensionList;
    }
}
