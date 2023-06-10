package ProjectBanc;

import java.util.List;
import java.util.Scanner;
import java.nio.file.OpenOption;
import java.util.ArrayList;

public class Online {
    String clientes;
    String clientesON;
    String buscarConta;
int opcao = 0;
    // Construtor
    public Online(String clientes, String clientesON, String buscarConta) {
        this.clientes = clientes;
        this.clientesON = clientesON;
        this.buscarConta = buscarConta;
    }

    public Online(int i, int j, int k) {
    }

    public String getClientes() {
        return clientes;
    }

    public void setClientes(String clientes) {
        this.clientes = clientes;
    }

    public String getClientesON() {
        return clientesON;
    }

    public void setClientesON(String clientesON) {
        this.clientesON = clientesON;
    }

    public String getBuscarConta() {
        return buscarConta;
    }

    public void setBuscarConta(String buscarConta) {
        this.buscarConta = buscarConta;
    }

    // Criar conta
    public void criar(ContaPF ContaPF) {
switch (opcao) {
    case 1:
        System.out.println("Criar conta(PF)");
        break;
        case 2:
        System.out.println("Criar conta(PJ)");
        break;

    default:
        break;
}
    }
}
