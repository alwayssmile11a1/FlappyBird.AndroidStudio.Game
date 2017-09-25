package hanabi.game.Objects;

import com.badlogic.gdx.graphics.g2d.Sprite;

import hanabi.game.Screens.PlayScreen;

/**
 * Created by 2SMILE2 on 25/09/2017.
 */

//parent class of any other objects, such as player, enemy, etc.
public class Object extends Sprite {

    protected PlayScreen playScreen;


    public Object(PlayScreen playScreen, float x, float y) {
        this.playScreen = playScreen;
        //where this object will be drawn
        setPosition(x,y);
    }

    public void handleInput(float dt)
    {

    }

    public void update(float dt)
    {
        handleInput(dt);
    }

    public void dispose()
    {

    }


}
