package model.Players;

import model.Model;

public class Player extends Model {
    private String playerName;
    private int color;
    private Model model[];
    private int score;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }


    public Model[] getModel() {
        return model;
    }

    public void setModel(Model[] model) {
        this.model = model;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
