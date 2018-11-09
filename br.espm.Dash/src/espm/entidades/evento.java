package espm.entidades;


public class evento {
    private String nome;
    private String orcamento;
    private String localizacao;
    private String renda;
    private String data;
    private String tipo;
    private int codi;    

    public evento(String nome, String orcamento, String localizacao, String renda, String data, String tipo, int codi) {
        this.nome = nome;
        this.orcamento = orcamento;
        this.localizacao = localizacao;
        this.renda = renda;
        this.data = data;
        this.tipo = tipo;
        this.codi = codi;
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

    public String getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(String orcamento) {
        this.orcamento = orcamento;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getRenda() {
        return renda;
    }

    public void setRenda(String renda) {
        this.renda = renda;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
