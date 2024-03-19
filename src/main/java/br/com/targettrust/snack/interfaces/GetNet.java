package br.com.targettrust.snack.interfaces;

public class GetNet implements IAdquirente{
    @Override
    public void processarTransacao(String numeroCartao, String ccv, String dataDeValidade) {
        //TODO implementar transação com a GetNet
        System.out.println("Transação via GetNet");
    }
}
