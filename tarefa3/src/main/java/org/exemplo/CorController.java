package org.exemplo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

import java.io.IOException;


public class CorController {


    @FXML
    private Button btn_verifica;

    @FXML
    private TextField tf_cor;

    @FXML
    private Label lb_mensagem;

    @FXML
    private Label lb_cor;

    public String verificandoCor(String nomeCor) {
        Cor cor = new Cor(nomeCor);
        String mensagem = "color";

        if (cor.primaria()) {
            mensagem = "A cor " + cor.getNome() + " é primária.";
        } else if (cor.secundaria()) {
            mensagem = "A cor " + cor.getNome() + " é secundária.";
        } else if (cor.neutra()) {
            mensagem = "A cor " + cor.getNome() + " é neutra.";
        } else {
            mensagem = "A cor " + cor.getNome() + " não pertence a nenhuma das 3 classes (primária, secundária ou neutra).";
        }

        return mensagem;
    }

    @FXML
    public void verificaCor(javafx.event.ActionEvent actionEvent) {
        String nome = tf_cor.getText();
        String mensagem = verificandoCor(nome);
        lb_mensagem.setText(mensagem);
    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
        App.setRoot("telaBemVindo");
    }
}
