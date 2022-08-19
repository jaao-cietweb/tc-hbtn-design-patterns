public class Guerreiro extends Personagem{
    public Guerreiro(String nome, int inteligencia, int forca, int vigor,
                int resistencia, int destreza) {
        super(nome, TipoPersonagem.GUERREIRO, inteligencia, forca, vigor,
                resistencia, destreza);
    }

    @Override
    public double getDanoAtaque(){
        return (forca * 0.8) + (vigor * 0.05) + (destreza * 0.1) + (inteligencia * 0.05);
    }
}
