public class CalculateDimVisitor implements Visitor {
    private int videoclip;
    private int gif;
    private int melodie;

    @Override
    public void calculateDim(Gif gif) {
        gifDim += gif.getDim();
    }

    @Override
    public void calculateDim(Videoclip videoclip) {
        videoclipDim += videoclip.getDim();
    }

    @Override
    public void calculateDim(Melodii melodii) {
        melodiiDim += meloduu.getDim();
    }
    public void printDim() {
        System.out.println("Dimensiune totala gif: " + this.gifDim);
        System.out.println("Dimensiune totala videoclip-uri: " + this.videoclipDin);
        System.out.println("Dimensiune totala melodii: " + this.melodiiDim);
        System.out.println("Dimensiune totala: " + (this.gifDim+  this.melodiiDim + this.videoclipDim));
    }

}
