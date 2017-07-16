package org.ngodingo.login_mvp.login;

/**
 * Created by Ariaseta on 14/07/2017.
 */

public interface ILoginInteractor {
    boolean validatedCredentials(String email, String password);
}
