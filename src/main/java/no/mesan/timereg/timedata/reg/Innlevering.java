package no.mesan.timereg.timedata.reg;

import java.util.Date;

/**
 * Generell superklasse for data som registreres av konsulent.
 */
@SuppressWarnings("javadoc")
public abstract class Innlevering {

    /** Når ble denne registreringen sist endret. */
    private Date sistEndret;

    /** Hvor langt har denne registreringen kommet? */
    private RegStatus status;

    public Date getSistEndret() { return this.sistEndret; }
    public void setSistEndret(final Date sistEndret) { this.sistEndret = sistEndret; }

    public RegStatus getStatus() { return this.status; }
    public void setStatus(final RegStatus status) { this.status = status; }
}
