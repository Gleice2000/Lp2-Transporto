package view;

import model.Caminhoneiro;
import model.Carreta;
import model.Cliente;
import model.Viagem;

public class Teste {
    public static void main(String[] args) {
        Carreta carreta1 = new Carreta("Carreta ct-7000");
        Caminhoneiro c1 = new Caminhoneiro("João Alves", 1575.0);
        Viagem viagem1 = new Viagem("São Paulo", 4.5, 350);
        Cliente cliente1 = new Cliente("Pedro");

        cliente1.visualizarViagem();
    }
    }

