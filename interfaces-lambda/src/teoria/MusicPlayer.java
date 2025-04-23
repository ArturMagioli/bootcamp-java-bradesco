package teoria;

public interface MusicPlayer {

    //propriedades em interfaces sempre são públic, final e static

    //Só trabalha com métodos abstratos (<= java 8)
    void playMusic();

    void pauseMusic();

    void stopMusic();
}
