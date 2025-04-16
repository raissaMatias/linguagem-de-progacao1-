package org.exemplo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class RedeController {

    @FXML
    private TextField tf_nomeusuario;

    @FXML
    private Label lb_nomeusuario;

    @FXML
    private ListView<String> listaUsuarios;

    private Rede rede;

    @FXML
    public void initialize() {
        rede = new Rede("Minha Rede");
    }

    @FXML
    private void adicionar() {
        String nome = tf_nomeusuario.getText();

        if (nome != null && !nome.isBlank()) {
            rede = new Rede(nome);
            listaUsuarios.getItems().add(nome);
            lb_nomeusuario.setText(rede.adicionar());
            tf_nomeusuario.clear();
        } else {
            lb_nomeusuario.setText("Informe um nome!");
        }
    }

    @FXML
    private void remover() throws IOException {
        String nomeSelecionado = listaUsuarios.getSelectionModel().getSelectedItem();

        if (nomeSelecionado != null) {
            listaUsuarios.getItems().remove(nomeSelecionado);
            rede = new Rede(nomeSelecionado);
            lb_nomeusuario.setText(rede.remover());
        } else {
            lb_nomeusuario.setText("Selecione um nome para remover.");
        }
    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
        App.setRoot("telaBemVindo");
    }
}
