package com.ratio.service.signup;

import com.mongodb.*;
import com.ratio.model.User;
import com.ratio.service.signup.SignUpAccess;

/**
 * Created by user on 10/8/14.
 */
public class MongoSignUpAccess implements SignUpAccess {

    MongoClient mongoClient;

    public MongoSignUpAccess(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }

    @Override
    public void saveUser(User newUser) {
        DBCollection buzzer = mongoClient.getDB("ratio").getCollection("buzzer");
        BasicDBObject user = new BasicDBObject(
                "name", new BasicDBObject("firstname",
                newUser.getFirstName())
                .append("lastname", newUser.getLastName()))
                .append("gender", newUser.getGender())
                .append("email", newUser.getEmail())
                .append("dob", newUser.getDob());

        buzzer.insert(user);
    }
}
