package teoria;

public class Smartphone implements VideoPlayer, MusicPlayer{
    
    @Override
    public void playMusic() {
        System.out.println("O smartphone está: Tocando música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O smartphone está: Pausando música");
    }

    @Override
    public void stopMusic() {
        System.out.println("O smartphone está: Parando música");
    }

    @Override
    public void playVideo() {
        System.out.println("O smartphone está: Rodando o vídeo");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O smartphone está: Pausando vídeo");
    }

    @Override
    public void stopVideo() {
        System.out.println("O smartphone está: Parando o vídeo");
    }
}
