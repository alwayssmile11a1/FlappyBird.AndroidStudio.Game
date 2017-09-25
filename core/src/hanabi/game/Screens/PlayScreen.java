package hanabi.game.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

import hanabi.game.GameManager;

/**
 * Created by 2SMILE2 on 25/09/2017.
 */

//Game activity mostly here
public class PlayScreen implements Screen{

    //GameManager
    GameManager gameManager;

    //-----------------VIEW RELATED VARIABLES-----------------//
    //how well we want to see our map
    private Viewport gameViewPort;
    private int worldWidth;
    private int worldHeight;
    //a camera to view our world
    private OrthographicCamera mainCamera;


    //----------------TEXTURE RELATED VARIABLES------------//
    Texture backgroundTexture;



    public PlayScreen(GameManager gameManager, int worldWidth, int worldHeight)
    {
        //set up constructor variables
        this.gameManager = gameManager;
        this.worldWidth = worldWidth;
        this.worldHeight = worldHeight;

        //-----------------VIEW RELATED VARIABLES-----------------//
        //initialize a new camera
        mainCamera = new OrthographicCamera();
        //initialze gameViewPort
        gameViewPort = new StretchViewport(worldWidth,worldHeight,mainCamera);
        //set mainCamera position to the center of gameviewport
        mainCamera.position.set(gameViewPort.getWorldWidth()/2,gameViewPort.getWorldHeight()/2,0);



        //----------------TEXTURE RELATED VARIABLES------------//
        backgroundTexture

    }


    @Override
    public void render(float delta) {
        //clear background color
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        //mainCamera.update();

        //set camera to be used by this batch
        gameManager.batch.setProjectionMatrix(mainCamera.combined);

        //draw things to batch
        gameManager.batch.begin();



        gameManager.batch.end();

    }

    @Override
    public void resize(int width, int height) {
        //resize viewport if we resize our game world
        gameViewPort.update(width,height);
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

        if(gameManager!=null)
        {
            gameManager.dispose();
        }

        if(backgroundTexture!=null)
        {
            backgroundTexture.dispose();
        }

    }
}
