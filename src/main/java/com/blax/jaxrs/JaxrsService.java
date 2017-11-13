package com.blax.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by Yau on 11/13/2017.
 */
@Path("/")
public class JaxrsService
{
    @GET
    @Path("/message")
    public String getMsg()
    {
        return "Hello World !! - Jersey 2";
    }

    @GET
    @Path("/person")
    public Person getPerson()
    {
        return new Person("blax", "coding");
    }
}
