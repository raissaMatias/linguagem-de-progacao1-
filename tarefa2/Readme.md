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
public class Peixe {
    // Atributos
    private String especie;  
    private String cor;      
    private double tamanho; 

    // Construtor
    public Peixe(String especie, String cor, double tamanho) {
        this.especie = especie;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    // Métodos
    public void nadar() {
        System.out.println("O peixe está nadando!");
    }

    public void comer() {
        System.out.println("O peixe está comendo.");
    }

    public void exibirInfo() {
        System.out.println("Espécie: " + especie);
        System.out.println("Cor: " + cor);
        System.out.println("Tamanho: " + tamanho +
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
public class Passaros {
    // Atributos
    private String especie;
    private double peso;
    private String cor;

    // Construtor
    public Passaros(String especie, double peso, String cor) {
        this.especie = especie;
        this.peso = peso;
        this.cor = cor;
    }

    // Métodos
    public void voar() {
        System.out.println("O pássaro está voando!");
    }

    public void cantar() {
        System.out.println("O pássaro está cantando!");
    }

    public void dormir() {
        System.out.println("O pássaro está dormindo!");
    }

    // Métodos Getter e Setter
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
public class Sapatos {
    // Atributos
    private String tipo;
    private String cor;
    private double tamanho;

    // Construtor
    public Sapatos(String tipo, String cor, double tamanho) {
        this.tipo = tipo;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    // Métodos
    public void calçar() {
        System.out.println("O sapato está sendo calçado!");
    }

    public void descalçar() {
        System.out.println("O sapato foi descalçado!");
    }

    public void mostrarDetalhes() {
        System.out.println("Tipo: " + tipo + ", Cor: " + cor + ", Tamanho: " + tamanho);
    }

    // Métodos Getter e Setter
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
```
public class Bandeiras {
    // Atributos
    private String pais;
    private String corPrimaria;
    private double tamanho;

    // Construtor
    public Bandeiras(String pais, String corPrimaria, double tamanho) {
        this.pais = pais;
        this.corPrimaria = corPrimaria;
        this.tamanho = tamanho;
    }

    // Métodos
    public void hastear() {
        System.out.println("A bandeira está sendo hasteada!");
    }

    public void baixar() {
        System.out.println("A bandeira foi baixada!");
    }

    public void exibirDetalhes() {
        System.out.println("País: " + pais + ", Cor Primária: " + corPrimaria + ", Tamanho: " + tamanho);
    }

    // Métodos Getter e Setter
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCorPrimaria() {
        return corPrimaria;
    }

    public void setCorPrimaria(String corPrimaria) {
        this.corPrimaria = corPrimaria;
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
public class Bebidas {
    // Atributos
    private String nome;
    private double volume; 
    private String tipo; 

    // Construtor
    public Bebidas(String nome, double volume, String tipo) {
        this.nome = nome;
        this.volume = volume;
        this.tipo = tipo;
    }

    // Métodos
    public void abrir() {
        System.out.println("A bebida " + nome + " foi aberta!");
    }

    public void beber() {
        System.out.println("Você está bebendo " + nome + "!");
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome + ", Volume: " + volume + "ml, Tipo: " + tipo);
    }

    // Métodos Getter e Setter
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
public class EstacoesDoAno {
    // Atributos
    private String nome;
    private int duracaoEmDias; 
    private String clima; 

    // Construtor
    public EstacoesDoAno(String nome, int duracaoEmDias, String clima) {
        this.nome = nome;
        this.duracaoEmDias = duracaoEmDias;
        this.clima = clima;
    }

    // Métodos
    public void iniciar() {
        System.out.println("A estação " + nome + " iniciou!");
    }

    public void terminar() {
        System.out.println("A estação " + nome + " terminou!");
    }

    public void exibirDetalhes() {
        System.out.println("Estação: " + nome + ", Duração: " + duracaoEmDias + " dias, Clima: " + clima);
    }

    // Métodos Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracaoEmDias() {
        return duracaoEmDias;
    }

    public void setDuracaoEmDias(int duracaoEmDias) {
        this.duracaoEmDias = duracaoEmDias;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }
}
```
# 8 
```java
public class Cores {
    // Atributos
    private String nome; 
    private String codigoHexadecimal; 
    private boolean primaria; 

    //construtor
    public Cores(String nome, String codigoHexadecimal, boolean primaria) {
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
public class RedesSociais {
    // Atributos
    private String nome; 
    private int numeroDeUsuarios; 
    private boolean possuiMensagensPrivadas; 

    // Construtor
    public RedesSociais(String nome, int numeroDeUsuarios, boolean possuiMensagensPrivadas) {
        this.nome = nome;
        this.numeroDeUsuarios = numeroDeUsuarios;
        this.possuiMensagensPrivadas = possuiMensagensPrivadas;
    }
    // Métodos
    public void exibirInformacoes() {
        System.out.println("Rede Social: " + nome);
        System.out.println("Número de Usuários: " + numeroDeUsuarios);
        System.out.println("Possui Mensagens Privadas: " + (possuiMensagensPrivadas ? "Sim" : "Não"));
    }
    public void adicionarUsuario() {
        numeroDeUsuarios++;
        System.out.println("Um novo usuário foi adicionado à rede social. Número total de usuários: " + numeroDeUsuarios);
    }
    public void removerUsuario() {
        if (numeroDeUsuarios > 0) {
            numeroDeUsuarios--;
            System.out.println("Um usuário foi removido. Número total de usuários: " + numeroDeUsuarios);
        } else {
            System.out.println("Não há usuários para remover.");
        }
    }
    // Métodos Getter e Setter
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNumeroDeUsuarios() {
        return numeroDeUsuarios;
    }
    public void setNumeroDeUsuarios(int numeroDeUsuarios) {
        this.numeroDeUsuarios = numeroDeUsuarios;
    }
    public boolean isPossuiMensagensPrivadas() {
        return possuiMensagensPrivadas;
    }
    public void setPossuiMensagensPrivadas(boolean possuiMensagensPrivadas) {
        this.possuiMensagensPrivadas = possuiMensagensPrivadas;
    }
}
```
# 10
```java
public class RacasDeCachorros {
    // Atributos
    private String nome; 
    private String tamanho; 
    private String temperamento; // 
    // Construtor
    public RacasDeCachorros(String nome, String tamanho, String temperamento) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.temperamento = temperamento;
    }
    // Métodos
    public void exibirInformacoes() {
        System.out.println("Raça: " + nome);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Temperamento: " + temperamento);
    }
    public void alimentar() {
        System.out.println("Alimentando um " + nome + ".");
    }
    public void brincar() {
        System.out.println("Brincando com o " + nome + "!");
    }
    // Métodos Getter e Setter
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
