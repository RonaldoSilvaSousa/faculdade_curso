/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author JUVENALDO
 */
public class MenuAdministrativoController implements Initializable {

    @FXML
    private Button btnCancelar;

    @FXML
    private Button btnEstado;

    @FXML
    private Button btnInstituicao;

    @FXML
    private Button btnCurso;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void btnEstado(ActionEvent e) throws IOException {
        System.out.println("Bot�o ativo!");

        Stage stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("Estado.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();

        btnEstado.getScene().getWindow().hide();

        Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
        alerta.setTitle("FACULDADE/CURSO!");
        alerta.setHeaderText("Tela de cadastramento de estados");
        alerta.show();
    }

    @FXML
    private void btnInstituicao(ActionEvent e) throws IOException {

        Stage stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("../View/FaculdadePrincipal.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();

        btnInstituicao.getScene().getWindow().hide();

        Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
        alerta.setTitle("FACULDADE/CURSO!");
        alerta.setHeaderText("Tela de cadastramento de Institui��es");
        alerta.show();

    }

    @FXML
    private void btnCurso(ActionEvent e) throws IOException {
        System.out.println("Bot�o ativo!");

        Stage stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("CursoApresentacao.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();

        btnCurso.getScene().getWindow().hide();

        Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
        alerta.setTitle("FACULDADE/CURSO!");
        alerta.setHeaderText("Tela de cadastramento de cursos");
        alerta.show();
    }

    public void cancelarExecucao() throws IOException {

        Stage stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("Login.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();

        //Fecha a janela inicial e exibe a pr�xima
        btnCurso.getScene().getWindow().hide();

    }

}
