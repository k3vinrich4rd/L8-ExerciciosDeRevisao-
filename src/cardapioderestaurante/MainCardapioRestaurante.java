package cardapioderestaurante;

import java.util.Scanner;

public class MainCardapioRestaurante {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CardapioDeRestaurante cardapio = new CardapioDeRestaurante();
        int respostaUsuario = 0;
        boolean c = true;

        System.out.print("-----SEJA BEM VINDO AO MENU DO SEU CARDÁPIO -----\n");
        while (c == true) {
            System.out.println("       \n        ----- Opções de comando -----");
            System.out.print("Para adicionar algum prato ao seu menu (digite '1') \n");
            System.out.print("Para remover algum prato do seu menu (digite '2') \n");
            System.out.print("Para visualizar pratos adicionados ao seu menu (digite '3') \n");
            System.out.print("Para sair do seu menu (digite '4') \n");
            System.out.print("\n" +
                    "Informe um número: ");
            respostaUsuario = input.nextInt();
            switch (respostaUsuario) {
                case 1:
                    cardapio.adicionarPrato();
                    break;
                case 2:
                    cardapio.removerPrato();
                    break;
                case 3:
                    cardapio.mostrarPrato();
                    break;


                case 4:
                    c = false;
                    break;
                default:
                    System.out.println("Opção inválida");


            }
        }
    }
}
