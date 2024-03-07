package org.acme;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("/hellofromconsumer")
public class GreetingResource {

    @Inject
    @RestClient
    ProducerService ps;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return ps.getHello();
    }
}
