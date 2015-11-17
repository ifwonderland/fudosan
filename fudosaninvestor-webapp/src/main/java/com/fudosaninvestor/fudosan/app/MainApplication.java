package com.fudosaninvestor.fudosan.app;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

/**
 * Servlet 3.0 main app descriptor
 * <p/>
 * Created by Shaochen Huang on 11/5/15.
 */
@ApplicationPath("api")
public class MainApplication extends ResourceConfig {

    public MainApplication() {
        packages("com.fudosaninvestor.api");
    }
}
