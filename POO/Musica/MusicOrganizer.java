package POO.Musica;

import java.util.ArrayList;

public class MusicOrganizer {

    private ArrayList<String> files;
    private MusicPlayer player;
    public MusicOrganizer(){
        files = new ArrayList<>();
        player = new MusicPlayer();
    }
    public void addFile(String filename){
        files.add(filename);
    }
    public int getNumberOfFiles(){
        return files.size();
    }
    public void listFile(int index){
        if(index >= 0 && index < files.size()) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    public void removeFile(int index){
        if(index >= 0 && index < files.size()) {
            files.remove(index);
        }
    }
    public void startPlaying(int index){
        String filename = files.get(index);
        player.startPlaying(filename);
    }
    public void stopPlaying(){
        player.stop();
    }
    public void listAllFiles(){
        for(String i : files) System.out.println(i);
    }
    public void listMaching(String match){
        boolean encontrado = false;
        for(String elem : files){
            if(elem.contains(match)){
                System.out.println(elem);
                encontrado = true;
            }
        } 
        if (!encontrado){
            System.out.println("No se han encontrado canciones");
        }
    }
    public void playMaching(String match){
        for (String cancion : files) {
            if(cancion.contains(match)){
                System.out.println(cancion);
                player.playSample(cancion);
            }
        }
    }
    public ArrayList<String> getMatching(String match){
        ArrayList<String> resultado = new ArrayList<>();

        for (String cancion : files){
            if(cancion.contains(match)){
                resultado.add(cancion);
            }
        }
        return resultado;
    }
    public void findFirst(String searchString){
        int contador = 0; 
        for(String elem : files)
        do{ 
            if(elem.contains(searchString)){
            System.out.println(elem);
            contador = files.size();
            }else{
            contador++; 
            }
        }while(contador <= files.size());
    }
}