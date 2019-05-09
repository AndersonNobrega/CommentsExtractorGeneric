package org.bluebird.Extractor.Languages.Cpp;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.bluebird.FileUtils.FileCreator;
import org.bluebird.LanguagesUtils.Cpp.CppBaseListener;
import org.bluebird.LanguagesUtils.Cpp.CppLexer;
import org.bluebird.LanguagesUtils.Cpp.CppParser;

public class CppListener extends CppBaseListener {

    private BufferedTokenStream tokenStream;
    private final int COMMENTS_CHANNEL = 4;

    /**
     * Construtor do Listener da Linguagem C++
     *
     * @param tokenStream Token Stream do Arquivo C++
     */
    CppListener(BufferedTokenStream tokenStream) {
        this.tokenStream = tokenStream;
    }

    private void countTokens(ParserRuleContext ctx) {
        for (Token token : this.tokenStream.getTokens(ctx.getStart().getTokenIndex(), ctx.getStop().getTokenIndex())) {
            if(token.getChannel() != COMMENTS_CHANNEL && token.getChannel() != CppLexer.HIDDEN) {
                if(!(token.getText().equals("<EOF>"))) {
                    FileCreator.appendToCodeTokensFile(token.getText() + "\n");
                }
            }
        }
    }

    @Override
    public void enterTranslationunit(CppParser.TranslationunitContext ctx) {
        countTokens(ctx);
    }
}
