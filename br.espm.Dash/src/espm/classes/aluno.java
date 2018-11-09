package espm.classes;


public class aluno {
    private int codi;
    private String nome;
    private String email;
    private String cel;
    private int scodi;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public int getScodi() {
        return scodi;
    }

    public void setScodi(int scodi) {
        this.scodi = scodi;
    }

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public aluno(int codi, String nome, String email, String cel, int scodi) {
        this.codi = codi;
        this.nome = nome;
        this.email = email;
        this.cel = cel;
        this.scodi = scodi;
    }
}
