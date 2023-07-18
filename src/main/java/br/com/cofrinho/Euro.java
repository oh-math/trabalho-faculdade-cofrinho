package main.java.br.com.cofrinho;

public class Euro extends Moeda {
    private double cotacao = 5.40;

    @Override
    void info() {
        System.out.print("Euro");
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
