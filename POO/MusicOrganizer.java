package POO;

import java.util.ArrayList;

public class MusicOrganizer
{
    private ArrayList<String> files;
    public MusicOrganizer(){
        files = new ArrayList<>();
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
    public void checkIndex(int index){
        if(index >= files.size() || index < 0)
        System.out.printf("Valor no valido, el rango de valores validos es de 0 a %d",files.size()-1);
        System.out.println("");
    }
    public boolean isValidIndex(int index){
        boolean resultado;
        if(index > files.size() || index < 0)
        resultado = false;
        else 
        resultado = true;
        return resultado;
    }
    public void listFileV2(int index){
        if(isValidIndex(index)) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    public void removeFileV2(int index){
        if(isValidIndex(index)) {
            files.remove(index);
        }
    }
}