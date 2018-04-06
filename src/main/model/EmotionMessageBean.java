package main.model;

import java.util.Observable;

/**
 * Bean which stores the emotion message to be sent to client.
 * @author Balachandar Sampath
 * @version 1.0
 */
public class EmotionMessageBean extends Observable{

    private ExpressiveBean expressive;
    private String sender;
    private AffectiveBean affective;
    private double clockTick;

    public EmotionMessageBean()
    {
        expressive = new ExpressiveBean();
        affective = new AffectiveBean();
    }

    public ExpressiveBean getExpressive() {
        return expressive;
    }

    /**
     *
     * @param expressive
     */
    public void setExpressive(ExpressiveBean expressive) {
        this.expressive = expressive;
    }

    public AffectiveBean getAffective() {
        return affective;
    }

    /**
     *
     * @param affective
     */
    public void setAffective(AffectiveBean affective) {
        this.affective = affective;
    }

    public String getSender() {
        return sender;
    }

    /**
     *
     * @param sender
     */
    public void setSender(String sender) {
        this.sender = sender;
    }

    /**
     *
     * @param clockTick
     */
    public void setClockTick(float clockTick) { this.clockTick = clockTick; }

    public double getClockTick() { return this.clockTick; }

    @Override
    public String toString() {
        return "EmotionMessageBean{" +
                "expressive=" + expressive +
                ", sender='" + sender + '\'' +
                ", affective=" + affective +
                ", clock=" + clockTick +
                '}';
    }
}
