package no.mesan.timereg.timedata.reg;

import no.mesan.timereg.ansattreg.Bruker;
import no.mesan.timereg.timedata.Aktivitet;

/**
 * Selve registreringen.
 * Gjelder kun én dag, selv om brukergrensesnittet med fordel kan registere for
 * flere dager av gangen (da med flere instanser i bakgrunnen).
 */
@SuppressWarnings("javadoc")
public class Timereg extends Innlevering {

    /** Tid på denne aktiviteten. */
    private int minutter;

    /** Ved pålagt overtid - prosent. */
    private int overtidsPst;

    /** Dag i måneden (1..31). */
    private int dag;

    /** Måned i året (1..12). */
    private int mnd;

    /** Årstall (20xx). */
    private int aar;

    /** Evt detaljtekst om denne. */
    private Timedetalj harDetalj;

    /** Registrert på bruker. */
    private Bruker forBruker;

    /** Registrert på aktivitet. */
    private Aktivitet medAktivitet;

    public int getMinutter() { return this.minutter; }
    public void setMinutter(final int minutter) { this.minutter = minutter; }

    public int getOvertidsPst() { return this.overtidsPst; }
    public void setOvertidsPst(final int overtidsPst) { this.overtidsPst = overtidsPst; }

    public int getDag() { return this.dag; }
    public void setDag(final int dag) { this.dag = dag; }

    public int getMnd() { return this.mnd; }
    public void setMnd(final int mnd) { this.mnd = mnd; }

    public int getAar() { return this.aar; }
    public void setAar(final int aar) { this.aar = aar; }

    public Timedetalj getHarDetalj() { return this.harDetalj; }
    public void setHarDetalj(final Timedetalj harDetalj) { this.harDetalj = harDetalj; }

    public Bruker getForBruker() { return this.forBruker; }
    public void setForBruker(final Bruker forBruker) { this.forBruker = forBruker; }

    public Aktivitet getMedAktivitet() { return this.medAktivitet; }
    public void setMedAktivitet(final Aktivitet medAktivitet) { this.medAktivitet = medAktivitet; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Timereg{")
            .append("dag=").append(this.dag)
            .append(" mnd=").append(this.mnd)
            .append(" aar=").append(this.aar);
        if ( this.medAktivitet!=null ) sb.append(", aktivitet=").append(this.medAktivitet);
        if ( this.forBruker!=null ) sb.append(", bruker=").append(this.forBruker);
        if ( this.harDetalj!=null ) sb.append(", detaljer=").append(this.harDetalj);
        sb.append(", minutter=").append(this.minutter);
        if (this.overtidsPst != 0) sb.append(", overtidsPst=").append(this.overtidsPst);
        sb.append('}');
        return sb.toString();
    }
}
