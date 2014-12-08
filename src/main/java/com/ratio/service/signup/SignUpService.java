package com.ratio.service.signup;

import com.ratio.service.MongoClientConfiguration;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Created by user on 9/26/14.
 */
@Path("/")
public class SignUpService {

    private SignUpHandler signUpHandler;

    public SignUpService() {
        signUpHandler = new SignUpHandler(new SignUpValidator(),
                new MongoSignUpAccess(MongoClientConfiguration.getMongoClient()));
    }

    public SignUpService(SignUpHandler signUpHandler) {
        this.signUpHandler = signUpHandler;
    }

    @Path("/signup")
    @POST
    public Response signUp(SignUpRequest request) {
        SignUpResponse response = signUpHandler.signUp(request);
        return  Response.ok(response).build();
    }
}
