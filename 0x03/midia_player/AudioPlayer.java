public class AudioPlayer implements MediaPlayer {

    private MediaPlayerAdapter mediaPlayerAdapter;
    @Override
    public void reproduzir(TipoMedia tipoMedia, String nomeDoArquivo) {
        if (tipoMedia == TipoMedia.MP3){
            System.out.printf("Reproduzindo MP3: "+nomeDoArquivo);
        }
        mediaPlayerAdapter = new MediaPlayerAdapter(tipoMedia);
        mediaPlayerAdapter.reproduzir(tipoMedia, nomeDoArquivo);
    }
}