package edu.icet.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.dto.Quiz;
import edu.icet.entity.QuizEntity;
import edu.icet.repository.QuizRepository;
import edu.icet.service.QuizService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public Quiz createQuiz(Quiz quiz) {
        repository.save(objectmapper.convertValue(quiz, QuizEntity.class));
        return quiz;
    }

    @Override
    public List<Quiz> getAll() {
        List<QuizEntity> entitylist = repository.findAll();
        List<Quiz> quizlist = new ArrayList<>();
        for (QuizEntity entity : entitylist) {
            quizlist.add(objectmapper.convertValue(entity, Quiz.class));
        }
        return quizlist;
    }

    @Override
    public boolean updateQuiz(Quiz quiz) {
        repository.save(objectmapper.convertValue(quiz, QuizEntity.class));
        return true;
    }

    @Override
    public boolean removeQuiz(long id) {
        repository.delete(repository.getReferenceById(id));
        return true;
    }
}
