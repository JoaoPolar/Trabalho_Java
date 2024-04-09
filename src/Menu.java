import Cliente.ContaPF;
import Cliente.ContaPJ;
import java.util.Scanner;

public class Menu {
    
        public static void main(String[] args) {
              
            Scanner Entrada = new Scanner(System.in);

            System.out.println("1 - Criar conta\n2 - Listar contas\n3 - Excluir conta");
            int valor = Entrada.nextInt();
            
            switch (valor) {
                case 1:
                    
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
                        
                        ContaPJ teste = new ContaPJ(valor_id, valor_nome, valor_tipo, valor_CNPJ);
                        System.out.println("Conta criada");
                        
                    }else {
                        
                        System.out.println("digite o CPF");
                        int valor_CPF = Entrada.nextInt();
                        
                        ContaPF conta = new ContaPF(valor_id,valor_nome, valor_tipo, valor_CPF);
                        System.out.println("Conta criada");
                    }
                break;
                    
                case 2:
                    
                break;
                
                case 3:
                    
                break;
                
                default:
                    
                    System.out.println("Selecione um valor valido");
                
            }
        }
}
