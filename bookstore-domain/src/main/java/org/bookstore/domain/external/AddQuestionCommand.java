package org.bookstore.domain.external;

import java.util.List;

public record AddQuestionCommand(
        String question,
        List<String> answers
) {

}
