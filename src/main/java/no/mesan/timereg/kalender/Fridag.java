package no.mesan.timereg.kalender;

import java.util.Date;

/**
 * Registrerte fridager innenfor et år.
 */
@SuppressWarnings("javadoc")
public class Fridag {

    /** Fridag. */
    private final Date dato;

    /** Sann hvis dette er en halv arbeidsdag (ikke helt fri). */
    private final boolean halvDag;

    /** Default constructor. */
    public Fridag(final Date dato, final boolean halvDag){
        this.dato= dato;
        this.halvDag= halvDag;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fridag{");
        sb.append("dato=").append(this.dato);
        if (this.halvDag) sb.append(" (1/2)");
        sb.append('}');
        return sb.toString();
    }
}
