package edu.icet.controller;

import edu.icet.dto.Quiz;
import edu.icet.dto.QuizWord;
import edu.icet.dto.Word;
import edu.icet.service.QuizService;
import edu.icet.service.WordService;
import edu.icet.util.RandomNumberGenerator;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("quiz")
@RequiredArgsConstructor
public class QuizController {

    private final QuizService service;
    private final WordService wordservice;

    @GetMapping("/view-quiz/{id}")
    public Quiz getQuiz(@PathVariable String id) {
        return service.getQuiz(id);
    }

    @GetMapping("/view-quiz")
    public List<Quiz> getAll() {
        return service.getAll();
    }

    @GetMapping("/create-quiz/{playerid}")
    public Quiz createQuiz(@PathVariable String playerid){
        Quiz quiz = new Quiz("Q01",playerid, LocalDate.now(),"Nah",0,null);
        List<QuizWord> list = new ArrayList<>();
        List<Word> wordlist = wordservice.getAll();
        for (int i = 0; i < 2; i++) {
            int index = RandomNumberGenerator.getInstance().getNumber(wordlist.size());
            QuizWord quizword = new QuizWord(wordlist.get(i).getWord_id(),wordlist.get(i).getName(),wordlist.get(i).getPronunciation(),"NotCompleted");
            list.add(quizword);
        }
        quiz.setWords(list);
        return service.createQuiz(quiz);

    }
}
