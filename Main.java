import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Location forest = new Location(1, "Лес", new int[]{2, 4, 3}, "forestbg.jpg");
        Location lake = new Location(2, "Озеро", new int[]{1}, "lakebg.jpg");
        Hero hero = new Hero(30, true, forest);

        Random rnd = new Random();
        Tree[] array = new Tree[10];
        for (int i = 0; i < array.length; i++) {
            int x = rnd.nextInt(2);
            System.out.println("");
            if (x == 0) {
                array[i] = new Oak(false);
            } else {
                array[i] = new AppleTree(false, new Random().nextInt(50));
            }
            array[i].showTree();
        }
    }
}





