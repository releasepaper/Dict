package ru.softlab.petrov.service.Generators;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ru.softlab.petrov.service.*;
import ru.softlab.petrov.service.Reader;

public class DictionaryReader implements Reader {
    private static Long wid=1L;
    public Dictionary read() throws DictionaryException {
        JSONParser parser = new JSONParser();
        try {
           Object obj = parser.parse(new FileReader("./src/main/java/ru/softlab/petrov/service/Example.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONObject dicJson=(JSONObject) jsonObject.get("Dictionary");
            long id = (Long) dicJson.get("id");
            String languageType=(String) dicJson.get("languageType");
            JSONObject userFields= (JSONObject) dicJson.get("user");
            String firstname= (String) userFields.get("firstname");
            String surname= (String) userFields.get("surname");
            String login= (String) userFields.get("login");
            String password= (String) userFields.get("password");
            long userId = (Long) userFields.get("id");
            JSONArray words=(JSONArray) dicJson.get("words");
            List<Word> temp=new LinkedList<Word>();
            if (words!=null) {
                Iterator<JSONObject> i = words.iterator();
                while (i.hasNext()) {
                    JSONObject w = i.next();
                    String Native = (String) w.get("native");
                    String Translation = (String) w.get("translation");
                    String Transcription = (String) w.get("transcription");
                    Word word=new Word();
                    word.setId(wid++);
                    word.setNative(Native);
                    word.setTranslation(Translation);
                    word.setTranscription(Transcription);
                    temp.add(word);
                }
            }
            User user=new User(login,password,surname,firstname);
            user.setId(userId);
            Dictionary dic=new Dictionary();
            dic.setWords(temp);
            dic.setUser(user);
            dic.setId(id);
            dic.setLanguageType(LanguageType.valueOf(languageType));
            dic.ViewDictionary();
        } catch (FileNotFoundException e) {
            throw new DictionaryException(e);
        } catch (IOException e) {
            throw new DictionaryException(e);
        } catch (ParseException e) {
            throw new DictionaryException(e);
        }
        return null;
    }
}
