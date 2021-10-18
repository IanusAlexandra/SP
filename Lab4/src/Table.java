public class Table implements  Element{
    private String title;


    public Table(String title){
        this.title=title;
    }
    @Override
    public void print(){
        System.out.println(this.title);
    }

    @Override
    public void add(Element element) throws Exception {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public boolean find(Element element) {
        if (!(element instanceof Table))
            return false;
        else {
            return ((Table) element).title.equals(this.title);
        }
    }
}