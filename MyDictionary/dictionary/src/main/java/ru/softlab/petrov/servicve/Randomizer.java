package ru.softlab.petrov.servicve;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Randomizer {


    public Dictionary builder() {
        Dictionary dic = new Dictionary();
        dic.setWords(CreateWords());
        return dic;
    }

    protected List <Word> CreateWords() {
        String generatedString = RandomExample.generateRandomString(7);
        Word word=new Word();
        word.setNative(generatedString);
        word.setTranscription(generatedString);
        word.setTranslation(generatedString);
        List <Word> wordList = new ArrayList ();
        int i=0;
        Random ran = new Random();
        int j=1+(ran.nextInt(10));
        while (i<j) {
            generatedString = RandomExample.generateRandomString(7);
            word.setNative(generatedString);
            word.setTranscription(generatedString);
            word.setTranslation(generatedString);
            wordList.add(word);
            i++;
        }
        return wordList;
    }
}
