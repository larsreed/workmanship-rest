package no.mesan.timereg.timedata.reg;

/**
 * Status på registrering.
 */
public enum RegStatus {
    /** Registrert lokalt, ikke sendt inn. */
    IKKE_SENDT,
    /** Sendt inn, ikke kontrollert (kan endres). */
    REGISTRERT,
    /**
     * Registrering ansees ferdig (av bruker, for denne måned).  Ved endring til og
     * fra denne status må alle timer for gitt bruker og måned settes tilbake til
     * REGISTRERT.
     */
    FERDIG,
    /**
     * Er kontrollert - kan endres, men da settes status tilbake til REGISTRERT - kan overføres. */
    KONTROLLERT,
    /** Er overført økonomisystem, kan ikke endres. */
    OVERFORT
}
