package ProjectBanc;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Online {
    String clientes;
    String clientesON;
    String buscarConta;

    // Construtor
    public Online(String clientes, String clientesON, String buscarConta) {
        this.clientes = clientes;
        this.clientesON = clientesON;
        this.buscarConta = buscarConta;
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

    }
}
