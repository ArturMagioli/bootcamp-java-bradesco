package teoria;

public class Main {

    public static void main(String[] args) {
        //Como Computer implementa ambas as interfaces, ele consegue ser chamado em ambas as funções
        runMusic(new Computer());
        runVideo(new Computer());
    }

    public static void runVideo(VideoPlayer videoPlayer) {
        videoPlayer.playVideo();
    }

    public static void runMusic(MusicPlayer musicPlayer) {
        musicPlayer.playMusic();
    }
}
