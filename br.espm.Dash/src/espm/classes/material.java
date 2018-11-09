package espm.classes;


public class material {
    private int codi;
    private int mcodi;
    private String desc;
    private int quant;

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public int getMcodi() {
        return mcodi;
    }

    public void setMcodi(int mcodi) {
        this.mcodi = mcodi;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public material(int codi, int mcodi, String desc, int quant) {
        this.codi = codi;
        this.mcodi = mcodi;
        this.desc = desc;
        this.quant = quant;
    }
    
    
}
