package models;

import services.AlignStrategy;
import services.Visitee;
import services.Visitor;

public class Paragraph implements Element , Visitee {
    public String paragraphName;
    private AlignStrategy alignStrategy;

    public Paragraph(String paragraphName){
        this.paragraphName=paragraphName;
    }
    public Paragraph(Paragraph paragraph) {
        this.paragraphName = paragraph.paragraphName;
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

    public String getParagraphName() {
        return paragraphName;
    }

    public AlignStrategy getAlignStrategy() {
        return alignStrategy;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitParagraph(this);
    }
}
