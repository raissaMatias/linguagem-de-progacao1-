package org.exemplo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class CaninoController {

    @FXML
    private Button btn_alimento;

    @FXML
    private Button btn_brincando;

    @FXML
    private Button btn_voltar;

    @FXML
    private ImageView img;

    @FXML
    private Label lb_mensagem;

    @FXML
    private TextField tf_nome;

    @FXML
    private TextField tf_tam;

    @FXML
    private TextField tf_temp;

    @FXML
    void brincar(ActionEvent event) {
        Cachorro cao=new Cachorro(tf_nome.getText(), tf_tam.getText(),tf_temp.getText());
        lb_mensagem.setText(cao.brincar());
    }

    @FXML
    void comer(ActionEvent event) {
        Cachorro cao=new Cachorro(tf_nome.getText(), tf_tam.getText(),tf_temp.getText());
        lb_mensagem.setText(cao.alimentar());
    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
        App.setRoot("telaBemVindo");

    }

}
