package class08_31;

public class Car extends Transport implements MotorSound {

    @Override
    public void makeMotorSound() {
        System.out.println("BrrBrrrBrrr");
    }
}
