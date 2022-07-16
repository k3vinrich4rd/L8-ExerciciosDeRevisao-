import java.util.HashMap;

public class ListaDeProdutos {
    private String nome;
    private double preco;
    private HashMap<String, Double> produtos = new HashMap<>();
    public int quantidadeDeProdutos;
    public String respostasUsuario;

    public ListaDeProdutos(String nome, double preco, HashMap<String, Double> produtos, int quantidadeDeProdutos, String respostasUsuario) {
        this.nome = nome;
        this.preco = preco;
        this.produtos = produtos;
        this.quantidadeDeProdutos = quantidadeDeProdutos;
        this.respostasUsuario = respostasUsuario;
    }
    public void adicionarItem(){

    }

    public void mostrarProduto (){

    }

    public void removerProduto(){

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
