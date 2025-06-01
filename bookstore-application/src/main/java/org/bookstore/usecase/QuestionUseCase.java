package org.bookstore.usecase;


import org.bookstore.domain.Answer;
import org.bookstore.domain.Question;
import org.bookstore.domain.external.AddQuestionCommand;
import org.bookstore.repository.AnswerRepository;
import org.bookstore.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Controller
public class QuestionUseCase {

    @Autowired
    QuestionRepository questionRepository;

    @Autowired
    AnswerRepository answerRepository;

    public List<Question> getAll() {
        return StreamSupport.stream(questionRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    public Question addNew(AddQuestionCommand command) {
        Question saved = questionRepository.save(new Question(command.question()));
        List<Answer> answers = command.answers().stream().map(item -> new Answer(item, saved)).toList();
        List<Answer> savedAnswers = answerRepository.saveAll(answers);
        saved.setAnswers(savedAnswers);
        return saved;
    }

}
