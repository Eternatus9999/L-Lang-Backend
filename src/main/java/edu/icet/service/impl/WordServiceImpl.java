package edu.icet.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.dto.Word;
import edu.icet.entity.WordEntity;
import edu.icet.repository.WordRepository;
import edu.icet.service.WordService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Primary
@RequiredArgsConstructor
public class WordServiceImpl implements WordService {

    final WordRepository repository;
    final ObjectMapper objectmapper;

    @Override
    public boolean addword(Word word) {
        if(repository.save(objectmapper.convertValue(word, WordEntity.class))!=null){
            return true;
        }
        return false;
    }

    @Override
    public Word getwordbyName(String name) {
        return objectmapper.convertValue(repository.findByName(name), Word.class);
    }

    public Word getwordbyId (String id){
        return objectmapper.convertValue(repository.findById(id), Word.class);
    }

    @Override
    public List<Word> getAll() {
        List<WordEntity> list = repository.findAll();
        List<Word> wordlist = new ArrayList<>();
        for (WordEntity entity : list) {
            wordlist.add(objectmapper.convertValue(entity, Word.class));
        }
        return wordlist;
    }

}
