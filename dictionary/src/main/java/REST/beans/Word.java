package REST.beans;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *  A simple descriptor class for a Word object.
 */
@XmlRootElement(name = "word")
public class Word {
    private String word;
    private String definition;

    /**
     *  Empty constructor for the Word class.
     */
    public Word(){}


    /**
     *  Constructor for the Word class.
     *
     *  @param word The actual word.
     *  @param definition The definition associated with it and that will be dumped inside the
     *  dictionary.
     */
    public Word(String word, String definition){
        this.word = word;
        this.definition = definition;
    }

    /**
     *  Getter for the word attribute.
     *
     *  @return Word attribute.
     */
    public String getWord() {
        return word;
    }

    /**
     *  Getter for the definition attribute.
     *
     *  @return Definition attribute.
     */
    public String getDefinition() {
        return definition;
    }
}
