package models;

import models.Element;
import services.Visitee;
import services.Visitor;

public class ImageProxy  implements Element, Picture , Visitee {
    private String url;
    private Dimension dim= new Dimension(400,400);
    private Image img;
    public ImageProxy(String url){
        this.url=url;
    }
    public ImageProxy(ImageProxy imageProxy) {
        this.url = imageProxy.url;
        this.dim = imageProxy.dim;
        this.img = imageProxy.img;
    }
    public Image loadImage(){
       if(this.img==null){
           this.img= new Image(url);
        }
       return this.img;
    }

    @Override
    public void add(Element element) throws Exception {

    }

    @Override
    public void remove(Element element) {

    }
    public Element clone() {
        return new ImageProxy(this.url);
    }

    @Override
    public String url() {
        return null;
    }

    @Override
    public Dimension dim() {
        return null;
    }

    public String getUrl() {
        return url;
    }

    public Dimension getDim() {
        return dim;
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visitImageProxy(this);
    }
}
