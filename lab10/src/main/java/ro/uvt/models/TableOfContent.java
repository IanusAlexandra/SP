package models;

import models.Element;
import services.Visitee;
import services.Visitor;

public class TableOfContent implements Element, Visitee {

    public void print(){
        System.out.println("Cuprins: ");

    }

    @Override
    public void add(Element element) throws Exception {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTableOfContents(this);
    }
}
