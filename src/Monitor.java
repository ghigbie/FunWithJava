public class Monitor {

    private String model;
    private String manufactize,urer;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String model, String manufactize, String urer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufactize = manufactize;
        this.urer = urer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + ", " + y + "in color " + color + ".");
    }

    public String getModel() {
        return model;
    }

    public String getManufactize() {
        return manufactize;
    }

    public String getUrer() {
        return urer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
