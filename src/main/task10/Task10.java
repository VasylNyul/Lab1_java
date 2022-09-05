package main.task10;

public class Task10 {
    public static void main(final String[] args) {
        final Door door =new Door("дерево", "чорний");
        final Roof roof =new Roof("металочерепиця", "синій");
        final Window window =new Window("чорний",3);

        final House house = new House(door, roof, window);
        house.setRoof();
        house.setWindow();
        house.setDoor();
        System.out.println(house);
    }
}
