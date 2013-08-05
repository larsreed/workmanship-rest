package no.mesan.timereg.kunde;

/**
 * Kunde.
 */
@SuppressWarnings("javadoc")
public class Kunde {

    /** Kundens navn. */
    private String kundeNavn;

    public String getKundeNavn() { return this.kundeNavn; }
    public void setKundeNavn(final String kundeNavn) { this.kundeNavn = kundeNavn; }

    @Override
    public String toString() {
        return "Kunde{ " + this.kundeNavn + " }";
    }
}
