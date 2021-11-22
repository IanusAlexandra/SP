public class MP4Descarcare implements Descarcare{
    private String extensie;

    public MP4Descarcare(String extensie) {
        this.extensie = extensie;
    }
    @Override
    public void descarcare(String str) {
        System.out.println("Descarcare mp4 video: " + str);
    }
}
