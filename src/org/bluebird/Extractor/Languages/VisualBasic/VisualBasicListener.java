package org.bluebird.Extractor.Languages.VisualBasic;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.bluebird.FileUtils.FileCreator;
import org.bluebird.LanguagesUtils.VisualBasic.VisualBasicBaseListener;
import org.bluebird.LanguagesUtils.VisualBasic.VisualBasicLexer;
import org.bluebird.LanguagesUtils.VisualBasic.VisualBasicParser;

public class VisualBasicListener extends VisualBasicBaseListener {

    private BufferedTokenStream tokenStream;
    private final int COMMENTS_CHANNEL = 4;

    /**
     * Construtor do Listener da Linguagem Visual Basic
     *
     * @param tokenStream Token Stream do Arquivo Visual Basic
     */
    VisualBasicListener(BufferedTokenStream tokenStream) {
        this.tokenStream = tokenStream;
    }

    private void countTokens(ParserRuleContext ctx) {
        for (Token token : this.tokenStream.getTokens(ctx.getStart().getTokenIndex(), ctx.getStop().getTokenIndex())) {
            if(token.getChannel() != COMMENTS_CHANNEL && token.getChannel() != VisualBasicLexer.HIDDEN) {
                if(!(token.getText().equals("<EOF>"))) {
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


    @Override
    public void enterStartRule(VisualBasicParser.StartRuleContext ctx) {
        countLines(ctx);
        countTokens(ctx);
    }
}
