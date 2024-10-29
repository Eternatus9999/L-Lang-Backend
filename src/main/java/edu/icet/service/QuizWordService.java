package edu.icet.service;

import edu.icet.dto.QuizWord;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface QuizWordService {
    List<QuizWord> getAll();
    QuizWord getQuizWord(Long id);
    String updateQuizWord(QuizWord quizword);
    void addQuizWord(QuizWord quizWord);
}
