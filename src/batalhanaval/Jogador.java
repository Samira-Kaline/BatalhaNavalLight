package batalhanaval;

public class Jogador {
    private String nome;
    private Campo meucampo;
    private Campo campoiminigo;
    private int cont = 0;

    public Jogador(String nome, Campo campoiminigo) {
        this.nome = nome;
        this.meucampo = new Campo();
        this.campoiminigo = campoiminigo;
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

    public Campo getMeucampo() {
        return meucampo;
    }

    public void setMeucampo(Campo meucampo) {
        this.meucampo = meucampo;
    }

    public Campo getCampoiminigo() {
        return campoiminigo;
    }

    public void setCampoiminigo(Campo campoiminigo) {
        this.campoiminigo = campoiminigo;
    }
    
    public void registrarTiro(int linha, int coluna){
        if(campoiminigo.verificarTiro(linha,coluna)){
            meucampo.setPosicao(linha, coluna, campoiminigo.getPosicao(linha, coluna));
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
