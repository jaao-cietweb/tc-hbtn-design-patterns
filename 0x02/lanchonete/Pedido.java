import java.util.HashSet;

public class Pedido {
    private HashSet<ItemPedido> itensDentroCaixa;
    private HashSet<ItemPedido> itensForaCaixa;

    public Pedido() {
        itensForaCaixa = new HashSet<>();
        itensDentroCaixa = new HashSet<>();

    }

    public Pedido(HashSet<ItemPedido> itensDentroCaixa, HashSet<ItemPedido> itensForaCaixa) {
        this.itensDentroCaixa = itensDentroCaixa;
        this.itensForaCaixa = itensForaCaixa;
    }

    public void adicionarItemDentroCaixa(ItemPedido item){
        itensDentroCaixa.add(item);
    }
    public void adicionarItemForaCaixa(ItemPedido item){
        itensForaCaixa.add(item);
    }

    @Override
    public String toString() {
        StringBuilder validador = new StringBuilder();
        validador.append("\tFora da Caixa:\n");
        for (ItemPedido itemPedido:itensForaCaixa) {
            validador.append("\t\t- ").append(itemPedido.getTipo()).append(" ").append(itemPedido.getNome()).append("\n");

        }
        validador.append("\tDentro da Caixa:\n");
        for (ItemPedido itemPedido: itensDentroCaixa) {
            validador.append("\t\t- ").append(itemPedido.getTipo()).append(" ").append(itemPedido.getNome()).append("\n");
        }

        return validador.toString();
    }

    public HashSet<ItemPedido> getItensDentroCaixa() {
        return itensDentroCaixa;
    }

    public HashSet<ItemPedido> getItensForaCaixa() {
        return itensForaCaixa;
    }
}