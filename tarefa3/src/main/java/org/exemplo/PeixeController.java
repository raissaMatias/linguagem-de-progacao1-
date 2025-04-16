package org.exemplo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class PeixeController {

    @FXML
    private Button btn_comendo;

    @FXML
    private Button btn_nadando;

    @FXML
    private Button btn_voltar;

    @FXML
    private Label lb_cor;

    @FXML
    private Label lb_especie;

    @FXML
    private Label lb_mensagem;

    @FXML
    private Label lb_tam;

    @FXML
    private TextField tf_cor;

    @FXML
    private TextField tf_especie;

    @FXML
    private TextField tf_tam;


    @FXML
    void nadar(ActionEvent event) {
        lb_especie.setText(tf_especie.getText());
        lb_cor.setText(tf_cor.getText());
        lb_tam.setText(tf_tam.getText());

        Peixe peixe = new Peixe(lb_especie.getText(), lb_cor.getText(), Double.valueOf(lb_tam.getText()));
        lb_mensagem.setText(peixe.nadar());
    }

    @FXML
    void alimentar(ActionEvent event) {
        lb_especie.setText(tf_especie.getText());
        lb_cor.setText(tf_cor.getText());
        lb_tam.setText(tf_tam.getText());

        org.exemplo.Peixe peixe = new Peixe(lb_especie.getText(), lb_cor.getText(), Double.valueOf(lb_tam.getText()));
        lb_mensagem.setText(peixe.alimentar());
    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
        App.setRoot("telaBemVindo");

    }
}