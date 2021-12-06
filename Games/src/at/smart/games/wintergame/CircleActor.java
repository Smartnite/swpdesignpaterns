package at.smart.games.wintergame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class CircleActor implements Actor {
    private MoveStrategy moveStrategy;

    public void update(GameContainer gc, int delta) {

     moveStrategy.update(delta);
    }

    public CircleActor(MoveStrategy ms) {
        this.moveStrategy = ms;
    }

    public void render(Graphics graphics){

        graphics.drawOval((float)this.moveStrategy.getX(), (float)this.moveStrategy.getY(), 20,20);
    }

}


