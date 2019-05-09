package org.bluebird.Extractor.Languages.Java;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.bluebird.FileUtils.FileCreator;
import org.bluebird.LanguagesUtils.Java.JavaLexer;
import org.bluebird.LanguagesUtils.Java.JavaParser;
import org.bluebird.LanguagesUtils.Java.JavaParserBaseListener;


public class JavaListener extends JavaParserBaseListener {


    private BufferedTokenStream tokenStream;

    JavaListener(BufferedTokenStream tokenStream) {
        this.tokenStream = tokenStream;
    }

    private void countTokens(ParserRuleContext ctx) {
        for (Token token : this.tokenStream.getTokens(ctx.getStart().getTokenIndex(), ctx.getStop().getTokenIndex())) {
            if(token.getChannel() != JavaLexer.COMMENTS_CHANNEL && token.getChannel() != JavaLexer.HIDDEN) {
                if(!(token.getText().equals("<EOF>"))) {
                    FileCreator.appendToCodeTokensFile(token.getText() + "\n");
                }
            }
        }
    }

    /**
     * Inicia a extração do arquivo Java e pega todos comentarios do arquivo
     *
     * @param ctx Entidade da Parser Tree
     */
    public void enterCompilationUnit(JavaParser.CompilationUnitContext ctx) {
        countTokens(ctx);
    }
}
