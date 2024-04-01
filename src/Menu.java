import java.util.Scanner;

public class Menu {
    
        public static void main(String[] args) {
            Scanner Entrada = new Scanner(System.in);

            System.out.println("1 - Criar conta\n2 - Listar cinta");
            int valor = Entrada.nextInt();
            
            switch (valor) {
                case 1 -> System.out.println("Teste");
                
                case 2 -> System.out.println("Teste 2");
                
                default -> System.out.println("Selecione um valor valido");
                
            }
        }
}
