package cc.maride.tfgdefense;

import javafx.scene.canvas.GraphicsContext;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Render-Klasse; zeichnet das Spielgeschehen in den übergebenen GraphicsContext mit angegebener Rate.
 */
public class Render {
    private GraphicsContext gc;
    private int tps; // ticks per second
    private Timer cycleTimer;

    /**
     * Erstellt einen neuen Render für den übergebenen GraphicsContext
     * @param gc der GraphicsContext, in den gezeichnet (gerendert) werden soll
     * @param tps die Rate von Schritten (FPS bzw. TPS) pro Sekunde, mit der gearbeitet werden soll
     */
    public Render(GraphicsContext gc, int tps) {
        this.gc = gc;
        this.tps = tps;
        cycleTimer = new Timer();
    }

    /**
     * Startet den Render-Timer (und somit -Zyklus)
     */
    public void startCycle() {
        cycleTimer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                cycle();
            }
        }, 0, tps * 1000);
    }

    /**
     * Pausiert/Stoppt den Render-Timer (und somit Zyklus)
     */
    public void stopCycle() {
        cycleTimer.cancel();
    }

    /**
     * Die Render-Funktion, die einen kompletten Render-Zyklus umsetzt und (nach Möglichkeit) pro Sekunde tps-mal
     * aufgerufen wird.
     */
    private void cycle() {
        // TODO: Render-Code hier einfügen.
    }

    public GraphicsContext getGraphicsContext() {
        return gc;
    }

    public int getTPS() {
        return tps;
    }
}
