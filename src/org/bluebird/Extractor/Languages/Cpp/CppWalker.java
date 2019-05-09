package org.bluebird.Extractor.Languages.Cpp;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.bluebird.Extractor.CommentsExtractor;
import org.bluebird.Extractor.LanguageWalker;
import org.bluebird.LanguagesUtils.Cpp.CppLexer;
import org.bluebird.LanguagesUtils.Cpp.CppParser;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

import static org.bluebird.FileUtils.FileBrowser.readFile;

public class CppWalker implements LanguageWalker {

    private ArrayList<String> languageExtensionList = new ArrayList<String>() {
        {
            add("cpp");
            add("h");
            add("cc");
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
        CppLexer lexer = new CppLexer(new ANTLRInputStream(code));
        lexer.removeErrorListener(ConsoleErrorListener.INSTANCE);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        CommentsExtractor commentsExtractor = new CommentsExtractor();
        tokens.fill();
        commentsExtractor.getAllComments(tokens.getTokens(), 4);

        CppParser parser = new CppParser(tokens);
        parser.removeErrorListener(ConsoleErrorListener.INSTANCE);
        ParserRuleContext tree = parser.translationunit();
        ParseTreeWalker walker = new ParseTreeWalker();
        CppListener extractor = new CppListener(tokens);
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
