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
        int cont = linha+num+1;
        for(int i=linha-1;i<=cont;i++){
            if (campo[i][coluna]!=' '){
                return false;
            }
        }
        for(int i=coluna;i<=num;i++){
            if(campo[linha-1][i]!=' ' && campo[linha+1][i]!=' '){
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
    
    public void adicionarArma(String tipo,int linha,int coluna){
        switch (tipo){
            case "submarino" -> {
                if(this.verificarPosicao(1, linha, coluna )|| this.quantSub>0){
                    campo[linha][coluna] = 's';
                    this.quantSub--;
                }
                else{
                    System.out.println("Não pode adcionar navio");
                }
            }
            case "cruzador" ->{
                if(this.verificarPosicao(2, linha, coluna) || this.quantCruz>0){
                    campo[linha][coluna] = 'c';
                    campo[linha+1][coluna] = 'c';
                    this.quantCruz--;
                }
                else{
                    System.out.println("Não pode adcionar navio");
                }
            }
            case "porta-avioes" ->{
                if(this.verificarPosicao(5, linha, coluna) || this.quantPa>0){
                    for(int i=coluna;i<=4;i++){
                        campo[i][coluna] = 'p';
                        this.quantPa--;
                    }
                }
                else{
                    System.out.println("Não pode adcionar navio");
                }
            }
        }
    }
    
    public boolean verificarTiro(int linha,int coluna){
        return campo[linha][coluna] != ' ';
    }
    
    
    public int converter(String letra){
        switch(letra){
            case "A": return 1;
            case "B": return 2;
            case "C": return 3;
            case "D": return 3;
            case "E": return 3;
            case "F": return 3;
            case "G": return 3;
            case "H": return 3;
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
                if(campo[i][j]!=' '){
                    System.out.print("|"+ campo[i][j] + "| ");
               }
                System.out.print("| "+ campo[i][j] + "| ");
                
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
