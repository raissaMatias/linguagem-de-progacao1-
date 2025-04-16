package org.exemplo;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CarroController {

    @FXML
    private TextField tf_modelo;

    @FXML
    private TextField tf_ano;

    @FXML
    private TextField tf_cor;

    @FXML
    private Label lb_mensagem;

    private Carro carro;

    @FXML
    private TextField nomeCorField;

    @FXML
    void vender(ActionEvent event) {
        int ano = Integer.parseInt(tf_ano.getText());

        carro = new Carro(
                tf_modelo.getText(),
                ano,
                tf_cor.getText()
        );

        carro.vender();
        lb_mensagem.setText("A loja possui o carro " + tf_modelo.getText() + " do ano " + ano + " da cor " + tf_cor.getText() +  " disponível");
    }

    @FXML
    void aVender() {
        int ano = Integer.parseInt(tf_ano.getText());

        carro = new Carro(
                tf_modelo.getText(),
                ano,
                tf_cor.getText()
        );

        carro.naoVendido();
        lb_mensagem.setText("A loja não possui o carro " + tf_modelo.getText() + " do ano " + ano + " da cor " + tf_cor.getText() +  " disponível");
    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
        App.setRoot("telaBemVindo");
    }
}