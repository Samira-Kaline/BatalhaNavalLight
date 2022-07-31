package batalhanaval;

import java.util.Scanner;


public class BatalhaNaval {
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int op = 0;
        while(op!=4){
            System.out.println("--------------------------MENU--------------------------");
            System.out.println("|  Digite 1 para cadastrar jogador1:                   |");
            System.out.println("|  Digite 2 para cadastrar jogador2:                   |");
            System.out.println("|  Digite 3 para para jogar:                           |");
            System.out.println("|  Digite 4 para sair:                                 |");
            System.out.println("--------------------------------------------------------");

            op = s.nextInt();
                
            switch(op){
                case 1 ->{
                    Campo campojogador1 = new Campo();
                    for(int i=0;i<=6;i++){
                        
                        System.out.println("Digite o tipo de navio que deseja adicionar: ");
                        String tipo;
                        tipo = s.next();
                        
                        System.out.println("Digite a posicao da linha que deseja adicionar: ");
                        System.out.println("Letra de A a H: ");
                        String linha;
                        linha = s.next();
                        
                        
                        System.out.println("Digite a posicao da coluna que deseja adicionar: ");
                        System.out.println("Numero de 1 a 8: ");
                        int coluna;
                        coluna =s.nextInt();
                        int linhac;
                        linhac = campojogador1.converter(linha);
                        campojogador1.adicionarArma(tipo, linhac-1, coluna-1);
                    }
                    
                    break;  
                }
                case 2 ->{
                    break;  
                }
                case 3 ->{
                    break;  
                }
            }
            
            
    }
    }
    
}
