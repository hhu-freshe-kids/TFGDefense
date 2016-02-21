package cc.maride.tfgdefense;

/**
 * Interface für alle Klassen im Spiel, die im Render-Zyklus (Tick-Zyklus) eine eigene Aktion ausführen
 * Beispiel: Bewegung von Spielfiguren, Animation von Feldern, etc.
 */
public interface Tickable {
    /**
     * Wird in jedem Tick aufgerufen
     * @param tick die Zahl der Ticks seit Spielstart
     */
    void action(int tick);
}
