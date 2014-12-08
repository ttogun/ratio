
import com.ratio.service.login.LoginCredential;
import com.ratio.service.login.LoginHandler;
import com.ratio.service.signup.SignUpRequest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

/**
 * Created by user on 9/13/14.
 */

public class TestDefault {

    private SignUpRequest request;

    @Before
    public void setUp() throws Exception {
        request = new SignUpRequest.Builder()
                .email("someEmail@email.com")
                .password("somePassword")
                .dob(new Date("10/10/1987"))
                .gender("M")
                .build();
    }

    @Test
    public void shouldValidateLoginDetails() {
        LoginHandler loginHandler = new LoginHandler();
        String username = "SomeUsername";
        String password = "SomePassword";
        LoginCredential loginCredential = new LoginCredential(username, password);

        loginHandler.login(loginCredential);

    }

//    @Test
//    public void shouldReturnNewlyCreatedUserOnSignUp() {
//        SignUpHandler signUpHandler = new SignUpHandler(new SignUpValidator());
//        SignUpResponse response = signUpHandler.signUp(request);
//
//        Assert.assertNotNull(response);
//        Assert.assertNotNull(response.getToken());
//        Assert.assertEquals(response.getUser().getEmail(), request.getEmail());
//    }

    @Test
    public void signUpRequestFieldsAreNotNulls() {
        Assert.assertNotNull(request.getEmail());
        Assert.assertNotNull(request.getPassword());
        Assert.assertNotNull(request.getGender());
        Assert.assertNotNull(request.getDob());
    }

//    @Test(expected = Exception.class)
//    public void signUpRequestEmailMustBeValidEmail() {
//        request.setEmail("invalidEmail");
//        SignUpHandler signUpHandler = new SignUpHandler(new SignUpValidator(), );
//        signUpHandler.signUp(request);
//    }
}
