import java.util.Scanner;

class Song {
    int songId;
    String songTitle;
    String artistName;
    String albumTitle;
    String genre;
    int durationInSeconds;
    int playCount;
    Boolean addedToPlaylist;

    public Song() {
        // Default constructor
        addedToPlaylist = false;
    }

    public Song(int duration) {
        this.durationInSeconds = duration;
        addedToPlaylist = false;
    }

    public static int search(Song[] song, int id) {
        for (int i = 0; i < song.length; i++) {
            if (song[i].songId == id) {
                return i;
            }
        }
        return -1;
    }

    public void setDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Song ID: ");
        songId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Song Title: ");
        songTitle = scanner.nextLine();
        System.out.print("Enter Artist Name: ");
        artistName = scanner.nextLine();
        System.out.print("Enter Album Title: ");
        albumTitle = scanner.nextLine();
        System.out.print("Enter Genre: ");
        genre = scanner.nextLine();
        System.out.print("Enter Duration (in seconds): ");
        durationInSeconds = scanner.nextInt();
    }

    public void setDetails(int id, String title, String artist, String album, String genre, int duration) {
        songId = id;
        songTitle = title;
        artistName = artist;
        albumTitle = album;
        this.genre = genre;
        durationInSeconds = duration;
    }

    public void getDetails() {
        System.out.println("Song ID: " + songId);
        System.out.println("Title: " + songTitle);
        System.out.println("Artist: " + artistName);
        System.out.println("Album: " + albumTitle);
        System.out.println("Genre: " + genre);
        System.out.println("Duration: " + durationInSeconds + " seconds");
        System.out.println("Play Count: " + playCount);
    }

    public static void getDetails(Song[] songs, int id) {
        songs[search(songs, id)].getDetails();
    }

    public void play() {
        System.out.println("Playing: " + songTitle);
        playCount++;
    }

    public void addToPlaylist(int id) {
        if (songId == id) {
            addedToPlaylist = true;
        }
    }

    public void removeFromPlayList(int id) {
        if (songId == id) {
            addedToPlaylist = false;
        }
    }

}

public class q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Song[] songs = new Song[2];

        for (int i = 0; i < songs.length; i++) {
            songs[i] = new Song();
            System.out.println("Enter details for Song " + (i + 1));
            songs[i].setDetails();
        }

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Set Details");
            System.out.println("2. Get Details");
            System.out.println("3. Play");
            System.out.println("4. Add to Playlist");
            System.out.println("5. Remove from Playlist");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            int songId;
            switch (choice) {
                case 1:
                    System.out.print("Enter Song ID: ");
                    songId = scanner.nextInt();
                    songs[Song.search(songs, songId)].setDetails();
                    break;
                case 2:
                    System.out.print("Enter Song ID: ");
                    songId = scanner.nextInt();
                    Song.getDetails(songs, songId);
                    break;
                case 3:
                    System.out.print("Enter Song ID: ");
                    songId = scanner.nextInt();
                    songs[Song.search(songs, songId)].play();
                    break;
                case 4:
                    System.out.print("Enter Song ID: ");
                    songId = scanner.nextInt();
                    songs[Song.search(songs, songId)].addToPlaylist(songId);
                    break;
                case 5:
                    System.out.print("Enter Song ID: ");
                    songId = scanner.nextInt();
                    songs[Song.search(songs, songId)].removeFromPlayList(songId);
                    break;
                case 6:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        } while (choice != 6);
    }
}
