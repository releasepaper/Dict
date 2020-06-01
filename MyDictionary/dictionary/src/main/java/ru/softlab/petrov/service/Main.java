package ru.softlab.petrov.service;

import ru.softlab.petrov.service.Generators.DictionaryGenerator;
import ru.softlab.petrov.service.Generators.DictionaryReader;

public class Main {

    public static void main(String[] args) throws DictionaryException {
        DictionaryCreationFactory factory = DictionaryCreationFactory.getInstance();
        DictionaryCreationFactory dcf = new DictionaryCreationFactory();
        DictionaryGenerator generator = new DictionaryGenerator();
      //  dcf.getDictionary(generator);
        DictionaryReader reader=new DictionaryReader();
        dcf.getDictionary(reader);

    }
}
