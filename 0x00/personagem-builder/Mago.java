public class Mago extends Personagem{
    public Mago(String nome, int inteligencia, int forca, int vigor, int resistencia, int destreza) {
        super(nome, TipoPersonagem.MAGO, inteligencia, forca, vigor, resistencia, destreza);
        if (inteligencia< destreza || inteligencia < forca) {
            throw new IllegalArgumentException("Atributos invalidos para MAGO");
        }
    }

    @Override
    public double getDanoAtaque(){
        return (inteligencia * 0.8) + (forca * 0.05) + (destreza * 0.05) + (vigor * 0.1);
    }
}
