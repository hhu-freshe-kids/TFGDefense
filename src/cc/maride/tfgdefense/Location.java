package cc.maride.tfgdefense;

/**
 * Repräsentation einer Position im Spiel.
 */
public class Location {
    private float x;
    private float y;

    /**
     * @param x die X-Koordinate der Position
     * @param y die Y-Koordinate der Position
     */
    public Location(float x, float y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @return X-Koordinate
     */
    public float getX() {
        return x;
    }

    /**
     * @return Y-Koordinate
     */
    public float getY() {
        return y;
    }

    /**
     * @param reference Referenzpunkt
     * @return Abstand zwischen dieser Position und der Referenzposition
     */
    public float distanceToLocation(Location reference) {
        float deltaX = Math.abs(this.x - reference.x);
        float deltaY = Math.abs(this.y - reference.y);
        return (float)Math.sqrt(deltaX*deltaX + deltaY*deltaY);
    }
}
