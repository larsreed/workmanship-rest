package no.mesan.workmanship.rest;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.nio.SelectChannelConnector;
import org.eclipse.jetty.webapp.WebAppContext;

public final class JettyStarter {

    private static Server SERVER;

    public JettyStarter() {

    }

    public void start(final int port) throws Exception {
        SERVER = new Server();
        final Connector connector = new SelectChannelConnector();
        connector.setPort(port);
        SERVER.setConnectors(new Connector[]{ connector });

        final WebAppContext context = new WebAppContext();
        context.setServer(SERVER);
        context.getInitParams().put("org.mortbay.jetty.servlet.Default.useFileMappedBuffer", "false");
        context.getInitParams().put("useFileMappedBuffer", "false");
        context.setServerClasses(new String[]{ "-org.mortbay.jetty.plus.jaas.", "org.mortbay.jetty." });
        context.setContextPath("/timereg");
        context.setWar("src/main/webapp");

        SERVER.setHandler(context);
        SERVER.start();
    }

    @SuppressWarnings({ "unchecked" })
    public static void main(final String[] args) throws Exception {
        final JettyStarter starter = new JettyStarter();
        starter.start(8080);
    }

    public void stop() throws Exception {
        SERVER.stop();
    }
}
