package edu.icet.service;

import edu.icet.dto.Quiz;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuizService {

    Quiz getQuiz(String id);
    Quiz createQuiz(Quiz quiz);
    List<Quiz> getAll();
    boolean updateQuiz(Quiz quiz);
    boolean removeQuiz(String id);

}
