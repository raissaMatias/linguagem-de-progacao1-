```java
import java.util.Scanner; // a classe scanner está dentro do pacote java.util e é usado para capturar a entrada do usuário

public class DuracaoJogo {
    public static void main(String[] args) { //método principal onde o programa começa
        Scanner scanner = new Scanner(System.in); // cria um novo obj da classe scanner. Scanner é a biblioteca, scanner variável que irá armazenar a instância da classe Scanner e new Scanner um novo obj da classe scanner

        // leitura da entrada de dados do user 
        System.out.print("informe a hora em que o jogo começou (apenas horas): ");
        int horaInicio = scanner.nextInt();

        System.out.print("informe a hora em que o jogo terminou (apenas horas): ");
        int horaFim = scanner.nextInt(); //scanner é instancia do obj da classe Scanner e o next é o método da classe e tbm  próprio valor fornecido pelo usuário

        // calculo 
        int duracao;
        if (horaFim > horaInicio) {
            // quando o jogo termina no mesmo dia
            duracao = horaFim - horaInicio;
        } else {
            // quando o jogo termina no dia seguinte
            duracao = (24 - horaInicio) + horaFim;
        }

        // resultado do calculo de duracao do jogo
        System.out.println("o jogo teve duração de " + duracao + " horas.");
    }
}

```
