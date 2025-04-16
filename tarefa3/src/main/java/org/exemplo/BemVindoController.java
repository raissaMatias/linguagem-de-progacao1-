package org.exemplo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class BemVindoController {

    @FXML
    private Button btnTrocaTela;

    @FXML
    private Button btn_peixe;

    @FXML
    void trocarTelaCanino(ActionEvent event) throws IOException {
        App.setRoot("telaCanino");
    }

    @FXML
    void trocarTelaPeixe(ActionEvent event) throws IOException {
        App.setRoot("telaPeixe");
    }

    @FXML
    void trocarTelaPassaro(ActionEvent event) throws IOException {
        App.setRoot("telaPassaro");
    }

    @FXML
    void trocarTelaBandeira(ActionEvent event) throws IOException {
        App.setRoot("telaBandeira");
    }

    @FXML
    void trocarTelaSapato(ActionEvent event) throws IOException {
        App.setRoot("telaSapato");
    }

    @FXML
    void trocarTelaBebida(ActionEvent event) throws IOException {
        App.setRoot("telaBebida");
    }

    @FXML
    void trocarTelaEstacao(ActionEvent event) throws IOException {
        App.setRoot("telaEstacao");
    }

    @FXML
    void trocarTelaCarro(ActionEvent event) throws IOException {
        App.setRoot("telaCarro");
    }

    @FXML
    void trocarTelaRede(ActionEvent event) throws IOException {
        App.setRoot("telaRede");
    }

    @FXML
    void trocarTelaCor(ActionEvent event) throws IOException {
        App.setRoot("telaCor");
    }
}
