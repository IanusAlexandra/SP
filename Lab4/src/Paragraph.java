public class Paragraph implements Element{
    public String paragraphName;

    public Paragraph(String paragraphName){
        this.paragraphName=paragraphName;
    }
    @Override
    public void print(){
        System.out.println(this.paragraphName);
    }

    @Override
    public void add(Element element) throws Exception {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public boolean find(Element element) {
        if (!(element instanceof Paragraph))
            return false;
        else {
            return ((Paragraph) element).paragraphName.equals(this.paragraphName);
        }
    }
}