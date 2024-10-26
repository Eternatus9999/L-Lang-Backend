package edu.icet.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.dto.Word;
import edu.icet.entity.WordEntity;
import edu.icet.repository.WordRepository;
import edu.icet.service.WordService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

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
    public Word getword (long id){
        return objectmapper.convertValue(repository.findById(id), Word.class);
    }
}
