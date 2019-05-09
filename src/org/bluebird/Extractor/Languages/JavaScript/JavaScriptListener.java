package org.bluebird.Extractor.Languages.JavaScript;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.bluebird.FileUtils.FileCreator;
import org.bluebird.LanguagesUtils.JavaScript.JavaScriptLexer;
import org.bluebird.LanguagesUtils.JavaScript.JavaScriptParser;
import org.bluebird.LanguagesUtils.JavaScript.JavaScriptParserBaseListener;

public class JavaScriptListener extends JavaScriptParserBaseListener {

    private BufferedTokenStream tokenStream;

    /**
     * Construtor do Listener da Linguagem JS
     *
     * @param tokenStream Token Stream do Arquivo JS
     */
    JavaScriptListener(BufferedTokenStream tokenStream) {
        this.tokenStream = tokenStream;
    }

    private void countTokens(ParserRuleContext ctx) {
        for (Token token : this.tokenStream.getTokens(ctx.getStart().getTokenIndex(), ctx.getStop().getTokenIndex())) {
            if(token.getChannel() != JavaScriptLexer.COMMENTS_CHANNEL && token.getChannel() != JavaScriptLexer.HIDDEN) {
                if(!(token.getText().equals("<EOF>"))) {
                    FileCreator.appendToCodeTokensFile(token.getText() + "\n");
                }
            }
        }
    }

    /**
     * Inicia a extração do arquivo JS e pega todos comentarios do arquivo
     *
     * @param ctx Entidade da Parser Tree
     */
    @Override
    public void enterProgram(JavaScriptParser.ProgramContext ctx) {
        countTokens(ctx);
    }
}
