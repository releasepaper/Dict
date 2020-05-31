package ru.softlab.petrov.servicve;

import java.util.ArrayList;
import java.util.List;

public class Main {

 public static void main (String[] args) throws DictionaryException {
     String gentype ="random";
     DictionaryCreationFactory factory =DictionaryCreationFactory.getInstance(gentype);
     DictionaryCreationFactory dcf=new DictionaryCreationFactory();
     Randomizer randomizer=new Randomizer();
     Dictionary example=dcf.getDictionary(randomizer);
     List<Word> d=example.getWords();
     for(int i=0;i<d.size();i++){
         System.out.println(d.get(i).getNative());
     }
 }
}
