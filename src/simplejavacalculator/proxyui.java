package simplejavacalculator;

public class proxyui implements pimage{
    private ui1 realImage;
    private String filename;

    public proxyui(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if(realImage == null) {  // Lazy initialization
            realImage = new ui1(filename);
        }
        realImage.display();
    }
}



