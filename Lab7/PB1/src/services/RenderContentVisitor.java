package services;

import models.*;

public class RenderContentVisitor implements Visitor{
    @Override
    public void visitBook(Book book) {
        System.out.println("Carte: " + book.getTitle());

        System.out.println("Autori: ");
        for (Author i : book.getAuthors())
            i.print();

        System.out.println("Elemente: ");
        for (Element i : book.getElements()) {
            Visitee castedI = (Visitee) i;
            castedI.accept(this);
        }
    }

    @Override
    public void visitSection(Section section) {
        System.out.println("Titlu: " + section.getTitle());

        for (Element i : section.getElements()) {
            Visitee castedI = (Visitee) i;
            castedI.accept(this);
        }
    }

    @Override
    public void visitTableOfContents(TableOfContent toc) {
        System.out.println("Cuprins");
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        if (paragraph.getAlignStrategy() != null) {
            paragraph.getAlignStrategy().render(paragraph, null);
        }
        else
            System.out.println("models.Paragraph" + paragraph.getParagraphName());
    }

    @Override
    public void visitImageProxy(ImageProxy ip) {
        System.out.println("models.Image proxy with url:" + ip.getUrl() + " and dimension:" + ip.getDim());

        Image localImage = ip.loadImage();
        visitImage(localImage);
    }

    @Override
    public void visitImage(Image image) {
        System.out.println(image.getImageName());
    }

    @Override
    public void visitTable(Table table) {
        System.out.println(table.getTitle());
    }
}
