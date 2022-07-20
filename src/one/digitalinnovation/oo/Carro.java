package one.digitalinnovation.oo;

// Exemplo de como criar classes, atributos, métodos.

public class Carro {

    String cor;
    String modelo;
    int capacidadeTanque;

    // Construtor aqui (sempre abaixo dos atributos)

    Carro() {

    }

    Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }


    // Gets e Sets

    void setCor() { // set colocar um valor em um atributo
        this.cor = "Azul";
    }

    String getCor() { // get devolve um valor, se devolve algo não pode ser void e deve ser compativel com o tipo de set
        return cor;
    }

    void setModelo() {
        this.modelo = "BMW Série 3";
    }

    String getModelo() {
        return modelo;
    }

    // get e set tanque

    void setCapacidadeTanque() {
        this.capacidadeTanque = 59;
    }

    int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    // método do total para encher o tangue

    double totalValorTanque() {
        return capacidadeTanque * 6.39;
    }
}

/*Exemplo de herança

public class Veiculo { }

class Caminhao extends Veiculo { }
*/

