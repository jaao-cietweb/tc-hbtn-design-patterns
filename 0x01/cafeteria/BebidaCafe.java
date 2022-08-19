import java.util.ArrayList;
import java.util.List;

public class BebidaCafe extends Bebida {

    @Override
    public List<String> obterIngredientes() {
        List<String> listaDeCafe = new ArrayList<>();
        listaDeCafe.add("cafe");
        return listaDeCafe;
    }

    @Override
    public double obterPreco() {
        return 5.35;
    }
}