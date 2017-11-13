package com.blax.jaxrs.config;

import com.blax.jaxrs.providers.GsonMessageBodyHandler;
import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.jaxb.internal.XmlJaxbElementProvider;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * Created by Yau on 11/13/2017.
 */
public class ApplicationResourceConfig extends ResourceConfig {
    public ApplicationResourceConfig() {
        packages("com.blax.jaxrs");
        register(LoggingFilter.class);
        register(GsonMessageBodyHandler.class);
    }
}
