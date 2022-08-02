package batalhanaval;

import java.util.Scanner;


public class BatalhaNaval {
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        Jogador jogador1;
        Jogador jogador2; 

                    
        System.out.println("Digite o nome do jogador 1: ");
        String nome1 = s.next();
                    
        Campo campojogador1 = new Campo();
        for(int i=0;i<=6;i++){
        
        campojogador1.printCampo();
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
        campojogador1.printCampo();
        
        }
        
        System.out.println("Digite o nome do jogador 2: ");
        String nome2 = s.next();
        Campo campojogador2 = new Campo();      
        
        for(int i=0;6>i;i++){
            campojogador2.printCampo();
            System.out.println("Digite o tipo de navio que deseja adicionar: ");
           
            String tipo = s.next();
                        
            System.out.println("Digite a posicao da linha que deseja adicionar: ");
            System.out.println("Letra de A a H: ");
            
            String linha = s.next();
                        
                        
            System.out.println("Digite a posicao da coluna que deseja adicionar: ");
            System.out.println("Numero de 1 a 8: ");
            
            int coluna =s.nextInt();
            int linhac = campojogador1.converter(linha);
            campojogador2.adicionarArma(tipo, linhac-1, coluna-1);
            campojogador2.printCampo();
        }
        
        jogador1 = new  Jogador(nome1,campojogador2);
        jogador2 = new  Jogador(nome2,campojogador1);
                    
                

                
        int rodadas = 1;
        while (true){
            if (jogador1.venceu() ){
                
                System.out.println("O Vencedor foi: " + jogador1.getNome());
                break;
                
            }
            else if (jogador2.venceu() ){
                
                System.out.println("O Vencedor foi: " + jogador2.getNome());
                break;     
                
            }
            
            System.out.println("Rodada " + rodadas);
            
            // Jogada do jogador 1
            
            System.out.println("É a vez de " + jogador1.getNome());
            
            for(int i=0;i<2;i++){
                jogador1.getCampoiminigo().printCampo();
                System.out.println("Digite a posicao da linha que deseja adicionar: ");
                System.out.println("Letra de A a H: ");
                
                String linha = s.next();
                
                int linhac = campojogador1.converter(linha);
                
                System.out.println("Digite a posicao da coluna que deseja adicionar: ");
                System.out.println("Numero de 1 a 8: ");
                
                int coluna = s.nextInt();
                
                jogador1.registrarTiro(linhac-1, coluna-1);
                jogador1.getCampoiminigo().printCampo();
                
            }
            
            // Jogada do jogador 2
            
            System.out.println("É a vez de " + jogador2.getNome());
            
            for(int i=0;i<2;i++){
                jogador2.getCampoiminigo().printCampo();
                System.out.println("Digite a posicao da linha que deseja adicionar: ");
                System.out.println("Letra de A a H: ");
                
                String linha = s.next();
                
                int linhac = campojogador2.converter(linha);
                
                System.out.println("Digite a posicao da coluna que deseja adicionar: ");
                System.out.println("Numero de 1 a 8: ");
                
                int coluna = s.nextInt();
                
                jogador2.registrarTiro(linhac-1, coluna-1);
                jogador2.getCampoiminigo().printCampo();
            }
            
            
        }
    
    
}
}
