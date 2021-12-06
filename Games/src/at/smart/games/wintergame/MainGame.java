package at.smart.games.wintergame;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class MainGame extends BasicGame {

    private List<Actor> actors;

    public MainGame(String title) {
        super(title);
        this.actors = new ArrayList<>();
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
        MoveStrategy ms1 = new MoveRight(0,0,0.3f);
        MoveStrategy ms2 = new MoveRight(0,100,0.1f);

        this.actors.add(new CircleActor(ms1));

        this.actors.add(new CircleActor(ms2));

        this.actors.add(new RectActor(800,200));
        this.actors.add(new RectActor(850,250));

        this.actors.add(new OvalActor(300,300));
        this.actors.add(new OvalActor(350,350));

    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
        for (Actor actor: this.actors) {
            actor.update(gc,delta);
        }
    }

    @Override
    public void render(GameContainer gc, Graphics graphics) throws SlickException {

        for (Actor actor : this.actors) {
            actor.render(graphics);
        }
    }


    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new MainGame("Wintergame"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

}
