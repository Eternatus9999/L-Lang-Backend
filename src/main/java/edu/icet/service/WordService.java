package edu.icet.service;

import edu.icet.dto.Word;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WordService {

    boolean addword(Word word);

    Word getwordbyId (long id);

    Word getwordbyName (String id);

    List<Word> getAll();
}
