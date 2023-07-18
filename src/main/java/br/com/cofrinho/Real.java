package main.java.br.com.cofrinho;

public class Real extends Moeda {

    @Override
    void info() {
        System.out.print("Real");
    }

    @Override
    double converter() {
        return valor;
    }

    @Override
    void setValor(double valor) {
        this.valor = valor;
    }
}
