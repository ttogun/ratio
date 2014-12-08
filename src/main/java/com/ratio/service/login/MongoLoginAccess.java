package com.ratio.service.login;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

/**
 * Created by user on 10/26/14.
 */
public class MongoLoginAccess implements LoginAccess {

    MongoClient mongoClient;

    public MongoLoginAccess(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }

    @Override
    public String login(String username, String password) {
        //check if user exists
        DBCollection buzzer = mongoClient.getDB("ratio").getCollection("buzzer");
        DBObject user = buzzer.findOne(new BasicDBObject("username", username)
                        .append("password", password)
        );

        if(user == null) {
            throw new InvalidLoginException("Invalid username/password!!!");
        }

        //get token
        return getToken(username, password);
    }

    private String getToken(String username, String password) {
        return "some token";
    }
}
