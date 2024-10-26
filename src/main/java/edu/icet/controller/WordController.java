package edu.icet.controller;

import edu.icet.dto.Word;
import edu.icet.service.WordService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/word")
@RequiredArgsConstructor
@Slf4j
public class WordController {
    final WordService service;

    @PostMapping("/add-word")
    public String AddWord(@RequestBody Word word){
        if(service.addword(word)){
            return "Word Added Successfully";
        }
        return "Word didn't added Successfully";
    }
    @GetMapping("/get-word/{id}")
    public Word GetWord(@PathVariable String id){
        return service.getword(Long.parseLong(id));
    }
}