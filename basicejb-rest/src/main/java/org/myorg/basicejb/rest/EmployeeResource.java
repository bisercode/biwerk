package org.myorg.basicejb.rest;

import org.myorg.basicejb.ejb.ReservationLocal;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Stateless
@Path("/employees")
public class EmployeeResource {

    // imported dependency (in pom.xml)
    @Inject
    private ReservationLocal reservationLocal;
    
    @GET 
    @Produces("application/XML")
    public String get(){
        reservationLocal.pingLocal();
        return "TEST123";
    }

    @GET
    @Path("/ping")
    public Response ping() {
        return Response.ok().entity("Service online 123").build();
    }
    
}