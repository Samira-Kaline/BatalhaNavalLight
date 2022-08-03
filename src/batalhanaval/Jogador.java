package batalhanaval;

public class Jogador {
    private String nome;
    private Campo meucampo;
    private Campo campoinimigo;
    private int cont = 0;

    public Jogador(String nome, Campo meucampo) {
        this.nome = nome;
        this.meucampo = meucampo;
        this.campoinimigo = new Campo();
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
        return campoinimigo;
    }

    public void setCampoiminigo(Campo campoiminigo) {
        this.campoinimigo = campoiminigo;
    }
    
    public void registrarTiro(int linha, int coluna){
        if(meucampo.verificarTiro(linha,coluna)){
            campoinimigo.setPosicao(linha, coluna, meucampo.getPosicao(linha, coluna));
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
