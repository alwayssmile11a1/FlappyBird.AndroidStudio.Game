package hanabi.game.Screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.viewport.Viewport;

import hanabi.game.GameManager;

/**
 * Created by 2SMILE2 on 25/09/2017.
 */

//Game activity mostly here
public class PlayScreen implements Screen{

    //GameManager
    GameManager game;

    //-----------------VIEW RELATED VARIABLES-----------------//
    //how well we want to see our map
    private Viewport gamePort;
    private int viewPortWidth;
    private int viewPortHeight;
    //a camera to adjust viewport and something else
    private OrthographicCamera playScreenCamera;


    //----------------CHARACTER RELATED VARIABLES------------//


    public PlayScreen(GameManager game, int viewPortWidth, int viewPortHeight)
    {

        this.viewPortWidth = viewPortWidth;
        this.viewPortHeight = viewPortHeight;
    }


    @Override
    public void render(float delta) {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void show() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
