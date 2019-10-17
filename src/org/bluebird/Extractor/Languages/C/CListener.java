package org.bluebird.Extractor.Languages.C;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.bluebird.FileUtils.FileCreator;
import org.bluebird.LanguagesUtils.C.CBaseListener;
import org.bluebird.LanguagesUtils.C.CLexer;
import org.bluebird.LanguagesUtils.C.CParser;

public class CListener extends CBaseListener {

    private final int COMMENTS_CHANNEL = 4;
    private BufferedTokenStream tokenStream;

    /**
     * Construtor do Listener da Linguagem C
     *
     * @param tokenStream Token Stream do Arquivo C
     */
    CListener(BufferedTokenStream tokenStream) {
        this.tokenStream = tokenStream;
    }

    private void countTokens(ParserRuleContext ctx) {
        for (Token token : this.tokenStream.getTokens(ctx.getStart().getTokenIndex(), ctx.getStop().getTokenIndex())) {
            if (token.getChannel() != COMMENTS_CHANNEL && token.getChannel() != CLexer.HIDDEN) {
                if (!(token.getText().equals("<EOF>"))) {
                    FileCreator.appendToCodeTokensFile(token.getText() + "\n");
                }
            }
        }
    }

    private void countLines(ParserRuleContext ctx) {
        for (Token token : this.tokenStream.getTokens(ctx.getStart().getTokenIndex(), ctx.getStop().getTokenIndex())) {
            if(token.getChannel() != COMMENTS_CHANNEL) {
                if(!(token.getText().equals("<EOF>"))) {
                    FileCreator.appendToCodeLineFile(token.getText());
                }
            }
        }
    }

    /**
     * Inicia a extração do arquivo C e pega todos comentarios do arquivo
     *
     * @param ctx Entidade da Parser Tree
     */
    @Override
    public void enterCompilationUnit(CParser.CompilationUnitContext ctx) {
        countLines(ctx);
        countTokens(ctx);
    }
}
