package com.javaelite;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("Starwars")
@Produces(MediaType.APPLICATION_JSON)
public class StarWarResource {

    @RestClient
    StarWarsService starWarsService;

    @GET
    @Path("starships")
    public String getStarships() {
        return starWarsService.getstarships();
    }
}
