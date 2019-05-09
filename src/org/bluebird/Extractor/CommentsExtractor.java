package org.bluebird.Extractor;

import org.antlr.v4.runtime.Token;
import org.bluebird.FileUtils.FileCreator;

import java.util.List;

public class CommentsExtractor {

    /**
     * Extrai todos comentarios do arquivo
     *
     * @param list     Lista de tokens
     * @param channel Canal dos comentarios
     */
    public void getAllComments(List<Token> list, int channel) {
        String comment;

        for (Token cmt : list) {
            if (cmt.getChannel() == channel) {
                comment = cmt.getText();
                FileCreator.appendToCommentsTokensFile(comment + "\n");
            }
        }
    }
}
