package edu.icet.controller;

import edu.icet.dto.QuizWord;
import edu.icet.dto.Word;
import edu.icet.service.QuizWordService;
import edu.icet.service.WordService;
import edu.icet.util.RandomNumberGenerator;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("quiz-word")
public class QuizWordController {

    private final WordService wordService;
    private final QuizWordService quizwordService;

    @GetMapping("/get-quiz-word-list")
    public List<QuizWord> getAll() {
        List<QuizWord> list = new ArrayList<>();
        List<Word> wordlist = wordService.getAll();
        int size = quizwordService.getAll().size();
        for (int i = 0; i < 10; i++) {
            int index = RandomNumberGenerator.getInstance().getNumber(wordlist.size());
            QuizWord quizword = new QuizWord(size + i, wordlist.get(index).getName(), wordlist.get(index).getPronunciation(), "NotCompleted", null);
            list.add(quizword);
            quizwordService.addQuizWord(quizword);
        }
        return list;
    }
    @GetMapping("/get-quiz-word-list/{id}")
    public QuizWord getwordlist(@PathVariable String id) {
        return quizwordService.getQuizWord(Long.parseLong(id));
    }
    @PutMapping("/update-quiz-word-list")
    public String updateQuiz(@RequestBody List<QuizWord> quizword){
        String s = "";
        for (QuizWord quizWord : quizword) {
            s = quizwordService.updateQuizWord(quizWord);
        }
        return s;
    }
}
