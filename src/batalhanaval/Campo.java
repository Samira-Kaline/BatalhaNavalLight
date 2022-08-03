package batalhanaval;

public class Campo {
    private  char[][] campo;
    private int quantSub = 3;
    private int quantCruz = 2;
    private int quantPa = 1;
    private String[] linhas;
    
    public Campo(){
        this.campo = new char[8][8];
        this.linhas = new String[8];
    }
    
    public char getPosicao(int linha,int coluna){
        return campo[linha][coluna];
    }
    
    public void setPosicao(int linha,int coluna,char valor){
        this.campo[linha][coluna] = valor;
    }
    
    
    public boolean verificarPosicao(int num, int linha,int coluna){
        int cont = coluna+num;
        for(int i=Math.max(coluna-1,0);i<Math.min(cont, 7);i++){
            if (campo[linha][i]=='s' || campo[linha][i]=='c' || campo[linha][i]=='p'){
                return false;
            }
        }
        for(int i=Math.max(0,coluna-1);i<Math.min(linha+num,7);i++){
  
            if((campo[Math.max(0,linha-1)][i]=='s' || campo[Math.min(7,linha+1)][i]=='s') 
                    || (campo[Math.max(0,linha-1)][i]=='c' || campo[Math.min(7,linha+1)][i]=='c')
                    || (campo[Math.max(0,linha-1)][i]=='p' || campo[Math.min(0,linha+1)][i]=='p')){
                    
                return false;
            }
        }     
        return true;

    }
    
    public String[] getLinhas(){
        this.linhas[0] = "A";
        this.linhas[1] = "B";
        this.linhas[2] = "C";
        this.linhas[3] = "D";
        this.linhas[4] = "E";
        this.linhas[5] = "F";
        this.linhas[6] = "G";
        this.linhas[7] = "H";
        
        return linhas;
    }
    
    public boolean adicionarArma(String tipo,int linha,int coluna){
        switch (tipo){
            case "submarino" -> {
                if(this.verificarPosicao(1, linha, coluna )&& this.quantSub>0 ){
                    campo[linha][coluna] = 's';
                    this.quantSub--;
                    return true;
                }
                else{
                    System.out.println("Não pode adcionar navio");
                }
            }
            case "cruzador" ->{
                if(this.verificarPosicao(2, linha, coluna) && this.quantCruz>0 ){
                    campo[linha][coluna] = 'c';
                    campo[linha][coluna+1] = 'c';
                    this.quantCruz--;
                    return true;
                }
                else{
                    System.out.println("Não pode adcionar navio");
                }
            }
            case "porta-avioes" ->{
                if(this.verificarPosicao(5, linha, coluna) && this.quantPa>0 ){
                    for(int i=coluna;i<=6;i++){
                        campo[linha][i] = 'p';
                        this.quantPa--;
                        return true;
                    }
                }
                else{
                    System.out.println("Não pode adcionar navio");
                }
            }
        }
        return false;
    }
    
    public boolean verificarTiro(int linha,int coluna){
        return campo[linha][coluna] == 's' || campo[linha][coluna] == 'p' || campo[linha][coluna] == 'c' ;
    }
    
    
    public int converter(String letra){
        switch(letra){
            case "A": return 1;
            case "B": return 2;
            case "C": return 3;
            case "D": return 4;
            case "E": return 5;
            case "F": return 6;
            case "G": return 7;
            case "H": return 8;
        }
        return 0;
    }
    
    public void printCampo(){
        System.out.println("==========================================");
        System.out.println("               Batalha Naval              ");
        System.out.println("==========================================\n");
        System.out.println("    1   2   3   4   5   6   7   8  ");
        for (int i=0;i<campo.length;i++){
            System.out.print(" "+ this.getLinhas()[i] +" ");
            for(int j=0;j<campo[i].length;j++){
                if(campo[i][j]=='s' || campo[i][j]=='c' || campo[i][j]=='p'  ){
                    System.out.print("|"+ campo[i][j] + "| ");
                }
                else{
                    System.out.print("| | ");
                }
                
            }
            System.out.println("");
        }
        System.out.println("");
        
        
        
    }

    @Override
    public String toString() {
        
        
        return "Campo{" + '}';
    }
    
    
}
