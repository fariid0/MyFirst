package src.Mentor.MentorTask10;

import java.util.Arrays;

public class Playlist {
    Song[] song;
    int size;

    public Playlist(Song[] song) {
        this.song = song;
        this.size = song.length;
    }

    public Song[] getSong() {
        return song;
    }

    public void setSong(Song[] song) {
        this.song = song;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Playlist playlist = (Playlist) o;
        return Arrays.equals(song, playlist.song);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(song);
    }

    @Override
    public String toString() {
        return "Playlist " +
                "song: " + Arrays.toString(song) + "\n" + "Size: "+ size;
    }
}
