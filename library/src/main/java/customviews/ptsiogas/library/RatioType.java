package customviews.ptsiogas.library;

/**
 * Created by Paris on 8/11/2017.
 */

public enum RatioType {
    BY_WIDTH(0),
    BY_HEIGHT(1);

    final int type;

    RatioType(int type) {
        this.type = type;
    }

    public static RatioType valueOf(int type) {
        if (type == BY_WIDTH.type) {
            return BY_WIDTH;
        } else {
            return BY_HEIGHT;
        }
    }
}
