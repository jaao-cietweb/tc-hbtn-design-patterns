public class MediaPlayerAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerAdapter(TipoMedia tipoMedia) {
        if (!tipoMedia.equals(TipoMedia.MP3)) {
            this.advancedMediaPlayer = new VideoMediaPlayer();
        }
    }

    @Override
    public void reproduzir(TipoMedia tipoMedia, String nomeDoArquivo) {
        if (tipoMedia == TipoMedia.VLC) {
            advancedMediaPlayer.reproduzirVlc(nomeDoArquivo);
        } else if (tipoMedia == TipoMedia.MP4) {
            advancedMediaPlayer.reproduzirMp4(nomeDoArquivo);
        }
    }
}