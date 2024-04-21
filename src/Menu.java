import Banco.Banco;
import Cliente.ContaPF;
import Cliente.ContaPJ;
import Cliente.Cliente;
import java.util.Scanner;

public class Menu {
    
        public static void main(String[] args) {
            
            Banco banco = new Banco();
            
            Scanner Entrada = new Scanner(System.in);
            int valor;
            
            do { 
                System.out.println("1 - Criar conta\n2 - Listar contas\n3 - Sacar \n4 - Depositar\n5 - Transferir\n6 - Excluir conta \n7 - Sair do programa");
                valor = Entrada.nextInt();

                switch (valor) {
                    case 1 -> {
                        System.out.println("digite um id:");
                        int valor_id = Entrada.nextInt();

                        Entrada.nextLine();
                        System.out.println("Digite o nome da conta:");
                        String valor_nome = Entrada.nextLine();

                        System.out.println("digite o tipo da Conta: \n1 - ContaPJ\n2 - ContaPF");
                        int valor_tipo = Entrada.nextInt();

                        switch(valor_tipo) {
                            case 1 -> {

                            String tipo = "ContaPJ";
                                
                            System.out.println("digite o CNPJ");
                            int valor_CNPJ = Entrada.nextInt();

                            ContaPJ novacontaPJ = new ContaPJ(valor_id, valor_nome, tipo, valor_CNPJ);
                            System.out.println("Conta criada");
                            
                            System.out.println(novacontaPJ.toString());                            
                            banco.addCliente(novacontaPJ);
                            
                            }    
                            case 2 -> {
                                    
                            String tipo = "ContaPF";
                                
                            System.out.println("digite o CPF");
                            int valor_CPF = Entrada.nextInt();

                            ContaPF novacontaPF = new ContaPF(valor_id,valor_nome, tipo, valor_CPF);
                            System.out.println("Conta criada");
                            
                            System.out.println(novacontaPF.toString());
                            banco.addCliente(novacontaPF);
                            }
                            default -> {
                                System.out.println("Valor invalido");
                            }
                        }
                    }        
       
                    case 2 -> {
                        Entrada.nextLine();
                        System.out.println("Digite o Id: ");
                        int id  = Entrada.nextInt();
                        Cliente c = banco.getCliente(id);
                        if(c == null){
                        System.out.println("id invalido");
                        }
                        else{
                            System.out.println(c);
                        }
                    }

                    case 3 -> {
                        Entrada.nextLine();
                        System.out.println("Digite o Id: ");
                        int id  = Entrada.nextInt();
                        Cliente c = banco.getCliente(id);
                        if(c == null){
                        System.out.println("id invalido");
                        }
                        else {
                            System.out.println("A conta possui " + c.getSaldo() + "\nValor do saque: ");
                            double saque = Entrada.nextDouble();
                            c.Saque(saque);
                            System.out.println("Saque realizado");
                        }                        
                    }
                    
                    case 4 -> {
                        Entrada.nextLine();
                        System.out.println("Digite o Id: ");
                        int id  = Entrada.nextInt();
                        Cliente c = banco.getCliente(id);
                        if(c == null){
                        System.out.println("id invalido");
                        }
                        else {
                            System.out.println("Digite o valor de deposito: ");
                            double deposito = Entrada.nextDouble();
                            c.Depositar(deposito);
                            System.out.println("Deposito realizado!");
                        } 
                    }    
                    case 5 -> {
                        Entrada.nextLine();
                        System.out.println("Digite o Id da Conta de retirada: ");
                        int idR  = Entrada.nextInt();
                        Cliente r = banco.getCliente(idR);
                        Entrada.nextLine();
                        System.out.println("Digite o Id da Conta de deposito: ");
                        int idD  = Entrada.nextInt();
                        Cliente d = banco.getCliente(idD);
                        if(r == null || d == null){
                        System.out.println("id invalido");
                        }
                        else{
                            System.out.println("A conta de retirada possui " + r.getSaldo());
                            System.out.println("A conta de deposito possui " + d.getSaldo());
                            System.out.println("Valor da Transferencia: ");
                            double trans = Entrada.nextDouble();
                            if(trans > r.getSaldo()){
                             
                                System.out.println("Valor de retirada maior que o saldo da conta!");
                            }
                            else{
                            r.Saque(trans);
                            double deposito = trans;
                            d.Depositar(deposito);
                            System.out.println("Transferencia realizada!");
                            
                        }
                    }
                    }
                    case 6 -> {
                        Entrada.nextLine();
                        System.out.println("Digite o Id: ");
                        int id  = Entrada.nextInt();
                        Cliente c = banco.getCliente(id);
                        if(c == null){
                        System.out.println("id invalido");
                        }
                        else{
                            System.out.println("Tem certeza que deseja remover essa conta?\n" + c + "\n1 - sim \n2 - nao");
                            valor = Entrada.nextInt();
                            switch (valor) {
                                case 1 -> {
                                    banco.removeCliente(id);
                                    System.out.println("Conta removida com sucesso!");
                                            }
                                case 2 -> {
                                    System.out.println("Conta nao removida");
                                            }
                                default -> {
                                    System.out.println("Valor invalido");
                                            }
                            }
                        }
                    }
                    case 7 -> {
                        System.out.println("Saindo do programa...");
                    }                    
                    default -> System.out.println("Selecione um valor valido");

                }
        }while (valor != 7);
    }
}
