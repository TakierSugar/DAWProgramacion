package POO;

public class MusicOrganizerMain {
    public static void main(String[] args) {
        MusicOrganizer M0;
        M0 = new MusicOrganizer();
        M0.addFile("A");
        M0.addFile("B");
        M0.checkIndex(1);
        M0.checkIndex(90);
        M0.listFile(2);
        M0.isValidIndex(90);
        M0.listFileV2(1);
    }
}
