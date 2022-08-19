public class ItemPedido {
    private TipoItemPedido tipo;
    private String nome;

    @Override
    public String toString() {
        return " - " + tipo +
                " " + nome;
    }

    public TipoItemPedido getTipo() {
        return tipo;
    }

    public void setTipo(TipoItemPedido tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}