public class Videoclip  extends Playlist {
    public int timpDescarcare = 5;
    public String Url;
    public Videoclip(int kb, String titlu int timpDescarcare) {
        super(kb, titlu);
        this.timpDescarcare = timpDescarcare;
    }
    @Override
    public void print() {
        System.out.println("Videoclip \t   " + timpDescarcare);
    }
}
