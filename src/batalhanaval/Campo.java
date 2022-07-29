package batalhanaval;

public class Campo {
    private  char[][] campo;
    
    public Campo(){
        this.campo = new char[8][8];
    }
    
    public char getPosicao(int linha,int coluna){
        return campo[linha][coluna];
    }
    
    public void setPosicao(int linha,int coluna,char valor){
        this.campo[linha][coluna] = valor;
    }
    
    public void atualizar(int linha, int coluna,char valor){
        campo[linha][coluna] = valor;
    }
    
    
    public boolean verificarPosicao(int num, int linha,int coluna){
        int contl = linha+num+1;
        for(int i=linha-1;i<=contl;i++){
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
    
    
    public void adicionarArma(String tipo,int linha,int coluna){
        switch (tipo){
            case "submarino" -> {
                if(this.verificarPosicao(1, linha, coluna)){
                    campo[linha][coluna] = 's';
                }
                else{
                    System.out.println("Não pode adcionar arma");
                }
            }
            case "cruzador" ->{
                if(this.verificarPosicao(2, linha, coluna)){
                    campo[linha][coluna] = 'c';
                    campo[linha+1][coluna] = 'c';
                }
                else{
                    System.out.println("Não pode adcionar arma");
                }
            }
            case "porta-avioes" ->{
                if(this.verificarPosicao(5, linha, coluna)){
                    for(int i=coluna;i<=4;i++){
                        campo[i][coluna] = 'p';
                    }
                }
                else{
                    System.out.println("Não pode adcionar arma");
                }
            }
        }
    }
    
    public boolean verificarTiro(int linha,int coluna){
        return campo[linha][coluna] != ' ';
    }
    
    
}
