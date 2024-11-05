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
    public Quiz getQuiz(@PathVariable long id) {
        return service.getQuiz(id);
    }

    @GetMapping("/view-quiz")
    public List<Quiz> getAll() {
        return service.getAll();
    }

    @GetMapping("/create-quiz/{playerid}")
    public Quiz createQuiz(@PathVariable String playerid){
        Quiz quiz = new Quiz(GenerateId(),playerid, LocalDate.now(),"Nah",0,null);
        List<QuizWord> list = new ArrayList<>();
        List<Word> wordlist = wordservice.getAll();
        for (int i = 0; i < 10; i++) {
            int index = RandomNumberGenerator.getInstance().getNumber(wordlist.size());
            QuizWord quizword = new QuizWord(wordlist.get(index).getWord_id(),wordlist.get(index).getName(),wordlist.get(index).getPronunciation(),"NotCompleted");
            wordlist.remove(index);
            list.add(quizword);
        }
        quiz.setWords(list);
        return quiz;

    }
    @GetMapping("/get-quiz-by-player/{player_id}")
    public List<Quiz> filterby(@PathVariable String player_id){
        return service.filterby(player_id);
    }

    @PostMapping("/add-quiz")
    public Quiz createQuiz(@RequestBody Quiz quiz){
        return service.createQuiz(quiz);

    }

    @DeleteMapping("/delete-quiz/{id}")
    public boolean deleteQuiz(@PathVariable long id){
        return service.removeQuiz(id);
    }

    private String GenerateId(){
        List<Quiz> list = service.getAll();

        if(list.size()!=0){
            list.sort((obj1,obj2) -> {
                int id1 = Integer.parseInt(obj1.getQuiz_id().split("Q")[1]);
                int id2 = Integer.parseInt(obj2.getQuiz_id().split("Q")[1]);
                return Integer.compare(id1, id2);
            });
            return "Q"+(Integer.parseInt(list.get(list.size()-1).getQuiz_id().split("Q")[1])+1);
        }
        return "Q1";
    }
}
