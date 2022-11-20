public class Generic <T>{
    private T length;
    private T width;
    private T height;

    public Generic(T length, T width, T height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public static <T> void Box(T a){
        System.out.println(a);
    }
    public T getLength() {
        return length;
    }

    public void setLength(T length) {
        this.length = length;
    }

    public T getWidth() {
        return width;
    }

    public void setWidth(T width) {
        this.width = width;
    }

    public T getHeight() {
        return height;
    }

    public void setHeight(T height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Generic{"+ "Box:" +
                " length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
