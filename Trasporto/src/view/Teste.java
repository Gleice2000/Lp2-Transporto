package view;

import model.Caminhoneiro;
import model.Carreta;
import model.Cliente;
import model.Viagem;

public class Teste {
    public static void main(String[] args) {
        Carreta carreta1 = new Carreta("Carreta ct-7000");
        Caminhoneiro c1 = new Caminhoneiro("João Alves", "11.174.986.0001-73", "136.985.346.70", 1575.0);
        Viagem viagem1 = new Viagem("São Paulo", 4.5, 350);
        Cliente cliente1 = new Cliente("Pedro", c1, viagem1, carreta1);

        cliente1.visualizarViagem();
    }
    }

