//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MovablePoint obj = new MovablePoint(0, 0, 5, 5);


        obj.moveUp();
        obj.printPosition();

        obj.moveDown();
        obj.printPosition();

        obj.moveLeft();
        obj.printPosition();

        obj.moveRight();
        obj.printPosition();
    }
}