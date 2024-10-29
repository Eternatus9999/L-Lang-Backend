package edu.icet.controller;

import edu.icet.dto.Quiz;
import edu.icet.service.QuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("quiz")
@RequiredArgsConstructor
public class QuizController {

    private final QuizService service;
    @GetMapping("/view-quiz/{id}")
        public Quiz getQuiz(@PathVariable long id){
            return service.getQuiz(id);
    }
}
