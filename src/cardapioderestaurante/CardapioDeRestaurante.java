package cardapioderestaurante;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CardapioDeRestaurante {
    private String nomeDoPrato;
    private  List<String> ingredientesDoPrato = new ArrayList<>();
    private HashMap<String, String> pratosDoRestaurante = new HashMap<>();
    int respostasNumericas;
    int quantidadeDePratos;

    public CardapioDeRestaurante(String nomeDoPrato, List<String> ingredientesDoPrato, HashMap<String, String> pratosDoRestaurante, int respostasNumericas, int quantidadeDePratos) {
        this.nomeDoPrato = nomeDoPrato;
        this.ingredientesDoPrato = ingredientesDoPrato;
        this.pratosDoRestaurante = pratosDoRestaurante;
        this.respostasNumericas = respostasNumericas;
        this.quantidadeDePratos = quantidadeDePratos;
    }
}
