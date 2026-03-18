import java.io.IOException;
import java.lang.reflect.Field;

import javax.print.attribute.standard.Fidelity;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.scene.*;
import java.util.ArrayList;

public class Controller {
    //instances
    private Stage stage;
    @FXML
    private TextField webmailLoginField;
    @FXML
    private PasswordField webmailPasswordField;
    @FXML 
    private Label wrongInfoLabel;
    //stack of previous scenes
    public static ArrayList<Scene> backscenes = new ArrayList<>();
    //stack of scenes going forward
    public static ArrayList<Scene> frontscenes = new ArrayList<>();

    @FXML
    public void goToPassword(){
        webmailPasswordField.requestFocus();
    }

    public void goBack(ActionEvent e) throws IOException{
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        if(backscenes.size() - 1 > 0){
            stage.setScene(backscenes.get(backscenes.size()-2));
            frontscenes.add(backscenes.get(backscenes.size()-1));
            backscenes.remove(backscenes.size()-1);
        }   
    }

    public void goFront(ActionEvent e) throws IOException{
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        if(backscenes.size() - 1 > 0){
            stage.setScene(frontscenes.get(frontscenes.size()-1));
            frontscenes.remove(frontscenes.size()-1);
        }
    }
    
    public void switchToLogin(ActionEvent e) throws IOException{
        Parent loginRoot = FXMLLoader.load(getClass().getResource("loginscenebuilder.fxml"));

        //stage i getiriyoruz
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();

        Scene loginScene = new Scene(loginRoot);
        stage.setScene(loginScene);
        backscenes.add(loginScene);
        stage.show();
    }
        public void switchToNamePage(ActionEvent e) throws IOException{
        Parent nameRoot = FXMLLoader.load(getClass().getResource("namePage.fxml"));

        //stage i getiriyoruz
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();

        Scene signUpScene = new Scene(nameRoot);
        stage.setScene(signUpScene);
        backscenes.add(signUpScene);
        stage.show();
    }

    public void switchToSignUp(ActionEvent e) throws IOException{
        Parent signUpRoot = FXMLLoader.load(getClass().getResource("signupscenebuilder.fxml"));

        //stage i getiriyoruz
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();

        Scene signUpScene = new Scene(signUpRoot);
        stage.setScene(signUpScene);
        backscenes.add(signUpScene);
        stage.show();
    }
    public void switchToInterest(ActionEvent e) throws IOException{
        Parent interestRoot = FXMLLoader.load(getClass().getResource("interestpage2.fxml"));

        //stage i getiriyoruz
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();

        Scene signUpScene = new Scene(interestRoot);
        stage.setScene(signUpScene);
        backscenes.add(signUpScene);
        stage.show();
    }

    public void getMailText(ActionEvent e) throws IOException{
        String mail = webmailLoginField.getText();
        String password = webmailPasswordField.getText();
        
        boolean accurate = LoginVerifier.verify(mail, password);

        if(accurate){

            Parent mainPage = FXMLLoader.load(getClass().getResource("defaultpage.fxml"));
            Scene mainScene = new Scene(mainPage);
            stage = (Stage)((Node)e.getSource()).getScene().getWindow();
            stage.setScene(mainScene);
            backscenes.add(mainScene);

        }

        else{
            wrongInfoLabel.setVisible(true);
        }
    }

}
