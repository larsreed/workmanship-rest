package no.mesan.timereg.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Eksempel på rest-tjeneste.
 */
/* Hvis man ikke har brukt Jersey-annotasjoner før,en kjapp crash-course(se også testklasse):

@Path - angir hvilken url en metode håndterer. Denne settes da sammen av:
 * - roten for rest-urlene (her http://localhost:8080/timereg/rest/)
 * - eventuell @Path fra klasse-nivå
 * - eventuell @Path fra metode-nivå.
 *
 * Iom. at metoden helloWorld ikke angir noen egen path er den da tilgjenglig på
 * http://localhost:8080/timereg/rest/helloworld, mens helloWorldMedId er tilgjengelig på (f.eks. med id 123)
 * http://localhost:8080/timereg/rest/helloworld/123
 *
 * @PathParam - angir en parameter i pathen. Eksempelet over viser hvordan for helloWorldMedId. Flere kan
 * angis, f.eks. har vi på NFR urler ala: <rest-rot>/person/123/epost/456 for å hent epost med id 456 for person med id
 * 123.
 *
 * @GET - angir at metoden nås med en http GET
 * @POST - angir at metoden nås med en http POST
 * @PUT- angir at metoden nås med en http PUT
 * @DELETE- angir at metoden nås med en http DELETE
 *
 * @Consumes - angir hva metoden forventer som content-type.
 *
 * @Produces - angir hva metoden produserer av content. For vanlig tekst kan den forsåvidt skippes, men hvis du f.eks.
 * vil returnere json må du angi: @Produces(MediaType.APPLICATION_JSON)
 *
 * @QueryParam - parametre du angir på formen ?parameter1=noe&parameter2=noeannet
 */
@Path("/helloworld")
public class HelloWorld {

    private static final Logger LOG = LoggerFactory.getLogger(HelloWorld.class);

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String helloWorld() {
        return "Hello world!";
    }

    @GET
    @Path("/{id: [0-9]+}")
    public String helloWorldMedId(@PathParam("id") final int id) {
        return "Fikk id: " + id;
    }

    @GET
    @Path("/sok")
    public String helloWorldMedId2(@QueryParam("id") final int id) {
        return "Ville sokt med id='" + id + "'";
    }

    @POST
    @Path("/logg")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response loggPost(final Loggstreng loggstreng) {
        LOG.info("Fikk: " + loggstreng.getLoggstreng());
        return Response.ok().build();
    }
}
