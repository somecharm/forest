class Location {
    private int id; // уникальный идентификатор локации
    private String locName; // название локации
    private int[] ways; // массив идентификаторов локаций, на которые можно перейти из данной локации
    private String background; // ссылка на изображение фона, который нужно загрузить для этой локации

    Location(int i, String n, int[] w, String bg) {
        id = i;
        locName = n;
        ways = w;
        background = bg;
    }

    int id() {
        return id;
    }

    String locName() {
        return locName;
    }

    int[] ways() {
        return ways;
    }

    String background() {
        return background;
    }

    boolean checkWays(Location loc) {
        // Проверяем, можно ли персонажу переместиться на указанную игроком локацию
        for (int i = 0; i < ways.length; i++) {
            if (ways[i] == loc.id) {
                return true;
            }
        }
        System.out.println("Персонаж не может переместиться в локацию " + loc.locName);
        return false;
    }

}
