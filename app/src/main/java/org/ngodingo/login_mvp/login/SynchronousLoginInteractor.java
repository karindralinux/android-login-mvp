package org.ngodingo.login_mvp.login;

/**
 * Created by Ariaseta on 14/07/2017.
 */

public class SynchronousLoginInteractor implements ILoginInteractor {

    @Override
    public boolean validatedCredentials(String email, String password) {
        return email.contains("@gmail.com");
    }
}
