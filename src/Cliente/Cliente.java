package Cliente;

import java.util.Scanner;
public abstract class Cliente {
    Scanner Entrada = new Scanner(System.in);
    
    private int id;
    private String tipo;
    private String nome;    
    private double saldo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public double setSaldo(double saldo) {
        this.saldo = saldo;
        return 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cliente(int id, String tipo, String nome) {
        this.id = id;
        this.tipo = tipo;
        this.nome = nome;
        this.saldo = 0;
    }
    
    public void Depositar(double deposito){
        if (deposito > 0){
            setSaldo(deposito);
        }
        else{
            System.out.println("Valor invalido");
        }
    }
    
    public void Saque(double saque) {
        if (saque <= getSaldo()){
            setSaldo(getSaldo() - saque);
            System.out.println("Saque realizado");
        }
        else{
            System.out.println("Valor invalido");
        }
    }
}