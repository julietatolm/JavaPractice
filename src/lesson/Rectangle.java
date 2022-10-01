package lesson;

public class Rectangle {
    private int width;
    private int height;

    Rectangle (int width, int height) {
        if (width < 1 || height < 1) {
            System.out.println("Wrong input");
        }
        else {
            this.width = width;
            this.height = height;
        }
    }

    public void square() {
        System.out.println("Square = " + width*height);
    }

}
