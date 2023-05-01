package REST.services;

import REST.beans.Vocabulary;
import REST.beans.Word;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("dictionary")
public class DictionaryService {

    @Path("get/{word}")
    @GET
    public Response getDefinition(@PathParam("word") String word){
        if(Vocabulary.getInstance().findWord(word)){
            return Response.ok(Vocabulary.getInstance().getDefinition(word)).build();
        }
        return Response.noContent().build();
    }

    @GET
    public Response heartBeat(){
        return Response.ok("Sono vivo").build();
    }

    @Path("new")
    @POST
    @Consumes({"application/json", "application/xml"})
    public Response addWord(Word word){
        return Response.ok(Vocabulary.getInstance().addWord(word)).build();
    }

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
