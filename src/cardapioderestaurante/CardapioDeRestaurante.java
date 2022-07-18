package cardapioderestaurante;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class CardapioDeRestaurante {
    private String nomeDoPrato;
    private HashMap<String, String> pratosDoRestaurante = new HashMap<>();
    int respostasNumericas;
    int quantidadeDePratos;

    public CardapioDeRestaurante() {
        this.nomeDoPrato = nomeDoPrato;
        this.pratosDoRestaurante = pratosDoRestaurante;
        this.respostasNumericas = respostasNumericas;
        this.quantidadeDePratos = quantidadeDePratos;
    }

    public void adicionarPrato() {
        Scanner input1 = new Scanner(System.in);

        List<String> ingredientesDoPrato = new ArrayList<>();
        System.out.print("Informe o nome do prato: ");
        nomeDoPrato = input1.next();


        System.out.print("Informe a quantidade de ingredientes que compõem este prato?: ");
        quantidadeDePratos = input1.nextInt();
        for (int j = 0; j < quantidadeDePratos; j++) {
            System.out.print("Digite o nome do " + (j + 1) + "º ingrediente do prato: ");
            ingredientesDoPrato.add(input1.next());
            pratosDoRestaurante.put(getNomeDoPrato(), String.valueOf(ingredientesDoPrato));
        }

    }


    public void removerPrato() {

        Scanner input2 = new Scanner(System.in);
        System.out.print("\nQual prato você gostaria de remover, ");
        System.out.print("Pratos adicionados: " );
        mostrarPrato();

        nomeDoPrato = input2.next();
        pratosDoRestaurante.remove(getNomeDoPrato());
        System.out.print("Quantidade de pratos após a remoção: ");
        mostrarPrato();

        for (int i = 0; i < pratosDoRestaurante.size(); i++) {
            if (pratosDoRestaurante.equals(nomeDoPrato)) {
                System.out.print("Informe o nome do " + (i + 1) + "º prato: ");


            }
        }
        System.out.println("Quantidade inexistente, adicione um prato para remover ");

    }

    public void mostrarPrato() {
        System.out.println(getPratosDoRestaurante());


    }


    public String getNomeDoPrato() {
        return nomeDoPrato;
    }

    public void setNomeDoPrato(String nomeDoPrato) {
        this.nomeDoPrato = nomeDoPrato;
    }

    public HashMap<String, String> getPratosDoRestaurante() {
        return pratosDoRestaurante;
    }

    public void setPratosDoRestaurante(HashMap<String, String> pratosDoRestaurante) {
        this.pratosDoRestaurante = pratosDoRestaurante;
    }

    public int getRespostasNumericas() {
        return respostasNumericas;
    }

    public void setRespostasNumericas(int respostasNumericas) {
        this.respostasNumericas = respostasNumericas;
    }

    public int getQuantidadeDePratos() {
        return quantidadeDePratos;
    }

    public void setQuantidadeDePratos(int quantidadeDePratos) {
        this.quantidadeDePratos = quantidadeDePratos;
    }
}
