# Lista 1 

# exercício1
```java   
import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // recebe os dados do usuário
        System.out.print("informe a idade em anos: ");
        int anos = scanner.nextInt();
        
        System.out.print("informe a idade em meses: ");
        int meses = scanner.nextInt();
        
        System.out.print("informe a idade em dias: ");
        int dias = scanner.nextInt();
        
        // calculo
        int idadeEmDias = (anos * 365) + (meses * 30) + dias;
        
        // saida de resultado
        System.out.println("A idade em dias é: " + idadeEmDias);
        
        scanner.close();
    }
}
```
# TESTE DE MESA EXERCICIO 1
1) entrada
  anos: 21
  meses: 11
  dias: 15
2) saída: 8010 DIAS

# exercício 2 

``` java
import java.util.Scanner;

public class PercentualVotos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // lê os dados fornecidos pelo user
        System.out.print("informe o número total de eleitores: ");
        int totalEleitores = scanner.nextInt();
        
        System.out.print("informe o número de votos brancos: ");
        int votosBrancos = scanner.nextInt();
        
        System.out.print("informe o número de votos nulos: ");
        int votosNulos = scanner.nextInt();
        
        System.out.print("informe o número de votos válidos: ");
        int votosValidos = scanner.nextInt();
        
        // verifica se ha erro, ou seja, numero de votos diferente de numero de eleitores
        int somaVotos = votosBrancos + votosNulos + votosValidos;
        if (somaVotos != totalEleitores) {
            System.out.println("Erro: A soma dos votos não corresponde ao total de eleitores.");
        } else {
            // calculo das porcentagem
            double percentualBrancos = (votosBrancos * 100.0) / totalEleitores;
            double percentualNulos = (votosNulos * 100.0) / totalEleitores;
            double percentualValidos = (votosValidos * 100.0) / totalEleitores;
            
            // resultado final
            System.out.printf("Percentual de votos brancos: %.2f%%\n", percentualBrancos);
            System.out.printf("Percentual de votos nulos: %.2f%%\n", percentualNulos);
            System.out.printf("Percentual de votos válidos: %.2f%%\n", percentualValidos);
        }
        
        scanner.close();
    }
}
```
# TESTE DE MESA EXERCICIO 2 
1) informe o número total de eleitores: 100
informe o número de votos brancos: 40
informe o número de votos nulos: 20
informe o número de votos válidos: 20
Erro: A soma dos votos não corresponde ao total de eleitores.
2) informe o número total de eleitores: 100
informe o número de votos brancos: 30
informe o número de votos nulos: 30
informe o número de votos válidos: 40
Percentual de votos brancos: 30.00%
Percentual de votos nulos: 30.00%
Percentual de votos válidos: 40.00%

# exercício 3
```java
import java.util.Scanner;

public class ReajusteSalarial {
    public static void main(String[] args) {
        // Criação do objeto Scanner para ler as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o salário atual
        System.out.print("informe o salário mensal atual do funcionário: ");
        double salarioAtual = scanner.nextDouble();

        // Solicita o percentual de reajuste
        System.out.print("Digite o percentual de reajuste (%): ");
        double percentualReajuste = scanner.nextDouble();

        // calculo do valor do reajuste
        double aumento = salarioAtual * (percentualReajuste / 100);

        // Calculo do novo salário
        double novoSalario = salarioAtual + aumento;

        // novo salário
        System.out.printf("O novo salário do funcionário será: R$ %.2f\n", novoSalario);

        scanner.close();
    }
}
```
# TESTE DE MESA 
1) Digite o salário mensal atual do funcionário: 3000
Digite o percentual de reajuste (%): 2
O novo salário do funcionário será: R$ 3060

# exercício 4 
```java
import java.util.Scanner;

public class CustoCarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // solicita o custo de fábrica do carro
        System.out.print("qual o custo de fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();

        // definicão da porcentagem (distribuidor e impostos)
        double percentualDistribuidor = 0.28; // 28%
        double percentualImpostos = 0.45; // 45%

        // calculo dos valores adicionais
        double valorDistribuidor = custoFabrica * percentualDistribuidor;
        double valorImpostos = custoFabrica * percentualImpostos;

        // calculo do custo final
        double custoFinal = custoFabrica + valorDistribuidor + valorImpostos;

        // fornece os resultados
        System.out.printf("O custo final ao consumidor é: R$ %.2f%n", custoFinal);

        scanner.close();
    }
}
# TESTE DE MESA EXERCICIO 4
1) qual o custo de fábrica do carro: 50.000
Distribuidor: 50.000 * 0.28 = R$ 14.000
Impostos: 50.000 * 0.45 = R$ 22.500
Custo final: 50.000 + 14.000 + 22.500 = R$ 86.500
O custo final ao consumidor é: R$ 86.500

# exercício 5 
import java.util.Scanner;

public class SalarioVendedor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // solicita informacao do usuário 
        System.out.print("informe o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("informe o número de carros vendidos: ");
        int carrosVendidos = scanner.nextInt();

        System.out.print("Digite o valor total das vendas: ");
        double valorTotalVendas = scanner.nextDouble();

        System.out.print("Digite o valor recebido por carro vendido: ");
        double valorPorCarro = scanner.nextDouble();

        // calculo de comissao (carros vendidos)
        double comissaoPorCarros = carrosVendidos * valorPorCarro;

        // calcula a comissão de 5% em relação o valor total das vendas
        double comissaoSobreVendas = valorTotalVendas * 0.05;

        // salário final
        double salarioFinal = salarioFixo + comissaoPorCarros + comissaoSobreVendas;

        // resultado
        System.out.printf("O salário final do vendedor é: R$ %.2f%n", salarioFinal);

        scanner.close();
    }
}
# TESTE DE MESA EXERCICIO 
1) Digite o salário fixo do vendedor: 1500
Digite o nÚmero de carros vendidos: 20
Digite o valor total das vendas: 150000
Digite o valor recebido por carro vendido: 350
O salário final do vendedor é: R$ 16000.00

# exercício 6 
```java
import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário a temperatura em Fahrenheit
        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Fórmula de conversão para Celsius: C = (F - 32) * 5/9
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Exibe o resultado formatado
        System.out.printf("A temperatura em Celsius é: %.2f°C%n", celsius);

        scanner.close();
    }
}
```
# TESTE DE MESA exercício 6
1) Digite a temperatura em graus Fahrenheit: 100
   A temperatura em Celsius é: 37.78 ºC
2) Digite a temperatura em graus Fahrenheit: 80
   A temperatura em Celsius é: 26.67 ºC

# exercício 7 
```java
import java.util.Scanner;

public class VerificaValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // solicita a entrada de um número
        System.out.print("informe um valor: ");
        double valor = scanner.nextDouble();

        // Verifica se é maior que 10 e exibe a mensagem correspondente
        if (valor > 10) {
            System.out.println("o número é maior que 10!");
        } else {
            System.out.println("o número NÃO É MAIOR que 10!");
        }

        scanner.close();
}

}
```
# TESTE DE MESA 
1) informe um valor: 9
o número NÃO É MAIOR que 10!
2) informe um valor: 11
o número é maior que 10!

# exercício 8
```java
import java.util.Scanner;

public class VerificaPositivoNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // solicita um numero
        System.out.print("informe um valor: ");
        double valor = scanner.nextDouble();

        //verifica se é positivo ou nao (zero é positivo)
        if (valor >= 0) {
            System.out.println("O valor é POSITIVO.");
        } else {
            System.out.println("O valor é NEGATIVO.");
        }

        scanner.close();
    }
}
# TESTE DE MESA exercício 8 

1) valor = 55
   saída: O valor é POSITIVO.
2) valor = -12
   sáida: O valor é NEGATIVO.

# exercício 9
```java
import java.util.Scanner;

public class CompraMaca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // entrada do usuário sobre quantidade de maçãs compradas
        System.out.print("Digite o número de maçãs compradas: ");
        int quantidade = scanner.nextInt();

        // Define o preço por maçã com base na quantidade comprada
        double precoPorMaca = (quantidade < 12) ? 1.30 : 1.00;

        // Calcula o custo total
        double custoTotal = quantidade * precoPorMaca;

        // Exibe o resultado
        System.out.printf("O custo total da compra é: R$ %.2f%n", custoTotal);

        scanner.close();
    }
}
# TESTE DE MESA exercício 9 
1) quantidade: 10
   O custo total da compra é: 13,00
2) quantitade: 12
   O custo total da compra é: 12,00
3) quantidade: 20
    O custo total da compra é: 20,00
4) quantidade: 9
    O custo total da compra é: 11,70

# exercio 10
```java
import java.util.Scanner;

public class VerificaAprovacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // recebe as notas das avaliações
        System.out.print("informe a nota da 1ª avaliação: ");
        double nota1 = scanner.nextDouble();

        System.out.print("informe a nota da 2ª avaliação: ");
        double nota2 = scanner.nextDouble();

        // calculo da média aritmética
        double media = (nota1 + nota2) / 2;

        // resultado da média calculada
        System.out.printf("Média do aluno: %.2f%n", media);

        // Verifica se o aluno foi aprovado ou reprovado
        if (media >= 6) {
            System.out.println("Aluno APROVADO!");
        } else {
            System.out.println("Aluno REPROVADO!");
        }

        scanner.close();
    }
# TESTE DE MESA 10 
1) nota1: 8
   nota2: 5
   saída: Média do aluno: 6.50
   Aluno APROVADO!
2) nota1: 8
   nota2: 4
   saída: Média do aluno: 6.00
   Aluno APROVADO!
3) nota1: 8
   nota2: 3
   saída: Média do aluno: 5.50
   Aluno REPROVADO! 
