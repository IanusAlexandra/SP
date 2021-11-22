public class MVKDescarcare  implements Descarcare{

    private String extensie;

    public MVKDescarcare(String extensie) {
        this.extensie = extensie;
    }
    @Override
    public void load(String str) {
        System.out.println("Descarcare mvk video: " + extensie);
    }
}
