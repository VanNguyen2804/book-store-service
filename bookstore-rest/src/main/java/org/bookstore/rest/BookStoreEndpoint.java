package org.bookstore.rest;

import org.bookstore.dto.QuestionDTO;
import org.bookstore.dto.QuestionInput;
import org.bookstore.mapper.QuestionMapper;
import org.bookstore.usecase.QuestionUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookStoreEndpoint {

    @Autowired
    QuestionUseCase useCase;

    @Autowired
    QuestionMapper mapper;

    @GetMapping("/questions")
    public List<QuestionDTO> getAll() {
        return mapper.mapList(useCase.getAll());
    }

    @PostMapping("/questions")
    public QuestionDTO addQuestion(@RequestBody QuestionInput questionInput) {
        return mapper.map(useCase.addNew(mapper.map(questionInput)));
    }

    @PostMapping(path = "/questions/generate")
    public List<QuestionDTO> generate(@RequestBody String text) {
        return new ArrayList<>();
    }
}
