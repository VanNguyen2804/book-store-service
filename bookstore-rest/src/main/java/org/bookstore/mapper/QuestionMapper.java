package org.bookstore.mapper;

import org.bookstore.domain.Question;
import org.bookstore.domain.external.AddQuestionCommand;
import org.bookstore.dto.AnswerDTO;
import org.bookstore.dto.QuestionDTO;
import org.bookstore.dto.QuestionInput;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QuestionMapper {
    public AddQuestionCommand map(QuestionInput input) {
        return new AddQuestionCommand(input.question(), input.answers());
    }

    public QuestionDTO map(Question question) {
        return new QuestionDTO(question.getQuestion(), question.getAnswers().stream().map(item -> new AnswerDTO(item.getAnswer())).toList());
    }

    public List<QuestionDTO> mapList(List<Question> questions) {
        return questions.stream().map(this::map).toList();
    }
}
