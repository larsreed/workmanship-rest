package no.mesan.timereg.ansattreg;

import java.math.BigDecimal;

/**
 * Firma brukere jobber i.
 */
@SuppressWarnings("javadoc")
public class Firma {

    /** Delingsfaktor ved beregning av plussutbetaling til konsulent. */
    private BigDecimal faktFaktor = new BigDecimal(1.27792);

    /**
     * Hvor stor andel av fakturert beløp skal benyttes ved beregning av
     * plusstidutbetaling til den ansatte - settes til 0 dersom slik betaling ikke
     * gjøres, 1000 ved full dekning, noe i mellom hvis f.eks. fradrag for mellomlegg -
     * dette beregnes før faktFaktor.
     */
    private int faktPromille = 1000;

    /** Navn på firma, f.eks. "Mesan AS". */
    private String firmaNavn;

    /** Kode for firmaet som brukes av andre systemer. */
    private int firmaNr;

    /** Antall minutter i en normal dag. */
    private int normalDagMinutter = 450;

    /** Andel av normaltid som må faktureres før utbetaling av plusstid vil finne sted - angis i promille. */
    private int faktureringsKrav = 8700;

    public BigDecimal getFaktFaktor() { return this.faktFaktor; }
    public void setFaktFaktor(final BigDecimal faktFaktor) { this.faktFaktor = faktFaktor; }

    public int getFaktPromille() { return this.faktPromille; }
    public void setFaktPromille(final int faktPromille) { this.faktPromille = faktPromille; }

    public String getFirmaNavn() { return this.firmaNavn; }
    public void setFirmaNavn(final String firmaNavn) { this.firmaNavn = firmaNavn; }

    public int getFirmaNr() { return this.firmaNr; }
    public void setFirmaNr(final int firmaNr) { this.firmaNr = firmaNr; }

    public int getNormalDagMinutter() { return this.normalDagMinutter; }
    public void setNormalDagMinutter(final int normalDagMinutter) { this.normalDagMinutter = normalDagMinutter; }

    public int getFaktureringsKrav() { return this.faktureringsKrav; }
    public void setFaktureringsKrav(final int faktureringsKrav) { this.faktureringsKrav = faktureringsKrav; }

    @Override
    public String toString() {
        return new StringBuilder("Firma{")
            .append("firmaNr=").append(this.firmaNr)
            .append(", firmaNavn='").append(this.firmaNavn).append('\'')
            .append('}')
            .toString();
    }
}
