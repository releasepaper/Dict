package ru.softlab.petrov.service;


import ru.softlab.petrov.service.Generators.DictionaryGenerator;
import ru.softlab.petrov.service.Generators.DictionaryReader;

class DictionaryCreationFactory  {
    private static DictionaryCreationFactory instance = new DictionaryCreationFactory();

    public static DictionaryCreationFactory getInstance()  {
            if (instance==null) {
                    instance=new DictionaryCreationFactory();
            }
            return instance;
    }

    public Dictionary getDictionary(DictionaryGenerator generator) {
        return generator.generate();
    }

    public Dictionary getDictionary(DictionaryReader reader) throws DictionaryException {
        return reader.read();
    }
}

