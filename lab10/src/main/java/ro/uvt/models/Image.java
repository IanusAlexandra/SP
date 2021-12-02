package models;

import services.ImageLoader;
import services.ImageLoaderFactory;
import services.Visitee;
import services.Visitor;

import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture, Visitee {
    private String imageName;
    private ImageLoader lodaer;
    private ImageLoaderFactory imageLoaderFactory = new ImageLoaderFactory();
    private Dimension dim = new Dimension(400,400);

    public Image(String imageName){
        this.imageName=imageName;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public Image(Image image) {
        this.imageName = image.imageName;
    }
    @Override
    public void add(Element element) throws Exception {

    }
    public void loadContent() throws Exception {
        lodaer = ImageLoaderFactory.create(imageName);
    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public String url() {
        return this.imageName;
    }

    @Override
    public Dimension dim() {
       return this.dim;
    }

    public String getImageName() {
        return imageName;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitImage(this);
    }
}
