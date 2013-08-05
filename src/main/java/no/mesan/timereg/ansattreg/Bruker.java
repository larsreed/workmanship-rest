package no.mesan.timereg.ansattreg;

/**
 * Brukere i systemet (generelt ansatte).
 */
@SuppressWarnings("javadoc")
public class Bruker {

    /** Ansattnummer, unikt innenfor et firma. */
    private int ansattNr;

    /** Unik brukerID. */
    private String brukerID;

    /** Fullt navn på bruker. */
    private String fulltNavn;

    /** Sann dersom den ansatte har rett til utbetaling av fakturerbar plusstid. */
    private boolean harPlussBet = true;

    /** Kontonummer for bruker. */
    private long kontoNr;

    /** Del av full stilling. */
    private int stillingsProsent = 100;

    /** Mailadresse. */
    private String epostAdr;

    /** Hvilket firma den ansatte jobber i. */
    private Firma jobberI;

    // private List<OverforPluss> overforPlussTimer;
    // private List<Timereg> harReg;


    public int getAnsattNr() { return this.ansattNr; }
    public void setAnsattNr(final int ansattNr) { this.ansattNr = ansattNr; }

    public String getBrukerID() { return this.brukerID; }
    public void setBrukerID(final String brukerID) { this.brukerID = brukerID; }

    public String getFulltNavn() { return this.fulltNavn; }
    public void setFulltNavn(final String fulltNavn) { this.fulltNavn = fulltNavn; }

    public boolean isHarPlussBet() { return this.harPlussBet; }
    public void setHarPlussBet(final boolean harPlussBet) { this.harPlussBet = harPlussBet; }

    public long getKontoNr() { return this.kontoNr; }
    public void setKontoNr(final long kontoNr) { this.kontoNr = kontoNr; }

    public int getStillingsProsent() { return this.stillingsProsent; }
    public void setStillingsProsent(final int stillingsProsent) { this.stillingsProsent = stillingsProsent; }

    public String getEpostAdr() { return this.epostAdr; }
    public void setEpostAdr(final String epostAdr) { this.epostAdr = epostAdr; }

    public Firma getJobberI() { return this.jobberI; }
    public void setJobberI(final Firma jobberI) { this.jobberI = jobberI; }

    @Override
    public String toString() {
        return new StringBuilder("Bruker{")
            .append("nr=").append(this.ansattNr)
            .append(", ID='").append(this.brukerID).append('\'')
            .append(", navn='").append(this.fulltNavn).append('\'')
            .append('}')
            .toString();
    }
}
