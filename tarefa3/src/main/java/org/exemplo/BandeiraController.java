package org.exemplo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


import java.io.IOException;

public class BandeiraController {

    @FXML
    private Button btn_nao;

    @FXML
    private Button btn_sim;

    @FXML
    private Button btn_voltar;

    @FXML
    private CheckBox cb_cm;

    @FXML
    private CheckBox cb_metros;

    @FXML
    private Label lb_haste;

    @FXML
    private Label lb_mensagem;

    @FXML
    private Label lb_pais;

    @FXML
    private Label lb_tam;

    @FXML
    private TextField tf_pais;

    @FXML
    private TextField tf_tam;

    @FXML
    void cmmedir(ActionEvent event) {
        Double v=Double.valueOf(tf_tam.getText());
        Bandeira bandeira=new Bandeira(tf_pais.getText(), v);
        lb_mensagem.setText(bandeira.cmmedir());

    }

    @FXML
    void mmedir(ActionEvent event) {
        Double v=Double.valueOf(tf_tam.getText());
        Bandeira bandeira=new Bandeira(tf_pais.getText(), v);
        lb_mensagem.setText(bandeira.mmedir());
    }

    @FXML
    void afirmar(ActionEvent event) {
        Double v=Double.valueOf(tf_tam.getText());
        Bandeira bandeira=new Bandeira(tf_pais.getText(), v);
        lb_mensagem.setText(bandeira.hastear());
    }

    @FXML
    void negar(ActionEvent event) {
        Double v=Double.valueOf(tf_tam.getText());
        Bandeira bandeira=new Bandeira(tf_pais.getText(), v);
        lb_mensagem.setText(bandeira.baixar());
    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
        App.setRoot("telaBemVindo");

    }

}
