package listadeprodutos;

import listadeprodutos.ListaDeProdutos;

import java.util.Scanner;

public class MainProdutos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ListaDeProdutos listaDeProdutos = new ListaDeProdutos();
        int respostaDoUsuario = 0;

        System.out.print("\nVoc� gostaria de adicionar mais algum produto na sua lista? ([1] - sim / [2] - n�o): ");
        respostaDoUsuario = input.nextInt();

        if (respostaDoUsuario == 1) {
            do {
                listaDeProdutos.adicionarItem();
                System.out.print("Voc� gostaria de adicionar mais algum item em sua lista ([1] - sim / [2] - n�o): ");
                respostaDoUsuario = input.nextInt();

            } while (respostaDoUsuario == 1);

            System.out.print("Voc� gostaria de remover algum item da sua lista?  ([1] - sim [2] - n�o): ");
            respostaDoUsuario = input.nextInt();

            if (respostaDoUsuario == 1) {
                do {
                    listaDeProdutos.removerProduto();
                    System.out.print("Voc� gostaria de remover mais algum item da sua lista ([1] - sim / [2] - n�o): ");
                    respostaDoUsuario = input.nextInt();
                } while (respostaDoUsuario == 1);

            }


        }
        System.out.println("\nAgradecemos por ser a sua prefer�ncia, volte sempre <3");
        System.out.println("A sua lista ap�s a remo��o: " + listaDeProdutos.getProdutos());

    }


}

