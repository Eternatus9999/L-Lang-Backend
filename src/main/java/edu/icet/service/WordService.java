package edu.icet.service;

import edu.icet.dto.Word;
import org.springframework.stereotype.Service;

@Service
public interface WordService {

    boolean addword(Word word);
    Word getword (long id);
}
