package org.bluebird.Extractor.Languages.Php;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.bluebird.FileUtils.FileCreator;
import org.bluebird.LanguagesUtils.Php.PhpLexer;
import org.bluebird.LanguagesUtils.Php.PhpParser;
import org.bluebird.LanguagesUtils.Php.PhpParserBaseListener;

public class PhpListener extends PhpParserBaseListener {

    private BufferedTokenStream tokenStream;

    /**
     * Construtor do Listener da Linguagem PHP
     *
     * @param tokenStream Token Stream do Arquivo PHP
     */
    PhpListener(BufferedTokenStream tokenStream) {
        this.tokenStream = tokenStream;
    }

    private void countTokens(ParserRuleContext ctx) {
        for (Token token : this.tokenStream.getTokens(ctx.getStart().getTokenIndex(), ctx.getStop().getTokenIndex())) {
            if(token.getChannel() != PhpLexer.PhpComments && token.getChannel() != PhpLexer.HIDDEN) {
                if(!(token.getText().equals("<EOF>"))) {
                    FileCreator.appendToCodeTokensFile(token.getText() + "\n");
                }
            }
        }
    }

    @Override
    public void enterHtmlDocument(PhpParser.HtmlDocumentContext ctx) {
        try {
            countTokens(ctx);
        } catch (NullPointerException e) {

        }
    }
}
