import java.util.Objects;

/**
 * Created by Bro on 17.09.15.
 */
public class Item implements Comparable<Item> {

    private String description;
    private int partnumber;

    public Item(String description, int partnumber) {
        this.description = description;
        this.partnumber = partnumber;
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        return "[description = " + description + ", partnumber = " + partnumber + " ]";
    }

    public boolean equals(Object otherobject) {
        if (this == otherobject) return true;
        if (otherobject == null) return false;
        if (getClass() != otherobject.getClass()) return false;
        Item other = (Item) otherobject;
        return Objects.equals(description, other.description) && (partnumber == other.partnumber);
    }

    public int hashode() {
        return Objects.hash(description, partnumber);
    }

    public int compareTo(Item other) {

        return Integer.compare(partnumber, other.partnumber);
    }


}
