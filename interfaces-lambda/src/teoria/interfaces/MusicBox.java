package teoria.interfaces;

public class MusicBox implements MusicPlayer{
    
    @Override
    public void playMusic() {
        System.out.println("A caixa de música está: Tocando música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("A caixa de música está: Pausando música");
    }

    @Override
    public void stopMusic() {
        System.out.println("A caixa de música está: Parando música");
    }

}
