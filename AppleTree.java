class AppleTree extends Tree {

    private int apples;

    AppleTree(boolean f, int a) {
        species = "Яблоня";
        img = "appletree.jpg";
        resistance = 20;
        felled = f;
        apples = a;
    }

    void showTree() {
        if (felled) {
            img = "stump.jpg"; //Если дерево срублено, показываем изображение пенька
        }
        System.out.println("Показываем изображение: " + img);
        showApples();
    }
    private void showApples() {
        if (!felled) System.out.println("Показываем " + apples + " яблок на дереве " + species);
    }

}