package br.com.myappquarkus.controller;


import br.com.myappquarkus.model.User;
import br.com.myappquarkus.service.UserService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/api/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserController {

    @Inject
    UserService userService;


    @GET
    public List<User> list () {
        return userService.listAll();
    }


    @POST
    public Response create (User user){
        userService.create(user);
        return Response.status(201).build();
    }

}
