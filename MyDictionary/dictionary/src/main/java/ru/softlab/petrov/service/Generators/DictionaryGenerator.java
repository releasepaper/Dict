package ru.softlab.petrov.service.Generators;

import ru.softlab.petrov.service.*;

import java.util.List;
import java.util.Random;

public class DictionaryGenerator implements ru.softlab.petrov.service.DictionaryGenerator {
    private Random rnd = new Random();
    private int DicId;
    private static final int length=10;
    private static Long windex=1l;
    private static final String charsets[]={
            "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ",
            "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ"
    };
    private String rndStringGenerator(String letters) {
        StringBuilder builder = new StringBuilder();
        int curLength=1+rnd.nextInt(length);
        builder.append(letters.charAt(rnd.nextInt(52)));
        for (int i = 1; i < curLength; ++i) {
            builder.append(letters.charAt(rnd.nextInt(letters.length())));
        }
        return builder.toString();
    }

    private User generateUser() {
        User user=new User(
                rndStringGenerator(charsets[0]),
                rndStringGenerator(charsets[0]),
                rndStringGenerator(charsets[0]),
                rndStringGenerator(charsets[0]));
        user.setId(rnd.nextLong());
        return user;
    }


    private Word generateWord(LanguageType type) {
        Word word = new Word(
                rndStringGenerator(charsets[type.ordinal()]), //Navtive
                rndStringGenerator(charsets[1]), //Translation
                rndStringGenerator(charsets[type.ordinal()]) //Transcription
        );
        word.setId(windex++);
        return word;
    }

    public Dictionary generate() {
        rnd.setSeed(System.currentTimeMillis());
        DicId=rnd.nextInt(10);
        Dictionary dic=new Dictionary();
        dic.setId(rnd.nextLong());
         dic.setUser(generateUser());
        dic.setLanguageType(LanguageType.values()[rnd.nextInt(LanguageType.values().length)]);
        for (int i = 0; i < 1+rnd.nextInt(20); ++i) {
            dic.addWord(generateWord(dic.getLanguageType()));
        }
        List<Word> w=dic.getWords();
        for(int i=0;i<w.size();i++){
            System.out.println(w.get(i).getNative());
        }
        return dic;
    }
}
