package models;

import services.Visitee;
import services.Visitor;

public class Table implements Element, Visitee {
    private String title;


    public Table(String title){
        this.title=title;
    }

    public Table(Table table) {
        this.title = table.title;
    }

    @Override
    public void add(Element element) throws Exception {

    }
    @Override
    public void remove(Element element) {

    }

    public String getTitle() {
        return title;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTable(this);
    }
}
