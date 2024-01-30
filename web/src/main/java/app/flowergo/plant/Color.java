package app.flowergo.plant;

public enum Color {
    RED(1),
    ORANGE(2),
    YELLOW(3),
    GREEN(4),
    BLUE(5),
    INDIGO(6),
    VIOLET(7),
    PINK(8),
    PURPLE(9),
    BROWN(10),
    BLACK(11),
    WHITE(12),
    GRAY(13);

    private final int code;

    private Color(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
