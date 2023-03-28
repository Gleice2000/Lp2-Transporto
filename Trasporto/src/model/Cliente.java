package model;

public class Cliente {
    private String nome;
    private String cpf;
    private String rg;
    private Caminhoneiro c1;
    private Viagem viagem1;
    private Carreta carreta1;

    public Cliente(String nome, Caminhoneiro c1, Viagem viagem1, Carreta carreta1) {
        this.nome = nome;
        this.c1 = c1;
        this.viagem1 = viagem1;
        this.carreta1 = carreta1;
    }

    public void visualizarViagem() {
        System.out.println("Cliente: " + nome);
        System.out.println("Motorista: " + c1.getNome());
        System.out.println("Veículo: " + carreta1.getModeloCarreta());
        System.out.println("Destino: " + viagem1.getDestino());
        System.out.println("Valor KM: " + viagem1.getValorKM() + " Distância: " + viagem1.getDistancia());
        System.out.println("Valor total da viagem: " + viagem1.getValorViagem());
    }
    
}
