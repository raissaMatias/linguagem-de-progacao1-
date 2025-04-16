package org.exemplo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class BebidaController {

    @FXML
    private Button btn_abrir;

    @FXML
    private Button btn_beber;

    @FXML
    private Button btn_voltar;

    @FXML
    private Label lb_mensagem;

    @FXML
    private Label lb_nome;

    @FXML
    private Label lb_tipo;

    @FXML
    private Label lb_vol;

    @FXML
    private TextField tf_nome;

    @FXML
    private TextField tf_tipo;

    @FXML
    private TextField tf_volume;

    @FXML
    void abrir(ActionEvent event) {
        Double v=Double.valueOf(tf_volume.getText());
        Bebida bebida=new Bebida(tf_nome.getText(), v, tf_tipo.getText());
        lb_mensagem.setText(bebida.abrir());

    }

    @FXML
    void beber(ActionEvent event) {
        Double v=Double.valueOf(tf_volume.getText());
        Bebida bebida=new Bebida(tf_nome.getText(), v, tf_tipo.getText());
        lb_mensagem.setText(bebida.beber());
    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
        App.setRoot("telaBemVindo");

    }

}

