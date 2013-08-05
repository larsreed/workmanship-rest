package no.mesan.timereg.timedata.reg;

import java.util.Arrays;

/**
 * Inneholder tekstlige detaljer om registreringen.
 */
public class Timedetalj {

    /**
     * Et antall felt for utfylling av prosjektspesifikke koder, f.eks. Jira-issue,
     * delprosjekt, WBS, osv.
     */
    private String[] dataFelt;

    /** Fri kommentartekst. */
    private String kommentar;

    public String[] getDataFelt() { return this.dataFelt; }
    public void setDataFelt(final int i, final String dataFelt) {
        this.dataFelt[i] = dataFelt;
    }

    public String getKommentar() { return this.kommentar; }
    public void setKommentar(final String kommentar) { this.kommentar = kommentar; }

    @Override
    public String toString() {
        return new StringBuilder("Timedetalj{")
            .append("dataFelt=").append(Arrays.toString(this.dataFelt))
            .append(", kommentar='").append(this.kommentar).append('\'')
            .append('}')
            .toString();
    }
}
