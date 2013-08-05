package no.mesan.timereg.timedata;
import no.mesan.timereg.ansattreg.Bruker;

import java.util.Date;

/**
 * Timepris for en gitt bruker i et gitt prosjekt, kan også variere per aktivitet.
 */
@SuppressWarnings("javadoc")
public class Timepris {

    /** Minimumsdato. */
    public static final Date MIN_DATE = new Date(0);
    /** Maksimumsdato */
    public static final Date MAX_DATE = new Date(Long.MAX_VALUE);

    /** Sann hvis denne satsen inkluderer fakturerbar lunsj. */
    private boolean faktLunsj;

    /** Satsen gjelder f.o.m. denne datoen. */
    private Date fomDato = MIN_DATE;
    /** Satsen gjelder til og med. */
    private Date tomDato = MAX_DATE;

    /** Timesats i hele kroner. */
    private int kroner;

    /** Timeprisen gjelder denne brukeren. */
    private Bruker forBruker;

 /** Timeprisen gjelder dette prosjektet. */
    private Prosjekt iProsjekt;

    public boolean isFaktLunsj() { return this.faktLunsj; }
    public void setFaktLunsj(final boolean faktLunsj) { this.faktLunsj = faktLunsj; }

    public Date getFomDato() { return this.fomDato; }
    public void setFomDato(final Date fomDato) { this.fomDato = fomDato; }
    public Date getTomDato() { return this.tomDato; }
    public void setTomDato(final Date tomDato) { this.tomDato = tomDato; }

    public int getKroner() { return this.kroner; }
    public void setKroner(final int kroner) { this.kroner = kroner; }

    public Bruker getForBruker() { return this.forBruker; }
    public void setForBruker(final Bruker forBruker) { this.forBruker = forBruker; }

    public Prosjekt getiProsjekt() { return this.iProsjekt; }
    public void setiProsjekt(final Prosjekt iProsjekt) { this.iProsjekt = iProsjekt; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Timepris{")
            .append(", kroner=").append(this.kroner)
            .append(", fomDato=").append(this.fomDato)
            .append(", tomDato=").append(this.tomDato);
        if (this.faktLunsj) sb.append(", faktLunsj");
        if (this.forBruker!=null) sb.append(", forBruker=").append(this.forBruker);
        if (this.iProsjekt!=null) sb.append(", iProsjekt=").append(this.iProsjekt);
        sb.append('}');
        return sb.toString();
    }
}
