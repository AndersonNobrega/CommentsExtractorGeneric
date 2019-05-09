package org.bluebird.Extractor.Languages.CSharp;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.bluebird.FileUtils.FileCreator;
import org.bluebird.LanguagesUtils.CSharp.CSharpLexer;
import org.bluebird.LanguagesUtils.CSharp.CSharpParser;
import org.bluebird.LanguagesUtils.CSharp.CSharpParserBaseListener;

public class CSharpListener extends CSharpParserBaseListener {

    private BufferedTokenStream tokenStream;

    /**
     * Construtor do Listener da Linguagem C#
     *
     * @param tokenStream Token Stream do Arquivo C#
     */
    CSharpListener(BufferedTokenStream tokenStream) {
        this.tokenStream = tokenStream;
    }

    private void countTokens(ParserRuleContext ctx) {
        for (Token token : this.tokenStream.getTokens(ctx.getStart().getTokenIndex(), ctx.getStop().getTokenIndex())) {
            if(token.getChannel() != CSharpLexer.COMMENTS_CHANNEL && token.getChannel() != CSharpLexer.HIDDEN) {
                if(!(token.getText().equals("<EOF>"))) {
                    FileCreator.appendToCodeTokensFile(token.getText() + "\n");
                }
            }
        }
    }

    /**
     * Inicia a extração do arquivo C# e pega todos comentarios do arquivo
     *
     * @param ctx Entidade da Parser Tree
     */
    @Override
    public void enterCompilation_unit(CSharpParser.Compilation_unitContext ctx) {
        countTokens(ctx);
    }
}
