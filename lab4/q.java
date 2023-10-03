import java.util.Scanner;

class Song {
    int songId;
    String songTitle;
    String artistName;
    String genre;
    int durationInSeconds;
    int playCount;
    Song(int duration)
    {
        durationInSeconds=duration;
    }
    public void setDetails(int id,String title,String name,String gen,int duration)
    {
        songId=id;
        songTitle=title;
        artistName=name;
        genre=gen;
        durationInSeconds=duration;
    }

}
class q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        sc.close();
    }
}