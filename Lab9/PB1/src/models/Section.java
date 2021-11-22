package models;

import models.Element;
import services.Utils;
import services.Visitee;
import services.Visitor;

import java.util.ArrayList;
import java.util.Collections;

public class Section implements Element , Visitee {
    private String title;
    private ArrayList<Element> elements;

    public Section(String title){
        this.title=title;
        this.elements=new ArrayList<Element>();

    }
    public Section(Section section) {
        this.title = section.title;
        this.elements = new ArrayList<>();
        Collections.copy(this.elements, section.elements);
    }

    @Override
    public void add(Element elements) throws Exception {
        Element element = Utils.checkAndReturnCopy(elements);
        this.elements.add(element);
    }

    @Override
    public void remove(Element element) {
        this.elements.remove(element);
    }


    public void addWithoutCopy(Element elementToBeAdded) throws Exception {
        this.elements.add(elementToBeAdded);
    }


    public String getTitle() {
        return title;
    }

    public ArrayList<Element> getElements() {
        return elements;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSection(this);
    }
}
