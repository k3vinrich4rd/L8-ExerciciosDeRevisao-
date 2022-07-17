package Listadecandidatos;

import java.util.Scanner;

public class ListaDeCandidatosMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ListaDeCandidatos candidatos = new ListaDeCandidatos();
        int respostaDoUsuario = 0;

        System.out.print("Voc� gostaria de adicionar algum candidato a sua lista ([1] - sim / [2] - n�o): ");
        respostaDoUsuario = input.nextInt();

        if (respostaDoUsuario == 1) {
            do {
                candidatos.adicionarCandidatos();
                System.out.print("Voc� gostaria de adicionar mais algum candidato em sua lista? ([1] - sim [2] - n�o): ");
                respostaDoUsuario = input.nextInt();

            } while (respostaDoUsuario == 1);

            candidatos.mostrarAlunos();
            System.out.print("Voc� gostaria de remover algum candidato da sua lista? ([1] - sim ] / [2] - n�o):  ");
            respostaDoUsuario = input.nextInt();
            do {
                candidatos.removerCandidato();
                System.out.print("Voc� gostaria de remover mais algum item da sua lista? ([1] - sim / [2] - n�o): ");
                respostaDoUsuario = input.nextInt();
            } while (respostaDoUsuario == 1);
        }
        System.out.println("\nVolte sempre, agradecemos por ser a sua prefer�ncia <3 ");
        System.out.println("A sua lista ap�s as atualiza��es: " + candidatos.getCandidatos());


    }
}
