package hanabi.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import hanabi.game.Screens.PlayScreen;

//this class is the start of everything
public class GameManager extends Game {

	//----FINAL VARIABLES-----//
	public static final int WORLDWIDTH = 480;
	public static final int WORLDHEIGHT = 800;

	//batch is used for draw everything into a screen
	//we just need one of this because we only have to draw on it over and over again
	public SpriteBatch batch;



	@Override
	public void create() {
		batch = new SpriteBatch();
		Gdx.gl.glClearColor(1, 0, 0, 1);

		setScreen(new PlayScreen(this,WORLDWIDTH,WORLDHEIGHT));

	}

	@Override
	public void render () {
		super.render();
	}

	@Override
	public void dispose () {
		batch.dispose();
	}

}
