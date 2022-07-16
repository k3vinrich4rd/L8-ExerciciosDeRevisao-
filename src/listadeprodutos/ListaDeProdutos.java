package listadeprodutos;

import java.util.HashMap;
import java.util.Scanner;

public class ListaDeProdutos {
    private String nome;
    private double preco;
    private HashMap<String, Double> produtos = new HashMap<>();
    public int quantidadeDeProdutos;
    public String respostasUsuario;

    public ListaDeProdutos() {
        this.nome = nome;
        this.preco = preco;
        this.produtos = produtos;
        this.quantidadeDeProdutos = quantidadeDeProdutos;
        this.respostasUsuario = respostasUsuario;
    }

    public void adicionarItem() {
        Scanner input1 = new Scanner(System.in);
        System.out.print("Quantos produtos você gostaria de adicionar?: ");
        quantidadeDeProdutos = input1.nextInt();

        for (int i = 0; i < quantidadeDeProdutos; i++) {
            System.out.print("Informe o nome do " + (i + 1) + "º produto: ");
            this.nome = input1.next();
            System.out.print("Informe o preço do " + (i + 1) +"º produto: ");
            this.preco = input1.nextDouble();
            produtos.put(getNome(), getPreco());

        }
    }

    public void mostrarProduto() {
        System.out.print("Sua lista de produtos após a remoção: " + this.produtos);
    }

    public void removerProduto() {
        System.out.println("Sua lista de produtos " + produtos);
        System.out.print("Informe quantos produtos você gostaria de remover: ");
        Scanner input2 = new Scanner(System.in);
        quantidadeDeProdutos = input2.nextInt();

        System.out.println("Sua lista de produtos: " + produtos);

        for (int i = 0; i < quantidadeDeProdutos; i++) {
            System.out.print("Informe o nome do " + (i + 1) + "º que você deseja remover ");
            respostasUsuario = input2.next();
            produtos.remove(respostasUsuario);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public HashMap<String, Double> getProdutos() {
        return produtos;
    }

    public void setProdutos(HashMap<String, Double> produtos) {
        this.produtos = produtos;
    }

    public int getQuantidadeDeProdutos() {
        return quantidadeDeProdutos;
    }

    public void setQuantidadeDeProdutos(int quantidadeDeProdutos) {
        this.quantidadeDeProdutos = quantidadeDeProdutos;
    }

    public String getRespostasUsuario() {
        return respostasUsuario;
    }

    public void setRespostasUsuario(String respostasUsuario) {
        this.respostasUsuario = respostasUsuario;
    }
}
