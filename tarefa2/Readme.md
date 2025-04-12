# Tarefa2 - Classes, métodos, atributos e laços de repetição  24/3
# exercício 1
![image](https://github.com/user-attachments/assets/26ed13d3-9aae-426b-8a19-ee06cfb04514)

![image](https://github.com/user-attachments/assets/68466d0f-df89-4526-b6c2-c53743780cc2)

![image](https://github.com/user-attachments/assets/d3f2bd8e-50e7-40b5-96db-c6a51d7857af)

![image](https://github.com/user-attachments/assets/42276529-f713-41ac-bb48-6fc65e19f90d)

![image](https://github.com/user-attachments/assets/006c4450-61d6-4f65-8a29-841b96e280e3)

![image](https://github.com/user-attachments/assets/7bae76de-a87a-4be6-90eb-02751128abf8)

![image](https://github.com/user-attachments/assets/53ba272c-1fde-4973-ac88-3301ecff3a24)

![image](https://github.com/user-attachments/assets/66434698-1eda-40e4-af2f-d1114756048f)

![image](https://github.com/user-attachments/assets/f012dceb-7230-4b88-a508-34876dba6cb9)

![image](https://github.com/user-attachments/assets/c487223f-0cd2-44aa-a161-5496acf046bf)

# exercício 2
# 1 CLASSE PEIXES
+--------------------+
|      Peixe        |
+--------------------+
| - especie: String |
| - cor: String     |
| - tamanho: double |
+--------------------+
| + Peixe(String, String, double) |
| + nadar()                       |
| + comer()                       |
| + exibirInfo()                  |
+--------------------+


# 2 CLASSE CARROS 

+----------------------+
|        Carro        |
+----------------------+
| - modelo: String    |
| - ano: int         |
| - velocidade: double |
+----------------------+
| + Carro(String, int) |
| + acelerar(double)   |
| + frear(double)      |
| + estacionar()       |
| + exibirStatus()     |
+----------------------+

# 3 CLASSE PÁSSAROS

+------------------------+
|       Passaros          |
+------------------------+
| - especie: String       |
| - peso: double          |
| - cor: String           |
+------------------------+
| + Passaros(especie: String, peso: double, cor: String) |
| + voar(): void          |
| + cantar(): void        |
| + dormir(): void        |
| + getEspecie(): String  |
| + setEspecie(especie: String): void |
| + getPeso(): double     |
| + setPeso(peso: double): void |
| + getCor(): String      |
| + setCor(cor: String): void |
+------------------------+

# 4 CLASSE SAPATOS 

+--------------------------+
|        Sapatos            |
+--------------------------+
| - tipo: String            |
| - cor: String             |
| - tamanho: double         |
+--------------------------+
| + Sapatos(tipo: String, cor: String, tamanho: double) |
| + calçar(): void          |
| + descalçar(): void       |
| + mostrarDetalhes(): void |
| + getTipo(): String       |
| + setTipo(tipo: String): void |
| + getCor(): String        |
| + setCor(cor: String): void |
| + getTamanho(): double    |
| + setTamanho(tamanho: double): void |
+--------------------------+

# 5 CLASSE BANDEIRAS 

+------------------------------+
|          Bandeiras            |
+------------------------------+
| - pais: String                |
| - corPrimaria: String         |
| - tamanho: double             |
+------------------------------+
| + Bandeiras(pais: String, corPrimaria: String, tamanho: double) |
| + hastear(): void             |
| + baixar(): void              |
| + exibirDetalhes(): void      |
| + getPais(): String           |
| + setPais(pais: String): void |
| + getCorPrimaria(): String    |
| + setCorPrimaria(cor: String): void |
| + getTamanho(): double        |
| + setTamanho(tamanho: double): void |
+------------------------------+

# 6 CLASSE BEBIDAS

+---------------------------+
|          Bebidas           |
+---------------------------+
| - nome: String             |
| - volume: double           |
| - tipo: String             |
+---------------------------+
| + Bebidas(nome: String, volume: double, tipo: String) |
| + abrir(): void            |
| + beber(): void            |
| + exibirDetalhes(): void   |
| + getNome(): String        |
| + setNome(nome: String): void |
| + getVolume(): double      |
| + setVolume(volume: double): void |
| + getTipo(): String        |
| + setTipo(tipo: String): void |
+---------------------------+

# 7 CLASSE ESTAÇÔES DO ANO
+----------------------------+
|        EstacoesDoAno        |
+----------------------------+
| - nome: String              |
| - duracaoEmDias: int        |
| - clima: String             |
+----------------------------+
| + EstacoesDoAno(nome: String, duracaoEmDias: int, clima: String) |
| + iniciar(): void           |
| + terminar(): void          |
| + exibirDetalhes(): void    |
| + getNome(): String         |
| + setNome(nome: String): void |
| + getDuracaoEmDias(): int   |
| + setDuracaoEmDias(duracaoEmDias: int): void |
| + getClima(): String        |
| + setClima(clima: String): void |
+----------------------------+

# 8 CLASSE CORES 

+------------------------------+
|            Cores              |
+------------------------------+
| - nome: String                |
| - codigoHexadecimal: String   |
| - primaria: boolean           |
+------------------------------+
| + Cores(nome: String, codigoHexadecimal: String, primaria: boolean) |
| + exibirCor(): void           |
| + verificarCorPrimaria(): void |
| + mudarCor(novaCor: String, novoCodigoHexadecimal: String): void |
| + getNome(): String           |
| + setNome(nome: String): void |
| + getCodigoHexadecimal(): String |
| + setCodigoHexadecimal(codigoHexadecimal: String): void |
| + isPrimaria(): boolean       |
| + setPrimaria(primaria: boolean): void |
+------------------------------+

# 9 CLASSE REDES SOCIAIS 

+----------------------------------+
|          RacasDeCachorros        |
+----------------------------------+
| - nome: String                   |
| - tamanho: String                |
| - temperamento: String           |
+----------------------------------+
| + RacasDeCachorros(nome: String, tamanho: String, temperamento: String) |
| + exibirInformacoes(): void      |
| + alimentar(): void              |
| + brincar(): void                |
| + getNome(): String              |
| + setNome(nome: String): void    |
| + getTamanho(): String           |
| + setTamanho(tamanho: String): void |
| + getTemperamento(): String      |
| + setTemperamento(temperamento: String): void |
+----------------------------------+


# 10 CLASSE RAÇAS DE CACHORROS

+----------------------------------+
|          RacasDeCachorros        |
+----------------------------------+
| - nome: String                   |
| - tamanho: String                |
| - temperamento: String           |
+----------------------------------+
| + RacasDeCachorros(nome: String, tamanho: String, temperamento: String) |
| + exibirInformacoes(): void      |
| + alimentar(): void              |
| + brincar(): void                |
| + getNome(): String              |
| + setNome(nome: String): void    |
| + getTamanho(): String           |
| + setTamanho(tamanho: String): void |
| + getTemperamento(): String      |
| + setTemperamento(temperamento: String): void |
+----------------------------------+

# exercício 3
# 1
```java
package org.exemplo;

public class Peixe {

    private String especie;
    private String cor;
    private double tamanho;


    public Peixe(String especie, String cor, double tamanho) {
        this.especie = especie;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public String alimentar() {
        return("O peixe  " + especie + "está comendo");
    }

    public String nadar() {
        return("O peixe  " + especie + "está nadando");
    }

    public void exibirInfo() {
        System.out.println("Espécie: " + especie);
        System.out.println("Cor: " + cor);
        System.out.println("Tamanho: " + tamanho);
    }
}
```
# 2
 ```java
public class Carro {
    // Atributos
    private String modelo;     
    private int ano;           
    private double velocidade; 

    // Construtor
    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0.0; // Inicializa a velocidade com 0
    }

    // Métodos
    public void acelerar(double incremento) {
        if (incremento > 0) {
            velocidade += incremento;
            System.out.println("O carro acelerou. Velocidade atual: " + velocidade + " km/h.");
        } else {
            System.out.println("O incremento deve ser positivo para acelerar.");
        }
    }

    public void frear(double decremento) {
        if (decremento > 0 && velocidade - decremento >= 0) {
            velocidade -= decremento;
            System.out.println("O carro freou. Velocidade atual: " + velocidade + " km/h.");
        } else if (de
```
# 3
```java
package org.exemplo;

public class Passaro {
    // 3 atributos
    private String especie;
    private double peso;
    private String cor;

    // 3 construtores
    public Passaro (String especie, double peso, String cor) {
        this.especie = especie;
        this.peso = peso;
        this.cor = cor;
    }

    // dois metodos
    public String cantar() {
        return("O passarro  " + especie + "está cantando");
    }

    public String dormir() {
        return("O pássaro está dormindo " + especie + "!");
    }

    public String voar() {return("O pássaro" + especie + "está voando");
}

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
```
# 4
```java
package org.exemplo;

public class Sapato {

    private String tipo;
    private String cor;
    private double tamanho;

    public Sapato (String tipo, String cor, double tamanho) {
        this.tipo = tipo;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public String calcar() {
        return("O sapato " + tipo + "da cor "+ cor + ", do tamanho " + tamanho + "está sendo calçado!");
    }
    public String descalcar() { return("O sapato " + tipo + "da cor ,"+ cor + ", do tamanho " + tamanho + "NÃO está sendo calçado!");
    }

    // get and set
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
}
```
# 5
```java
package org.exemplo;

public class Bandeira {
    // 3 atributos
    private String pais;
    private double tamanho;

    // Construtor
    public Bandeira(String pais, double tamanho) {
        this.pais = pais;
        this.tamanho = tamanho;
    }

    // 2 metodos
    public String hastear() {
        return "A bandeira do " + pais + " de tamanho " + tamanho + " está hasteada!";
    }

    public String baixar() {
        return "A bandeira do " + pais + " de tamanho " + tamanho + " está baixada!";
    }

    public String cmmedir() {
        return "Bandeira tem " + tamanho + " cm";
    }

    public String mmedir() {
        return "Bandeira tem " + tamanho + " m";
    }

    // get and set
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }


    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
}

```
# 6  
```java
package org.exemplo;
public class Bebida{
    // 3 atributos
    private String nome;
    private double volume;
    private String tipo;
    // 3 metodos
    public Bebida(String nome, double volume, String tipo) {
        this.nome = nome;
        this.volume = volume;
        this.tipo = tipo;
    }
    // 2 metodos
    public String abrir() {
        return("A bebida " + nome + " foi aberta!");
    }

    public String beber() {
        return ("Você está bebendo " + nome + "!");
    }

    // get and set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
```
# 7 
```java
package org.exemplo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Estacao{
    // 4 atributos
    private String nome;
    private String clima;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    // 4 construtores
    public Estacao(String nome, String clima, LocalDate dataInicio, LocalDate dataFim) {
        this.nome = nome;
        this.clima = clima;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    // 3 métodos
    public void iniciar() {
        System.out.println("A estação " + nome + " iniciou!");
    }

    public void terminar() {
        System.out.println("A estação " + nome + " terminou!");
    }

    public long calcularDuracao() {
        return ChronoUnit.DAYS.between(dataInicio, dataFim);
    }

    // get and set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }
}
```
# 8 
```java
public class Cor {
    // Atributos
    private String nome; 
    private String codigoHexadecimal; 
    private boolean primaria; 

    //construtor
    public Cor(String nome, String codigoHexadecimal, boolean primaria) {
        this.nome = nome;
        this.codigoHexadecimal = codigoHexadecimal;
        this.primaria = primaria;
    }
    // Métodos
    public void exibirCor() {
        System.out.println("A cor é " + nome + " e o código hexadecimal é " + codigoHexadecimal);
    }
    public void verificarCorPrimaria() {
        if (primaria) {
            System.out.println(nome + " é uma cor primária.");
        } else {
            System.out.println(nome + " não é uma cor primária.");
        }
    }
    public void mudarCor(String novaCor, String novoCodigoHexadecimal) {
        this.nome = novaCor;
        this.codigoHexadecimal = novoCodigoHexadecimal;
        System.out.println("A cor foi alterada para " + nome + " com o código hexadecimal " + codigoHexadecimal);
    }
    // Métodos Getter e Setter
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCodigoHexadecimal() {
        return codigoHexadecimal;
    }

    public void setCodigoHexadecimal(String codigoHexadecimal) {
        this.codigoHexadecimal = codigoHexadecimal;
    }
    public boolean isPrimaria() {
        return primaria;
    }
    public void setPrimaria(boolean primaria) {
        this.primaria = primaria;
    }
}
```
# 9 
```java
redes
```
# 10
```java
package org.exemplo;

public class Cachorro {

    // 3 atributos
    private String nome;
    private String tamanho;
    private String temperamento;

    // 3 construtores
    public Cachorro(String nome, String tamanho, String temperamento) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.temperamento = temperamento;
    }

    // 2 metodos
    public void exibirInformacoes() {
        System.out.println("Raça: " + nome);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Temperamento: " + temperamento);
    }

    public String alimentar() {
        return("O cachorro  " + nome + "está comendo");
    }

    public String brincar() {
       return("O cachorro está brincando " + nome + "!");
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTemperamento() {
        return temperamento;
    }

    public void setTemperamento(String temperamento) {
        this.temperamento = temperamento;
    }
}

```
# exercício 4 
```java
public class TestaClasse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //criacao de objetos
        Fracao fracao1 = new Fracao(2, 5);
        Fracao fracao2 = new Fracao(3, 7);

        int opcao;
        do {
            // Exibir menu
            System.out.println("\nMenu de Opções:");
            System.out.println("1 - Somar frações");
            System.out.println("2 - Subtrair frações");
            System.out.println("3 - Multiplicar frações");
            System.out.println("4 - Dividir frações");
            System.out.println("5 - Exibir frações");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Soma
                    Fracao resultadoSoma = fracao1.adicionar(fracao2);
                    System.out.println("Resultado da soma: " + resultadoSoma.exibir());
                    break;
                case 2:
                    // Subtração
                    Fracao resultadoSubtracao = fracao1.subtrair(fracao2);
                    System.out.println("Resultado da subtração: " + resultadoSubtracao.exibir());
                    break;
                case 3:
                    // Multiplicação
                    Fracao resultadoMultiplicacao = fracao1.multiplicar(fracao2);
                    System.out.println("Resultado da multiplicação: " + resultadoMultiplicacao.exibir());
                    break;
                case 4:
                    // Divisão
                    try {
                        Fracao resultadoDivisao = fracao1.dividir(fracao2);
                        System.out.println("Resultado da divisão: " + resultadoDivisao.exibir());
                    } catch (ArithmeticException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                case 5:
                    // Exibir frações
                    System.out.println("Fracao 1: " + fracao1.exibir());
                    System.out.println("Fracao 2: " + fracao2.exibir());
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 6); // O loop continua até que o usuário escolha a opção 6 para sair.

        scanner.close();
    }
}
```
# exercício 5
```java
public class Fracao {
    private int numerador;
    private int denominador;

    // Construtor
    public Fracao(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("Denominador não pode ser zero.");
        }
        this.numerador = numerador;
        this.denominador = denominador;
        simplificar();  // Simplifica a fração automaticamente ao criar
    }

    // Método para simplificar a fração
    private void simplificar() {
        int gcd = gcd(numerador, denominador); // Encontrando o GCD
        numerador /= gcd;
        denominador /= gcd;
    }

    // Método para calcular o maior divisor comum (GCD)
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Operações

    public Fracao adicionar(Fracao outra) {
        int novoNumerador = this.numerador * outra.denominador + outra.numerador * this.denominador;
        int novoDenominador = this.denominador * outra.denominador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    public Fracao subtrair(Fracao outra) {
        int novoNumerador = this.numerador * outra.denominador - outra.numerador * this.denominador;
        int novoDenominador = this.denominador * outra.denominador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    public Fracao multiplicar(Fracao outra) {
        int novoNumerador = this.numerador * outra.numerador;
        int novoDenominador = this.denominador * outra.denominador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    public Fracao dividir(Fracao outra) {
        if (outra.numerador == 0) {
            throw new ArithmeticException("Não é possível dividir por zero.");
        }
        int novoNumerador = this.numerador * outra.denominador;
        int novoDenominador = this.denominador * outra.numerador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    // Método para exibir a fração
    public String exibir() {
        return numerador + "/" + denominador;
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando frações
        Fracao fracao1 = new Fracao(2, 5);   // 2/5
        Fracao fracao2 = new Fracao(3, 7);   // 3/7

        // Operações
        Fracao soma = fracao1.adicionar(fracao2); // Soma: (2/5 + 3/7)
        Fracao subtracao = fracao1.subtrair(fracao2); // Subtração: (2/5 - 3/7)
        Fracao multiplicacao = fracao1.multiplicar(fracao2); // Multiplicação: (2/5 * 3/7)
        Fracao divisao = fracao1.dividir(fracao2); // Divisão: (2/5 ÷ 3/7)

        // Exibindo resultados
        System.out.println("Soma: " + soma.exibir()); // Resultado da soma
        System.out.println("Subtração: " + subtracao.exibir()); // Resultado da subtração
        System.out.println("Multiplicação: " + multiplicacao.exibir()); // Resultado da multiplicação
        System.out.println("Divisão: " + divisao.exibir()); // Resultado da divisão
    }
}

```
# a saída será 
Soma: 29/35
Subtração: -1/35
Multiplicação: 6/35
Divisão: 14/15
```
