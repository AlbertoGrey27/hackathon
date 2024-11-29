public class Robo {

    private String nomeRobo;
    private String peso;
    private String tipo;
    private String sistemaOperacional;
    private String pontosJuiz;
    private Boolean associado = false;

    
    public Robo() {
    }
    public String getSistemaOperacional() {
        return sistemaOperacional;
    }
    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }
    public String getPontosJuiz() {
        return pontosJuiz;
    }
    public void setPontosJuiz(String pontosJuiz) {
        this.pontosJuiz = pontosJuiz;
    }
    public Robo(String nomeRobo, String peso, String tipo) {
        this.nomeRobo = nomeRobo;
        this.peso = peso;
        this.tipo = tipo;
    }
    public String getNomeRobo() {
        return nomeRobo;
    }
    public void setNomeRobo(String nomeRobo) {
        this.nomeRobo = nomeRobo;
    }
    public String getPeso() {
        return peso;
    }
    public void setPeso(String peso) {
        this.peso = peso;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Boolean getAssociado() {
        return associado;
    }
    public void setAssociado(Boolean associado) {
        this.associado = associado;
    }

    



}
