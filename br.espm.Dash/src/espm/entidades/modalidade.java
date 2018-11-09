package espm.entidades;


public class modalidade {
    private String nome;
    private int codi;

    public modalidade(String nome, int codi) {
        this.nome = nome;
        this.codi = codi;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }
    
}
