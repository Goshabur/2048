package task3513;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Controller extends KeyAdapter {
    private  Model model;
    private View view;
    private final static int WINNING_TILE = 2048;

    public Controller(Model model) {
        this.model = model;
        view = new View(this);
    }

    public View getView() {
        return view;
    }

    public Tile[][] getGameTiles() {
        return model.getGameTiles();
    }
    public int getScore(){
        return  model.score;
    }
    public void resetGame(){
        view.isGameLost = false;
        view.isGameWon = false;
        model.score = 0;
        model.resetGameTiles();
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if(keyCode == KeyEvent.VK_ESCAPE) resetGame();
        if(!model.canMove()) view.isGameLost = true;
        if(!(view.isGameLost||view.isGameWon)){
            switch (keyCode){
                case KeyEvent.VK_LEFT: model.left();break;
                case KeyEvent.VK_RIGHT : model.right();break;
                case KeyEvent.VK_UP: model.up();break;
                case KeyEvent.VK_DOWN: model.down();break;

            }
        }
        if (model.maxTile==WINNING_TILE) view.isGameWon = true;
        view.repaint();
    }
}