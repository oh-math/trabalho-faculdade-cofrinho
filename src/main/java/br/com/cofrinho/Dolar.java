package main.java.br.com.cofrinho;

public class Dolar extends Moeda {
    // valor da cotação isolado para apenas a classe que deve saber da sua
    // existência
    private double cotacao = 4.81;

    @Override
    void info() {
        System.out.print("Dólar");
    }

    @Override
    double converter() {
        double valorConvertido = this.valor * cotacao;
        return valorConvertido;
    }

    @Override
    void setValor(double valor) {
        this.valor = valor;
    }
}
