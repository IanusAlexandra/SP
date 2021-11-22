import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        ArrayList<Element> elements = new ArrayList<Element>();

        mediaPlayer muzica = new mediaPlayer("Muzica");

        Playlist muzica_romaneasca = new Playlist(100, "Inna");
        Playlist muzica_arabeasca = new Playlist(130, "Elena Gheorghe");
        Playlist opera = new Playlist(200,"Petra Todorovici");
        Playlist folclor = new Playlist(149, "Veta Biriș" )



        Videoclip video = new Videoclip(45, "Buna ziua" );
        Melodii mel = new Melodii(100, "Alieve");
        Gif g = new  Gif(4, "SpongeBob");

    mediaPlayer.add(muzica_arabeasca);
    mediaPlayer.add(muzica_romaneasca);
    mediaPlayer.add(folclor);
    mediaPlayer.add(opera);
    mediaPlayer.add(muzica_arabeasca);
    mediaPlayer.add(folclor);
    mediaPlayer.add(opera);

    mediaPlayer.print();
    CalculateDimVisitor visitor = new CalculateDimVisitor(visitor);
    mediaPlayer.accept(visitor);

    visitor.printDim();


    }
}
