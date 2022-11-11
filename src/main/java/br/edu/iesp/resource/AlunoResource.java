package br.edu.iesp.resource;

import br.edu.iesp.model.Produto;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@Path("/aluno")
public class AlunoResource {

    @GET
    public String nome(){
        return "Gustavo Morais";
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String retorno() {
        return "teste";
    }
}
