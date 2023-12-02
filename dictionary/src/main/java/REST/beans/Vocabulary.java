package REST.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.*;

/**
 *  Vocabulary class for the REST exercise, the vocabulary is seen as a Map between Strings, each
 *  word is a key and the value associated with it is the definition.
 *  The class is a Singleton.
 */
@XmlRootElement(name = "vocabulary")
public class Vocabulary {
    private Map<String, String> dictionary;
    private static Vocabulary instance;

    /**
     *  Constructor for the vocabulary class.
     */
    private Vocabulary(){
        dictionary = new HashMap<String, String>();
    }

    /**
     *  Singleton implementation, it is synchronized to make it thread-safe.
     *
     *  @return Instance of the class.
     */
    public synchronized static Vocabulary getInstance() {
        if(instance == null){
            instance = new Vocabulary();
        }
        return instance;
    }

    /**
     *  Method to add a word to the dictionary structure. It's synchronized to make it thread-safe
     *  since it's a write operation.
     *
     *  @param word The word that should be added to the dictionary.
     *  @return A String explaining the result of the process.
     */
    public synchronized String addWord(Word word){
        if(dictionary.putIfAbsent(word.getWord(), word.getDefinition()) == null){
            return "The element was added correctly";
        }
        return "The element is already present in the dictionary";
    }

    /**
     *  Resolver for the definition associated with a word. It's synchronized but I doubt it's
     *  necessary in this case.
     *
     *  @param word The word we want to resolve inside the dictionary.
     *  @return The definition associated with the word.
     */
    public synchronized String getDefinition(String word){
        return dictionary.get(word);
    }

    /**
     *  Method that states whether a function is inside of the dictionary or not. The method is
     *  synchronized but I doubt it's necessary in this case.
     *
     *  @param word The word we want to check for existence.
     *  @return A Boolean stating whether the word is inside the dictionary or not.
     */
    public synchronized Boolean findWord(String word){
        return dictionary.containsKey(word);
    }

    /**
     *  Method that changes the definition associated with a word. The method is synchronized to
     *  make the write operation thread-safe.
     *
     *  @param word The word whose definition I want changed.
     */
    public synchronized void changeDefinition(Word word){
        dictionary.put(word.getWord(), word.getDefinition());
    }

    /**
     *  Method that deletes a word from the dictionary. The method has to be synchronized to be
     *  thread-safe during the read process.
     *
     *  @param word The word that we want to delete from the dictionary.
     */
    public synchronized void deleteWord(String word){
        dictionary.remove(word);
    }
}
