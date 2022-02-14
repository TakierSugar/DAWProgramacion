package POO.Musica;

public class MusicMain {
    public static void main(String[] args) {
        MusicOrganizer M1;
        M1 = new MusicOrganizer();
        M1.addFile("El matcho");
        M1.addFile("KKKKKKKKKKKKK");
        M1.addFile("This music match with potatos");
        M1.listAllFiles();
        M1.getMatching("match");
    }
}
