class Hero {
    private String name; // имя персонажа
    private int strength; // сила персонажа
    private boolean hasAxe; // наличие топора у персонажа
    private Location location; // местоположение персонажа

    Hero(int s, boolean a, Location l) {
        name = "Персонаж";
        strength = s;
        hasAxe = a;
        location = l;
    }

    String name() {
        return name;
    }

    Location location() {
        return location;
    }

    void fellTree(Tree tree) {
        // Проверяем, может ли персонаж срубить выбранное дерево
        if (!tree.felled && hasAxe && strength >= tree.resistance) {
            System.out.println(name + " срубил дерево " + tree.species);
            tree.felled = true;
            tree.showTree();
            return;
        }
        System.out.println(name + " не может срубить дерево " + tree.species);
    }
    void moveTo(Location loc) {
        if (location.checkWays(loc)) {
            location = loc;
            System.out.println(name + " переместился в локацию " + loc.locName());
        }
    }

}
