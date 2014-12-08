package com.ratio.service.login

import com.ratio.service.MongoClientConfiguration
import spock.lang.Specification
import spock.lang.Subject

import javax.ws.rs.core.Response

/**
 * Created by user on 10/12/14.
 */
class LoginTest extends Specification {

    @Subject LoginService service

    def setup(){
        service = new LoginService(new LoginHandler(),
                new MongoLoginAccess(MongoClientConfiguration.mongoClient))
    }

    def "should log user in"() {
        given:
            def username = "01dev"
            def pwd = "!0_pwd"

        when:
            def resp = service.login(username, pwd)

        then:
          resp.status == Response.Status.OK
    }
}
