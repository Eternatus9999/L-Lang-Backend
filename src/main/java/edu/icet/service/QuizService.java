package edu.icet.service;

import edu.icet.dto.Quiz;
import edu.icet.dto.QuizWord;
import edu.icet.entity.QuizWordEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuizService {

    Quiz getQuiz(long id);
    String createQuiz();

}
