package co.pixelbeard.multielementrecyclerview;

/**
 * Created by Michael Stoddart
 * 08/04/2018.
 */

public class Content {

    //For our purposes this will be a basic object class that only contains the view type we want

    private int type;

    public Content(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
