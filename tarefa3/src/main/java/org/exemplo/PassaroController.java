package org.exemplo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.io.IOException;

public class PassaroController {

    @FXML
    private Button btn_voltar;

    @FXML
    private Label lb_atividade;

    @FXML
    private Label lb_cadastro;

    @FXML
    private Button lb_cantando;

    @FXML
    private Label lb_cor;

    @FXML
    private Button lb_dormindo;

    @FXML
    private Label lb_especie;

    @FXML
    private Label lb_mensagem;

    @FXML
    private Label lb_peso;

    @FXML
    private Button lb_voando;

    @FXML
    private TextField tf_cor;

    @FXML
    private TextField tf_especie;

    @FXML
    private TextField tf_peso;

    @FXML
    void cantar(ActionEvent event) {
            Double v=Double.valueOf(tf_peso.getText());
            Passaro passaro=new Passaro(tf_especie.getText(), v, tf_cor.getText());
            lb_mensagem.setText(passaro.cantar());
    }

    @FXML
    void dormir(ActionEvent event) {
        Double v=Double.valueOf(tf_peso.getText());
        Passaro passaro=new Passaro(tf_especie.getText(), v, tf_cor.getText());
        lb_mensagem.setText(passaro.dormir());

    }
    @FXML
    void voar(ActionEvent event) {
        Double v=Double.valueOf(tf_peso.getText());
        Passaro passaro=new Passaro(tf_especie.getText(), v, tf_cor.getText());
        lb_mensagem.setText(passaro.voar());

    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
        App.setRoot("telaBemVindo");

    }

}

