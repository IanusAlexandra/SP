import java.util.ArrayList;
import  java.util.List;

public class Book {
    public List<String> paragrafe=new ArrayList<>();
    public List<String> imagini=new ArrayList<>();
    public List<String> tabele=new ArrayList<>();

    public void createNewParagraf(String paragraf){
        paragrafe.add(paragraf);
    }

    public void createNewImagini(String imagine){
        imagini.add(imagine);
    }

    public void createNewTabele(String tabel){
        tabele.add(tabel);
    }

    public void print(){
        System.out.println(paragrafe);
        System.out.println(imagini);
        System.out.println(tabele);
    }



}

