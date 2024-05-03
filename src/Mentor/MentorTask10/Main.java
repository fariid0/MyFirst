package src.Mentor.MentorTask10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Song song1 = new Song("Goyercin", "Roya", 2.35);
        Song song2 = new Song("Seninem", "Roya", 2.30);
        Song song3 = new Song("Zulmetem", "Roya", 3.05);
        System.out.println("Song name, Artist and Duration: ");
        Song song4 = new Song(sc.nextLine(), sc.nextLine(), sc.nextDouble());


        Song[] playlist = {song1, song2, song3, song4, null};

        Playlist playlist1 = new Playlist(playlist);

        for (int i = 0; i < playlist.length; i++) {
            System.out.println(playlist[i]);
        }

        System.out.println(playlist1);
    }
}
