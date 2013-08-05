package no.mesan.timereg.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Eksempel på rest-tjeneste.
 */
@Path("/")
public class HelloWorld {

    private static final Logger LOG = LoggerFactory.getLogger(HelloWorld.class);

    @GET
    @Path("/helloworld")
    public String helloWorld() {
        return "Hello world!";
    }

    @POST
    @Path("/logg")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response loggPost(final Loggstreng loggstreng) {
        LOG.info("Fikk: " + loggstreng.getLoggstreng());
        return Response.ok().build();
    }
}
