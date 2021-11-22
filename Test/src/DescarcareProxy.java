public class DescarcareProxy {

    private String url;

    public DescarcareProxy(String url) {
        this.url = url;
    }

    public DescarcareProxy(DescarcareProxy des) {
        this.url = des.url;

    }

    @Override
    public void print() {
        System.out.println(" url:" + url  );



    }
