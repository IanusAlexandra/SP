public class JPGImageLoader implements imageLoader {

    private String imageName;
    public JPGImageLoader(String imageName){
        this.imageName = imageName;
    }

    @Override
    public void load(String str) {
        System.out.println("Loaded JPG Image: " + str);
    }
}
