package org.bookstore.dto;

import java.util.List;

public record QuestionInput(
        String question,
        List<String> answers
) {

}
