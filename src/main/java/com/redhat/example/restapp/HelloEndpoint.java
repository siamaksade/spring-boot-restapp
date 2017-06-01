package com.redhat.example.restapp;

import java.io.Serializable;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RestController;

import com.redhat.example.restapp.model.Message;

@RestController
@Path("/hello")
public class HelloEndpoint implements Serializable {
	private static final long serialVersionUID = 199526197599249044L;

	@GET
    @Path("/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Message hello(@PathParam("name") String name) {

        return new Message("Hello " + name);
    }
}
