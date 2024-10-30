package edu.icet.service;

import edu.icet.dto.Word;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WordService {

    boolean addword(Word word);

    Word getwordbyId (String id);

    Word getwordbyName (String name);

    List<Word> getAll();
}
