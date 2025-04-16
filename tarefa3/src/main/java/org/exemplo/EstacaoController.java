package org.exemplo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

public class EstacaoController {

    @FXML
    private TextField tf_nome;

    @FXML
    private TextField tf_clima;

    @FXML
    private DatePicker dp_inicio;

    @FXML
    private DatePicker dp_fim;

    @FXML
    private Button btn_iniciar;

    @FXML
    private Button btn_terminar;

    @FXML
    private Button btn_duracao;

    @FXML
    private Label lb_resultado;

    private Estacao estacao;

    @FXML
    private void iniciarEstacao() {
        if (preencherEstacao()) {
            estacao.iniciar();
            lb_resultado.setText("estação " + estacao.getNome() + " iniciada.");
        }
    }

    @FXML
    private void terminarEstacao() {
        if (preencherEstacao()) {
            estacao.terminar();
            lb_resultado.setText("estação " + estacao.getNome() + " finalizada.");
        }
    }

    private boolean preencherEstacao() {
        if (tf_nome.getText().isEmpty() || tf_clima.getText().isEmpty()
                || dp_inicio.getValue() == null || dp_fim.getValue() == null) {
            lb_resultado.setText("Preencha todos os campos corretamente!");
            return false;
        }

        estacao = new Estacao(
                tf_nome.getText(),
                tf_clima.getText(),
                dp_inicio.getValue(),
                dp_fim.getValue()
        );

        return true;
    }


    @FXML
    private void calcular() {
        System.out.println("Método calcular foi chamado.");
        if (preencherEstacao()) {
            System.out.println("Dados preenchidos corretamente!");
            System.out.println("Data inicio: " + dp_inicio.getValue() + " | Data fim: " + dp_fim.getValue());
            long duracao = estacao.calcular();
            System.out.println("Duração calculada: " + duracao);
            lb_resultado.setText("Duração da estação: " + duracao + " dias.");
        }
    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
        App.setRoot("telaBemVindo");
    }
}
