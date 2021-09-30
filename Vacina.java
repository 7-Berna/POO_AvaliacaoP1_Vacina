public class Vacina {
    Vacina(){}
    Vacina(String descricao, String fabricante, int lote){
        setDescricao(descricao);
        setFabricante(fabricante);
        setLote(lote);
    }
    private String descricao;
    private String fabricante;
    private int lote;

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public int getLote() {
        return lote;
    }
}
