package org.myorg.basicejb.rest;

import javax.ejb.Stateless;
import javax.ws.rs.*;

@Stateless
@Path("/employees")
public class EmployeeResource {
    
    @GET 
    @Produces("application/XML")
    public String get(){
        return "TEST123";
    }
    
}