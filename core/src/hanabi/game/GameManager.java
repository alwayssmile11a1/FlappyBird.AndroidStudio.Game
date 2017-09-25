package hanabi.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

//this class is the start of everything
public class GameManager extends Game {

	//----FINAL VARIABLES-----//
	public final int WIDTH = 400;
	public final int HEIGHT = 800;

	//batch is used for draw everything into a screen
	//we just need one of this because we only have to draw on it over and over again
	SpriteBatch batch;



	@Override
	public void create() {
		batch = new SpriteBatch();
		Gdx.gl.glClearColor(1, 0, 0, 1);



	}

	@Override
	public void render () {

		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();

		batch.end();
	}

	@Override
	public void dispose () {
		batch.dispose();
	}

}
