package com.ratio.service.login

import com.ratio.service.MongoClientConfiguration
import spock.lang.Specification
import spock.lang.Subject

/**
 * Created by user on 10/27/14.
 */
class MongoLoginAccessTest extends Specification {
    @Subject LoginAccess access

    def setup(){
        access = new MongoLoginAccess(MongoClientConfiguration.mongoClient);
    }

    def "should login"() {
        given:
            def validUserAccount = validUser()

        when:
            def token = access.login(validUserAccount.username, validUserAccount.password)

        then:
            noExceptionThrown()
            token == 'some token'


    }

    def validUser() {
        ['username': '01dev', 'password': '!0_dev']
    }
}
