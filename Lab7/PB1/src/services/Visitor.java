package services;

import models.*;

public interface Visitor {
    void visitBook(Book book);
    void visitSection(Section section);
    void visitTableOfContents(TableOfContent toc);
    void visitParagraph(Paragraph paragraph);
    void visitImageProxy(ImageProxy ip);
    void visitImage(Image image);
    void visitTable(Table table);

}

