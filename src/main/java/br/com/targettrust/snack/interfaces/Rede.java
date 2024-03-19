package br.com.targettrust.snack.interfaces;

public class Rede implements IAdquirente{

    @Override
    public void processarTransacao(String numeroCartao, String ccv, String dataDeValidade) {
        //TODO implementar transação com a Rede
        System.out.println("Transação via Rede");
    }
}
