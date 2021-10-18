public class ImageProxy  implements Element,Picture{
    private String url;
    private Dimension dim= new Dimension(400,400);
    private Image img;
    public ImageProxy(String url){

        this.url=url;
    }
    @Override
    public void print() {
        System.out.println("Image proxy with url:"+url+"and dimension"+dim);
        loadImage();
    }

    private Image loadImage(){
        if(this.img==null){
            this.img= new Image (url);
        }
        return this.img;
    }

    @Override
    public void add(Element element) throws Exception {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public boolean find(Element element) {
        return false;
    }

    @Override
    public String url() {
        return null;
    }

    @Override
    public Dimension dim() {
        return null;
    }
}