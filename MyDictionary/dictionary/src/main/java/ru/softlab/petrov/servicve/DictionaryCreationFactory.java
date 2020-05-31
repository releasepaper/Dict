package ru.softlab.petrov.servicve;


class DictionaryCreationFactory {
    private static DictionaryCreationFactory instance = null;

    public Dictionary getDictionary(Randomizer  rn) throws DictionaryException {
        return rn.builder();
    }

    public Dictionary getDictionary(DictionaryReader dicreader) {
        return dicreader.reader();
    }

    public static DictionaryCreationFactory getInstance(String ct) throws DictionaryException {
            if (instance==null) {
                    instance=new DictionaryCreationFactory();
            }
            return instance;
    }
}

