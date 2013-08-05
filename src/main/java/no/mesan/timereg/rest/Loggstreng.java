package no.mesan.timereg.rest;

/**
 * Eksempel på et enkelt transport-objekt for å ta i mot en streng til logging fra et rest-kall.
 *
 * @author Øystein Skadsem
 */
public class Loggstreng {

    private String loggstreng;

    public Loggstreng() {
        // tom konstruktør som trengs av Jersey
    }

    public Loggstreng(final String loggstreng) {
        this.loggstreng = loggstreng;
    }

    public String getLoggstreng() {
        return loggstreng;
    }
}
