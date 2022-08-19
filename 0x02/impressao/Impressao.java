public class Impressao {
    private int paginasTotais;
    private int paginasColoridas;
    private boolean ehFrenteVerso;
    private double valorColoridasFrenteVerso = 0.20;
    private double valorPretoBrancoFrenteVerso = 0.10;
    private double valorColoridasFrenteApenas = 0.25;
    private double valorPretoBrancoFrenteApenas = 0.15;
    private TamanhoImpressao tamanhoImpressao;

    public Impressao(TamanhoImpressao tamanhoImpressao, int paginasTotais, int paginasColoridas, boolean ehFrenteVerso) {
        this.tamanhoImpressao = tamanhoImpressao;
        this.paginasTotais = paginasTotais;
        this.paginasColoridas = paginasColoridas;
        this.ehFrenteVerso = ehFrenteVerso;

    }

    public double calcularTotal() {

        switch (tamanhoImpressao) {
            case A2:
                if (ehFrenteVerso) {
                    valorPretoBrancoFrenteVerso += 0.08;
                    valorColoridasFrenteVerso += 0.08;
                } else {
                    valorPretoBrancoFrenteApenas += 0.07;
                    valorColoridasFrenteApenas += 0.07;
                }
                break;
            case A3:
                if (ehFrenteVerso) {
                    valorPretoBrancoFrenteVerso += 0.05;
                    valorColoridasFrenteVerso += 0.05;
                } else {
                    valorPretoBrancoFrenteApenas += 0.05;
                    valorColoridasFrenteApenas += 0.05;
                }
                break;

        }
        if (ehFrenteVerso) {
            return paginasColoridas * valorColoridasFrenteVerso + ((paginasTotais - paginasColoridas) * valorPretoBrancoFrenteVerso);
        }else {
            return paginasColoridas * valorColoridasFrenteApenas + ((paginasTotais - paginasColoridas) * valorPretoBrancoFrenteApenas);
        }

    }

    @Override
    public String toString() {
        String frenteVersoTipo = ehFrenteVerso ? "frente e verso" : "frente apenas";
        int paginasPretoBranco = paginasTotais - paginasColoridas;
        return String.format("total de paginas: %d, total coloridas: %d, total preto e branco: %d, %s. total: R$ %.2f",
                paginasTotais, paginasColoridas,paginasPretoBranco, frenteVersoTipo, calcularTotal());

    }

}