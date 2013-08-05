package no.mesan.timereg.timedata.reg;

import no.mesan.timereg.kalender.TimerPerMnd;

/**
 * Overføres plusstid.
 */
public class OverforPluss {

    private int minutter;
    private final TimerPerMnd iMnd;

    /* Default constructor. */
    public OverforPluss(TimerPerMnd mndAr){
        this.iMnd= mndAr;
    }

    public int getMinutter() { return this.minutter; }
    public void setMinutter(final int minutter) { this.minutter = minutter; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("OverforPluss{")
            .append("minutter=").append(this.minutter);
        if (this.iMnd != null) {
            sb.append(", iMnd=").append(this.iMnd);
        }
        sb.append('}');
        return sb.toString();
    }
}
