public class Paragraph implements Element{
    public String paragraphName;
    private AlignStrategy alignStrategy;

    public Paragraph(String paragraphName){
        this.paragraphName=paragraphName;
    }
    public void print() {
        if (this.alignStrategy != null) {
            this.alignStrategy.render(this, null);
        }
        else
            System.out.println("Paragraph" + this.paragraphName);
    }

    @Override
    public void add(Element element) throws Exception {

    }
    public void setAlign(AlignStrategy align) {
        this.alignStrategy = align;
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