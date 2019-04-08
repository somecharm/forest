class Tree {
    boolean felled; // срублено или нет
    String species; // вид дерева
    int resistance; // сколько силы нужно персонажу, чтобы срубить это дерево
    String img; // ссылка на изображение дерева

    void showTree() {
        if (felled) {
            img = "stump.jpg"; // Если дерево срублено, показываем изображение пенька
        }
        System.out.println("Показываем изображение: " + img);
    }

}