package edu.icet.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.dto.QuizWord;
import edu.icet.entity.QuizWordEntity;
import edu.icet.repository.QuizWordRepository;
import edu.icet.service.QuizWordService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Primary
@RequiredArgsConstructor
public class QuizWordServiceImpl implements QuizWordService {
    private final QuizWordRepository repository;
    private final ObjectMapper objectmapper;
    @Override
    public List<QuizWord> getQuizWord() {
        List<QuizWordEntity> list = repository.findAll();
        List<QuizWord> quizwordlist = new ArrayList<>();
        for (QuizWordEntity entity : list) {
            quizwordlist.add(objectmapper.convertValue(entity,QuizWord.class));
        }
        return quizwordlist;
    }
}
