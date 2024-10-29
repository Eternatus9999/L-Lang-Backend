package edu.icet.util;

import edu.icet.dto.QuizWord;
import edu.icet.dto.Word;
import edu.icet.service.QuizWordService;
import edu.icet.service.WordService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class QuizCreator {
    @Autowired
    private  WordService wordService;
    @Autowired
    private  QuizWordService quizwordService;

    public List<QuizWord> getwordlist(){
        List<QuizWord> list = new ArrayList<>();
        List<Word> wordlist = wordService.getAll();
        int size = quizwordService.getQuizWord().size();
        for (int i = 0; i < 10; i++) {
            int index = RandomNumberGenerator.getInstance().getNumber(wordlist.size());
            list.add(new QuizWord(size+i,wordlist.get(index).getName(),wordlist.get(index).getPronunciation(),"NotCompleted",null));
        }
        return list;
    }
}
