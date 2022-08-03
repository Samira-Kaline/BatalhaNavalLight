package batalhanaval;

import java.util.Scanner;


public class BatalhaNaval {
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Exception e = new Exception();
        Jogador jogador1;
        Jogador jogador2; 
        String nome1,nome2 = null;
      
        
        while (true){
            System.out.println("Digite o nome do jogador 1: ");
            nome1 = s.next();
            
            if(e.verificarNome(nome1)){
                break;
            }
            else{
                System.out.println("Digite o nome apenas com letras: ");
            }
        }
        
                    
        Campo campojogador1 = new Campo();
        int i = 0;
        
        
        while (i<=6) {
            String tipo,linha = null;
            int coluna = -1;
        
            campojogador1.printCampo();
            
            while (true){
                
                System.out.println("Digite o tipo de navio que deseja adicionar: ");
                tipo = s.next();
                
                if(e.verificarNavios(tipo)){
                    break;  
                }
                System.out.println("Tipo invalido!");
                System.out.println("Valido somente: submarino, cruzador ou porta-avioes");
            }
            
            
            while (true){
                
                System.out.println("Digite a posicao da linha que deseja adicionar: ");
                System.out.println("Letra de A a H: ");
                linha = s.next();
                
                if(e.verificarLinha(linha)){
                    break;  
                }
                System.out.println("Intervalo invalido!");
            }
            
            while (true){
                
                System.out.println("Digite a posicao da coluna que deseja adicionar: ");
                System.out.println("Numero de 1 a 8: ");
                coluna =s.nextInt();
                
                if(e.verificarColuna(coluna)){
                    break;  
                }
                System.out.println("Intervalo invalido!");
            }

            int linhac;
            linhac = campojogador1.converter(linha);

            if(campojogador1.adicionarArma(tipo, linhac-1, coluna-1)){
                i++;
            }
            
        
        }
        campojogador1.printCampo();
        
        
        while (true){
            System.out.println("Digite o nome do jogador 2: ");
            nome2 = s.next();
            
            if(e.verificarNome(nome2)){
                break;
            }
            else{
                System.out.println("Digite o nome apenas com letras: ");
            }
        }
        
        
        Campo campojogador2 = new Campo();      
        
        i = 0;
        while (i<=6){
            String tipo,linha = null;
            int coluna = -1;
        
            campojogador2.printCampo();
            
            while (true){
                
                System.out.println("Digite o tipo de navio que deseja adicionar: ");
                tipo = s.next();
                
                if(e.verificarNavios(tipo)){
                    break;  
                }
                System.out.println("Tipo invalido!");
                System.out.println("Valido somente: submarino, cruzador ou porta-avioes");
            }
            
            
            while (true){
                
                System.out.println("Digite a posicao da linha que deseja adicionar: ");
                System.out.println("Letra de A a H: ");
                linha = s.next();
                
                if(e.verificarLinha(linha)){
                    break;  
                }
                System.out.println("Intervalo invalido!");
            }
            
            while (true){
                
                System.out.println("Digite a posicao da coluna que deseja adicionar: ");
                System.out.println("Numero de 1 a 8: ");
                coluna =s.nextInt();
                
                if(e.verificarColuna(coluna)){
                    break;  
                }
                System.out.println("Intervalo invalido!");
            }

            int linhac = campojogador1.converter(linha);
            if(campojogador2.adicionarArma(tipo, linhac-1, coluna-1)){
                i++;
            }
            
        }
        campojogador2.printCampo();
        
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
            String linha ;
            int coluna;
            for(i=0;i<2;i++){
                jogador1.getMeucampo().printCampo();
                
                
                while (true){
                
                System.out.println("Digite a posicao da linha que deseja adicionar: ");
                System.out.println("Letra de A a H: ");
                linha = s.next();
                
                if(e.verificarLinha(linha)){
                    break;  
                }
                System.out.println("Intervalo invalido!");
            }
            
            while (true){
                
                System.out.println("Digite a posicao da coluna que deseja adicionar: ");
                System.out.println("Numero de 1 a 8: ");
                coluna =s.nextInt();
                
                if(e.verificarColuna(coluna)){
                    break;  
                }
                System.out.println("Intervalo invalido!");
            }
                
                int linhac = campojogador1.converter(linha);
                jogador1.registrarTiro(linhac-1, coluna-1);
                jogador1.getMeucampo().printCampo();
                
            }
            
            // Jogada do jogador 2
            
            System.out.println("É a vez de " + jogador2.getNome());
            
            for(i=0;i<2;i++){
                jogador2.getMeucampo().printCampo();
                while (true){
                
                System.out.println("Digite a posicao da linha que deseja adicionar: ");
                System.out.println("Letra de A a H: ");
                linha = s.next();
                
                if(e.verificarLinha(linha)){
                    break;  
                }
                System.out.println("Intervalo invalido!");
            }
            
            while (true){
                
                System.out.println("Digite a posicao da coluna que deseja adicionar: ");
                System.out.println("Numero de 1 a 8: ");
                coluna =s.nextInt();
                
                if(e.verificarColuna(coluna)){
                    break;  
                }
                System.out.println("Intervalo invalido!");
            }

                int linhac = campojogador1.converter(linha);
                jogador2.registrarTiro(linhac-1, coluna-1);
                jogador2.getMeucampo().printCampo();
            }
            
            
        }
    
    
}
}
