package teoria.interfaces;

/**
 * Records não conseguem receber herança, mas conseguem implementar interfaces
 */
public record MusicBoxRecord(String music, boolean isPaused) implements MusicPlayer {
    
    @Override
    public void playMusic() {

    }

    @Override
    public void pauseMusic() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void stopMusic() {
        // TODO Auto-generated method stub
        
    }
}
