package REST.services;

import REST.beans.Vocabulary;
import REST.beans.Word;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/**
 *  REST class associated with the dictionary service.
 */
@Path("dictionary")
public class DictionaryService {

    /**
     *  GET endpoint.
     *
     *  @param word The word we want to get the definition for.
     *  @return HTTP response.
     */
    @Path("get/{word}")
    @GET
    public Response getDefinition(@PathParam("word") String word){
        if(Vocabulary.getInstance().findWord(word)){
            return Response.ok(Vocabulary.getInstance().getDefinition(word)).build();
        }
        return Response.noContent().build();
    }

    /**
     *  Debugging GET enpdpoint.
     *
     *  @return HTTP response.
     */
    @GET
    public Response heartBeat(){
        return Response.ok("Sono vivo").build();
    }

    /**
     *  POST endpoint. This is used to upload a new word.
     *
     *  @param word This is the word we want to add to the system (it contains both the key and the
     *  value for the dictionary)/
     *  @return HTTP response.
     *  @see Word
     */
    @Path("new")
    @POST
    @Consumes({"application/json", "application/xml"})
    public Response addWord(Word word){
        return Response.ok(Vocabulary.getInstance().addWord(word)).build();
    }

    /**
     *  POST endpoint. This is used to change a word, probably it would be better suited as a PUT
     *  endpoint because we are not posting something to the server but we are updating the data
     *  structure.
     *
     *  @param word The word we want to change.
     *  @return HTTP response.
     */
    @Path("change")
    @POST
    @Consumes({"application/json", "application/xml"})
    public Response changeDefinition(Word word){
        if(Vocabulary.getInstance().findWord(word.getWord())){
            Vocabulary.getInstance().changeDefinition(word);
            return Response.ok("Data was successfully replaced").build();
        }
        else{
            return Response.notModified("The word was not modified").build();
        }
    }

    /**
     *  DELETE endpoint.
     *
     *  @param word The word that we want to delete from the dictionary.
     *  @return HTTP response.
     */
    @Path("remove/{word}")
    @DELETE
    public Response deleteWord(@PathParam("word") String word){
        if(Vocabulary.getInstance().findWord(word)){
            Vocabulary.getInstance().deleteWord(word);
            return Response.ok("Data was successfully removed").build();
        }
        return Response.noContent().entity("There is no data associated with " + word).build();
    }
}
