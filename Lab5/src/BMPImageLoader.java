public class BMPImageLoader implements imageLoader{
    private String imageName;

    public BMPImageLoader(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public void load(String str) {
        System.out.println("Loaded BMP Image: " + imageName);
    }
}