package no.mesan.timereg.timedata;

/**
 * Noe man fører timer på.
 */
@SuppressWarnings("javadoc")
public class Aktivitet {

    /** Aktivitetskode. */
    private int aktKode;

    /** En aktivitet er fakturerbar dersom den er koblet til en timepris for denne brukeren i dette prosjektet. */
    private boolean fakturerbar;

    /** Beskrivende tekst. */
    private String tekst;

    /**
     * Sann dersom timer ført på dette prosjektet skal gå til fradrag i
     * faktureringskravet (f.eks. sykdom, fødselsperm. osv).
     */
    private boolean timeFradrag;

    /** Sann hvis det er skrevet programlogikk for denne aktiviteten. */
    private boolean beskyttet;

    /** X-timer er særskilt godkjente aktiviteter som gir reduksjon i faktureringskravet. */
    private boolean xTime;

    /** Har timepris. */
    private Timepris timepris;

    /** Mapper til (overordnet). */
    private Aktivitet mapperTil;

    public Prosjekt iProsjekt(){
        return null;
    }

    public int getAktKode() { return this.aktKode; }
    public void setAktKode(final int aktKode) { this.aktKode = aktKode; }

    public boolean isFakturerbar() { return this.fakturerbar; }
    public void setFakturerbar(final boolean fakturerbar) { this.fakturerbar = fakturerbar; }

    public String getTekst() { return this.tekst; }
    public void setTekst(final String tekst) { this.tekst = tekst; }

    public boolean isTimeFradrag() { return this.timeFradrag; }
    public void setTimeFradrag(final boolean timeFradrag) { this.timeFradrag = timeFradrag; }

    public boolean isBeskyttet() { return this.beskyttet; }
    public void setBeskyttet(final boolean beskyttet) { this.beskyttet = beskyttet; }

    public boolean isxTime() { return this.xTime; }
    public void setxTime(final boolean xTime) { this.xTime = xTime; }

    public Timepris getTimepris() { return this.timepris; }
    public void setTimepris(final Timepris timepris) { this.timepris = timepris; }

    public Aktivitet getMapperTil() { return this.mapperTil; }
    public void setMapperTil(final Aktivitet mapperTil) { this.mapperTil = mapperTil; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Aktivitet{")
            .append("aktKode=").append(aktKode)
            .append(", tekst='").append(tekst).append('\'');
        if (this.fakturerbar) sb.append(" fakturerbar");
        if (this.timeFradrag) sb.append(" timeFradrag");
        if (this.xTime) sb.append(" X-time");
        if (this.timepris!=null) sb.append(", timepris=").append(timepris);
        if (this.mapperTil!=null) sb.append(", mapperTil=").append(mapperTil);
        sb.append('}');
        return sb.toString();
    }
}