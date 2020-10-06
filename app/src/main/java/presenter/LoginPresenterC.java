package presenter;

import model.UserC;
import view.LoginView;

public class LoginPresenterC implements LoginPresenter {


    LoginView loginView;
    public LoginPresenterC(LoginView loginView){
        this.loginView=loginView;
    }
    @Override
    public void onLogin(String email, String password) {

        UserC user= new UserC(email, password) ;

        boolean isLoginSuccess=user.isValid();

        if(isLoginSuccess)
            loginView.onLoginResult("Login Success");
        else
            loginView.onLoginResult("Login Failed");
    }


}