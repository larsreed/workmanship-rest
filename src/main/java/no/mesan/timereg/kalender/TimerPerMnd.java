package no.mesan.timereg.kalender;

import java.util.Collections;
import java.util.Set;

/**
 * Holder orden på antall fakturerbare timer per måned (per år).
 */
@SuppressWarnings("javadoc")
public class TimerPerMnd {

	/** Gjelder år. */
	private final int ar;
    /** Gjelder måned. */
   	private final int mnd;

	/** Antall minutter det skal jobbes denne måneden. */
	private final int fullMinutter;

    /** Inkluderte fridager. */
	private Set<Fridag> fridager;

	public TimerPerMnd(final int ar, final int mnd, final int antallMin){
        this.ar= ar;
        this.mnd= mnd;
        this.fullMinutter= antallMin;
	}

    public void addFridag(final Fridag dag) {
        this.fridager.add(dag);
    }

    public Set<Fridag> getFridager() {
        return Collections.unmodifiableSet(this.fridager);
    }

    @Override
    public String toString() {
        return new StringBuilder("TimerPerMnd{")
            .append(this.ar)
            .append('/')
            .append(this.mnd)
            .append('}')
            .toString();
    }
}
