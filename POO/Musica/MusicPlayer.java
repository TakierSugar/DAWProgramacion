package POO.Musica;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.AudioDevice;
import javazoom.jl.player.FactoryRegistry;
import javazoom.jl.player.advanced.AdvancedPlayer;

public class MusicPlayer{

    private AdvancedPlayer player;
    public MusicPlayer(){
        player = null;
    }
    public void playSample(String filename){
        try {
            setupPlayer(filename);
            player.play(500);
        }
        catch(JavaLayerException e) {
            reportProblem(filename);
        }
        finally {
            killPlayer();
        }
    }    
    public void startPlaying(final String filename){
        try {
            setupPlayer(filename);
            Thread playerThread = new Thread() {
                public void run()
                {
                    try {
                        player.play(5000);
                    }
                    catch(JavaLayerException e) {
                        reportProblem(filename);
                    }
                    finally {
                        killPlayer();
                    }
                }
            };
            playerThread.start();
        }
        catch (Exception ex) {
            reportProblem(filename);
        }
    }
    public void stop(){
        killPlayer();
    }
    private void setupPlayer(String filename){
        try {
            InputStream is = getInputStream(filename);
            player = new AdvancedPlayer(is, createAudioDevice());
        }
        catch (IOException e) {
            reportProblem(filename);
            killPlayer();
        }
        catch(JavaLayerException e) {
            reportProblem(filename);
            killPlayer();
        }
    }
    private InputStream getInputStream(String filename)
        throws IOException{
        return new BufferedInputStream(
                    new FileInputStream(filename));
    }
    private AudioDevice createAudioDevice()
        throws JavaLayerException{
        return FactoryRegistry.systemRegistry().createAudioDevice();
    }
    private void killPlayer(){
        synchronized(this) {
            if(player != null) {
                player.stop();
                player = null;
            }
        }
    }
    private void reportProblem(String filename){
        System.out.println("There was a problem playing: " + filename);
    }
    
}