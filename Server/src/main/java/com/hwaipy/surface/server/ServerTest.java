package com.hwaipy.surface.server;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

/**
 *
 * @author Hwaipy
 */
public class ServerTest {

  public static void main(String[] args) throws Exception {
    String os = System.getProperties().get("os.name").toString();
    boolean debug = "Mac OS X".equals(os);
    int port = debug ? 8080 : 80;
    String base = debug ? "Web/" : "/home/Web/";

    Server server = new Server(port);
    WebAppContext webapp = new WebAppContext();
    webapp.setResourceBase(base);
    server.setHandler(webapp);
    server.start();
  }

}
