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

                        System.out.println("digite o tipo da Conta (ContaPJ ou ContaPF)");
                        String valor_tipo = Entrada.nextLine();

                        if ("ContaPJ".equals(valor_tipo)){

                            System.out.println("digite o CNPJ");
                            int valor_CNPJ = Entrada.nextInt();

                            ContaPJ novacontaPJ = new ContaPJ(valor_id, valor_nome, valor_tipo, valor_CNPJ);
                            System.out.println("Conta criada");
                            
                            System.out.println(novacontaPJ.toString());                            
                            banco.addClientePJ(novacontaPJ);
                            
                            
                            
                        }else {

                            System.out.println("digite o CPF");
                            int valor_CPF = Entrada.nextInt();

                            ContaPF novacontaPF = new ContaPF(valor_id,valor_nome, valor_tipo, valor_CPF);
                            System.out.println("Conta criada");
                            
                            System.out.println(novacontaPF.toString());
                            banco.addClientePF(novacontaPF);
                        }
                        
                        ContaPF novacontaPF.Depositar();
                    }

                    case 2 -> {
                        Entrada.nextLine();
                        System.out.println("Digite o tipo de conta: ");
                        String tipoConta = Entrada.nextLine();
                        
                        if ("ContaPJ".equals(tipoConta)) {
                            System.out.println("Digite o identificador: ");
                            int identificador = Entrada.nextInt();

                            ContaPJ novacontaPJ = banco.getClientePJ(identificador);
                            if (novacontaPJ == null) {
                                System.out.println("Cliente nao encontrado!");
                            }else {
                                System.out.println(novacontaPJ);
                            }
                        }else {                            
                            System.out.println("Digite o identificador: ");
                            int identificador = Entrada.nextInt();

                            ContaPF novacontaPF = banco.getClientePF(identificador);
                            if (novacontaPF == null) {
                                System.out.println("Cliente nao encontrado!");
                            }else {
                                System.out.println(novacontaPF);
                            }
                        }

                    }
                    case 3 -> {
                        
                    }
                    
                    case 4 -> {
                        System.out.println("Qual o id");
                        int id = Entrada.nextInt();
                        banco.getClientePJ(id);
                        
                        Deposito.Depositar();
                    }    
                    case 5 -> {
                        
                    }
                    case 6 -> {
                       
                    }
                    case 7 -> {
                        System.out.println("Saindo do programa...");
                    }                    
                    default -> System.out.println("Selecione um valor valido");

                }
        }while (valor != 7);
    }
}
