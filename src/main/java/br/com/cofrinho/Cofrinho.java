package main.java.br.com.cofrinho;

import java.util.ArrayList;
import java.text.DecimalFormat;

public class Cofrinho {

    private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();

    // adiciona uma instãncia de Moeda para "listaMoedas"
    public void adicionar(Moeda moeda) {
        this.listaMoedas.add(moeda);
    }

    // sobrecarga que adiciona um valor a instãncia referenciada
    public void adicionar(Moeda moeda, double valor) {
        moeda.setValor(moeda.valor += valor);
    }

    public void remover(Moeda moeda, double valor) {
        // se o valor a ser removido foi maior do que existe no cofrinho, deve zerar o
        // valor dentro do cofrinho
        if (valor > moeda.valor) {
            moeda.setValor(0.0);
        }

        // valor final que verifica se existe algo a ser excluido, caso não exista
        // retorna 0
        double valorFinal = moeda.valor > 0.00 ? moeda.valor -= valor : 0;
        moeda.setValor(valorFinal);
    }

    public void listagemMoedas() {
        // passa por todas as instâncias dentro de "listaMoedas" e retorna sua info e
        // seu valor
        for (Moeda moeda : listaMoedas) {
            moeda.info();
            System.out.println(" - " + moeda.valor);
        }
    }

    // para cada instância dentro da lista, recupera sua conversão e atribui e soma
    // a variável "soma"
    public void totalConvertido() {
        double soma = 0.00;
        for (Moeda moeda : listaMoedas) {
            soma += moeda.converter();
        }
        // formatação do double para duas casa decimais 
        DecimalFormat df = new DecimalFormat("#.##");
        String resultado = df.format(soma);

        System.out.println("O valor total convertido para real é: " + resultado);
    }
}