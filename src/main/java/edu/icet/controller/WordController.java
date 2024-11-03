package edu.icet.controller;

import edu.icet.dto.Word;
import edu.icet.service.WordService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/word")
@RequiredArgsConstructor
@Slf4j
public class WordController {
    final WordService service;

    @PostMapping("/add-word")
    public String addWord(@RequestBody Word word){
        if(service.addword(word)){
            return "Word Added Successfully";
        }
        return "Word didn't added Successfully";
    }

    @GetMapping("/get-word-id/{id}")
    public Word getWordById(@PathVariable long id){
        return service.getwordbyId(id);
    }
    @GetMapping("/get-word-name/{word}")
    public Word getWordByName(@PathVariable String word){
        return service.getwordbyName(word);
    }
    @GetMapping
    public List<Word> getAll(){
        return service.getAll();
    }
    @PostMapping("/add-all")
    public String addAll(@RequestBody List<Word> list){
        for (Word word : list) {
            service.addword(word);
        }
        return "Words Added Successfully";
    }
}
