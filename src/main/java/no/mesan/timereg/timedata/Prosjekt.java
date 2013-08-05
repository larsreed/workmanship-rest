package no.mesan.timereg.timedata;

import no.mesan.timereg.kunde.Kunde;

/**
 * Internt eller eksternt prosjekt.
 */
@SuppressWarnings("javadoc")
public class Prosjekt {

    /** Er dette et internprosjekt? */
    private boolean internt;

    /** Navn på prosjektet. */
    private String prosjektNavn;

    /** Prosjektkode. */
    private int prosjektNr;

    /** Inngår i prosjekt. */
    private Prosjekt morProsjekt;

    /** Hos kunde.*/
    private Kunde hosKunde;

    public boolean isInternt() { return this.internt; }
    public void setInternt(final boolean internt) { this.internt = internt; }

    public String getProsjektNavn() { return this.prosjektNavn; }
    public void setProsjektNavn(final String prosjektNavn) { this.prosjektNavn = prosjektNavn; }

    public int getProsjektNr() { return this.prosjektNr; }
    public void setProsjektNr(final int prosjektNr) { this.prosjektNr = prosjektNr; }

    public Prosjekt getMorProsjekt() { return this.morProsjekt; }
    public void setMorProsjekt(final Prosjekt morProsjekt) { this.morProsjekt = morProsjekt; }

    public Kunde getHosKunde() { return this.hosKunde; }
    public void setHosKunde(final Kunde hosKunde) { this.hosKunde = hosKunde; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Prosjekt{")
            .append(", nr=").append(this.prosjektNr)
            .append(", navn='").append(this.prosjektNavn).append('\'');
        if (this.internt) sb.append(" internt");
        if (this.morProsjekt!=null) sb.append(", morProsjekt=").append(this.morProsjekt);
        if (this.hosKunde!=null) sb.append(", kunde=").append(this.hosKunde);
        sb.append('}');
        return sb.toString();
    }
}
