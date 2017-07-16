package org.ngodingo.login_mvp.login;

/**
 * Created by Ariaseta on 14/07/2017.
 */

public class LoginPresenter implements ILoginPresenter {

    /******************************************************************************************
     - LoginPresenter has a reference to both the View and the Interactor
     - LoginPresenter retrieves data from the model, and notifies the view to display it.
     *******************************************************************************************
     */

    private ILoginView view;
    private SynchronousLoginInteractor interactor;

    public LoginPresenter(ILoginView loginView) {
        this.view = loginView;
        this.interactor = new SynchronousLoginInteractor();
    }

    @Override
    public void attemptLogin(String email, String password) {
        boolean isValid = interactor.validatedCredentials(email,password);
        if (isValid) view.navigateToListActivity(); else view.loginFailed();
    }
}
