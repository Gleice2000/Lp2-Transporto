package ArrayList;

import java.util.ArrayList;

public class Cliente2 {
    private String nome;
    private String cpf;
    private String rg;
    private Caminhoneiro2 c1;
    private ArrayList<Viagem2> viagens = new ArrayList<>();
    private Carreta2 carreta1;


    public Cliente2(String nome, Caminhoneiro2 c1, Viagem2 viagem1, Carreta2 carreta1) {
        this.nome = nome;
        this.c1 = c1;
        this.viagens.add(viagem1);
        this.carreta1 = carreta1;
        this.viagens = new ArrayList<Viagem2>();
        this.viagens.add(viagem1);
    }

    public void adicionarViagem(Viagem2 viagem) {
        viagens.add(viagem);
    }

    public void visualizarViagem() {
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Motorista: " + c1.getNome());
        System.out.println("Veículo: " + carreta1.getModeloCarreta());
        System.out.println("Viagens realizadas:");
        for (Viagem2 via : viagens) {
            System.out.println("* Destino: " + via.getDestino() + ", valor de KM: " + via.getValorKM()+ ", distância: " + via.getDistancia() + ", valor total da viagem: " + via.getValorViagem());
        }
    }
}

