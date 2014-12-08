package com.ratio.service;

import com.mongodb.MongoClient;

import java.net.UnknownHostException;

/**
 * Created by user on 10/11/14.
 */
public class MongoClientConfiguration {

    private static MongoClient mongoClient;

    static {
        try {
            mongoClient = new MongoClient("localhost", 27017);
        } catch (UnknownHostException e) {
            throw new MongoConfigurationException("failed to create client", e);
        }
    }

    private MongoClientConfiguration(){}

    public static MongoClient getMongoClient() {
        return mongoClient;
    }
}
