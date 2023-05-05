package REST.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.*;

@XmlRootElement(name = "vocabulary")
public class Vocabulary {
    private Map<String, String> dictionary;
    private static Vocabulary instance;

    private Vocabulary(){
        dictionary = new HashMap<String, String>();
    }

    public synchronized static Vocabulary getInstance() {
        if(instance == null){
            instance = new Vocabulary();
        }
        return instance;
    }

    public synchronized String addWord(Word word){
        if(dictionary.putIfAbsent(word.getWord(), word.getDefinition()) == null){
            return "The element was added correctly";
        }
        return "The element is already present in the dictionary";
    }

    public synchronized String getDefinition(String word){
        return dictionary.get(word);
    }

    public synchronized Boolean findWord(String word){
        return dictionary.containsKey(word);
    }

    public synchronized void changeDefinition(Word word){
        dictionary.put(word.getWord(), word.getDefinition());
    }

    public synchronized void deleteWeord(String word){
        dictionary.remove(word);
    }
}
