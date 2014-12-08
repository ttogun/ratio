package com.ratio.service

import spock.lang.Specification

/**
 * Created by user on 10/11/14.
 */
class MongoClientConfigurationTest extends Specification{

    def "should return  same instance of mongoClient"() {
        given:
            def client = MongoClientConfiguration.getMongoClient()
        when:
            def client2 = MongoClientConfiguration.getMongoClient()
        then:
            client.is(client2)
    }
}
