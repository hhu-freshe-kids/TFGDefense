package cc.maride.tfgdefense;

/**
 * Repräsentation eines Tiles.
 */
public abstract class Tile {
    private Location location;

    public Tile(Location loc) {
        this.location = loc;
    }

    public Location getLocation() {
        return location;
    }
}
