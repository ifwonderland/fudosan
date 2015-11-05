package com.fudosaninvestor;

import com.fudosaninvestor.application.MainApplication;
import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.core.UriBuilder;
import java.net.URI;

/**
 * This class launches the web application in an embedded Jetty container. This is the entry point to your application. The Java
 * command that is used for launching should fire this main method.
 */
public class MainTest {

    public static void main(String[] args) throws Exception{
        URI baseUri = UriBuilder.fromUri("http://localhost").port(9998).build();

        ResourceConfig config = new MainApplication();

        HttpServer server = GrizzlyHttpServerFactory.createHttpServer(baseUri, config);

        server.start();
    }


}
