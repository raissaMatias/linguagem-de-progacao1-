package org.exemplo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class SapatoController {

    @FXML
    private Button btn_calcar;

    @FXML
    private Button btn_naocalcado;

    @FXML
    private Button btn_voltar;

    @FXML
    private Label lb_cor;

    @FXML
    private Label lb_tam;

    @FXML
    private Label lb_mensagem;

    @FXML
    private Label lb_tipo;

    @FXML
    private TextField tf_cor;

    @FXML
    private TextField tf_tam;

    @FXML
    private TextField tf_tipo;

    @FXML
    void calcar(ActionEvent event) {
        lb_tipo.setText(tf_tipo.getText());
        lb_cor.setText(tf_cor.getText());
        Double v=Double.valueOf(tf_tam.getText());

        Sapato sapato = new Sapato(lb_tipo.getText(), lb_cor.getText(), v);
        lb_mensagem.setText(sapato.calcar());
    }
    @FXML
    void descalcar(ActionEvent event) {
        lb_tipo.setText(tf_tipo.getText());
        lb_cor.setText(tf_cor.getText());
        Double v=Double.valueOf(tf_tam.getText());

        Sapato sapato = new Sapato(lb_tipo.getText(), lb_cor.getText(), v);
        lb_mensagem.setText(sapato.descalcar());
    }
    @FXML
    void voltar(ActionEvent event) throws IOException {
        App.setRoot("telaBemVindo");

    }

}
