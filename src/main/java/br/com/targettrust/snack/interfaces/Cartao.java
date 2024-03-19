package br.com.targettrust.snack.interfaces;

import java.util.Scanner;

public class Cartao extends FormaPagamento {


        @Override
        public void realizarPagamento() {

            Scanner teclado = new Scanner(System.in);

            System.out.println("Informe os dados do seu cartão");

            System.out.println("Informe o numero do cartão");
            String numeroCartao = teclado.next();

            System.out.println("Informe o ccv do cartão");
            String ccv = teclado.next();

            System.out.println("Informe a validade do cartão [MM/YYYY]");
            String validade = teclado.next();

            System.out.println("Qual a maquina vai efetuar o pagamento");
            System.out.println("1 - GetNet");
            System.out.println("2 - Rede");
            int opcaoMaquina = teclado.nextInt();
            IAdquirente adquirente = null;
            if(opcaoMaquina == 1){
                adquirente  = new GetNet();
            } else if (opcaoMaquina == 2) {
                adquirente = new Rede();
            }
            adquirente.processarTransacao(numeroCartao, ccv, validade);

        }
    }
