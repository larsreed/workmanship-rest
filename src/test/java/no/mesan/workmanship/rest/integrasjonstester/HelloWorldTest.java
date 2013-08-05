package no.mesan.workmanship.rest.integrasjonstester;

import static com.jayway.restassured.RestAssured.*;
import static org.junit.Assert.*;

import java.io.IOException;

import javax.ws.rs.core.MediaType;

import no.mesan.timereg.rest.Loggstreng;

import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Integrasjonstester for Timereg. Krever at JettyStarter kjører.
 *
 * @author Øystein Skadsem
 */
public class HelloWorldTest {

    private static final String REST_URL = "http://localhost:8080/timereg/rest";
    private final ObjectMapper jsonMapper = new ObjectMapper();

    @Test
    @Ignore
    public void getMotRotenSkalGiHelloWorld() {
        final String svar =
            given().
            expect().
                statusCode(200).
            when().
                get(REST_URL + "/helloworld").asString();

        assertEquals("Hello world!", svar);
    }

    @Test
    @Ignore
    public void postMotLoggSkalVirke() throws IOException {
        final Loggstreng loggstreng = new Loggstreng("Dette kommer fra en test");

        // Sjekk at det logges korrekt fra JettyStarter
        given().
            contentType(MediaType.APPLICATION_JSON).
            body(jsonMapper.writeValueAsString(loggstreng)).
        expect().
            statusCode(200).
        when().
            post(REST_URL + "/logg");
    }
}
