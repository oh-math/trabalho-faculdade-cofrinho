package main.java.br.com.cofrinho;

public abstract class Moeda {
    double valor = 0.00;

    abstract void info();

    abstract double converter();

    // setter mandátorio para definir valor presente em cada classe concreta
    abstract void setValor(double valor);
}
