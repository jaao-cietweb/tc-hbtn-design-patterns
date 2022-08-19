abstract class Personagem {
    String nome;
    TipoPersonagem tipo;
    int inteligencia;
    int forca;
    int vigor;
    int resistencia;
    int destreza;

    public Personagem(String nome, TipoPersonagem tipo, int inteligencia, int forca, int vigor, int resistencia, int destreza) {
        this.nome = nome;
        this.tipo = tipo;
        this.inteligencia = inteligencia;
        this.forca = forca;
        this.vigor = vigor;
        this.resistencia = resistencia;
        this.destreza = destreza;
    }

    public double getDanoAtaque(){
        return this.forca;
    }

    @Override
    public String toString() {
    return "Personagem { nome = " + this.nome +
            ", tipo = " + this.tipo +
            ", inteligencia = " + this.inteligencia +
            ", forca = " + this.forca +
            ", vigor = " + this.vigor +
            ", resistencia = " +  this.resistencia +
            ", destreza = " + this.destreza +
            ", dano ataque = "+ String.format("%.2f", getDanoAtaque()) +"}";
    }
}
