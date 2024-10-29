package edu.icet.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.dto.Quiz;
import edu.icet.dto.QuizWord;
import edu.icet.repository.QuizRepository;
import edu.icet.service.QuizService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
@AllArgsConstructor
public class QuizServiceImpl implements QuizService {

    private final QuizRepository repository;
    private final ObjectMapper objectmapper;

    @Override
    public Quiz getQuiz(long id) {
        return objectmapper.convertValue(repository.findById(id),Quiz.class);
    }

    @Override
    public String createQuiz() {

        return "" ;
    }
}
