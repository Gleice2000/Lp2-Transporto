package ArrayList_view;

import ArrayList_model.Caminhoneiro2;
import ArrayList_model.Carreta2;
import ArrayList_model.Cliente2;
import ArrayList_model.Viagem2;
import model.Caminhoneiro;
import model.Carreta;
import model.Cliente;
import model.Viagem;

public class Teste2 {
    public static void main(String[] args) {
    Carreta2 car = new Carreta2("Carreta ct-7000");
    Caminhoneiro2 cami = new Caminhoneiro2("João Alves", "12345678901234", "98765432109", 3000.0);
    
    Viagem2 viagem = new Viagem2("São Paulo SP", 4.5, 350.0);
    Cliente2 cliente = new Cliente2("Pedro", cami, viagem, car);

    Viagem2 viagem1 = new Viagem2("Rio de Janeiro", 3.0, 600.0);
    cliente.adicionarViagem(viagem1);

    Viagem2 viagem2 = new Viagem2("Belo Horizonte", 4.0, 500.0);
    cliente.adicionarViagem(viagem2);

    cliente.visualizarViagem();
}
}