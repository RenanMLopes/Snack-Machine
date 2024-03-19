package br.com.targettrust.snack.interfaces;

public class Dinheiro extends FormaPagamento{
    @Override
    public void realizarPagamento() {
        System.out.println("Insira o dinheiro na máquina");
        //TODO Calcular troco
    }
}
