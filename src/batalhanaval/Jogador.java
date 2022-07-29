package batalhanaval;

public class Jogador {
    private String nome;
    private Campo meucampo;
    private Campo campoimigo;
    private int cont = 0;

    public Jogador(String nome, Campo campoimigo) {
        this.nome = nome;
        this.meucampo = new Campo();
        this.campoimigo = campoimigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
    public void registrarTiro(int linha, int coluna){
        if(campoimigo.verificarTiro(linha,coluna)){
            meucampo.setPosicao(linha, coluna, campoimigo.getPosicao(linha, coluna));
            System.out.println("Acertou um navio");
            cont++;
        }
        else{
            meucampo.setPosicao(linha, coluna, 'o');
            System.out.println("Tiro na agua");
        }
    }
    
    public boolean venceu(){
        return cont==12;
    }
    
    
}
