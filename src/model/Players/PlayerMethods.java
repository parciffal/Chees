package model.Players;

import model.Figurs.King;
import model.Figurs.PlayerBoard;
import model.Model;

public class PlayerMethods  {
     public Player player(int color, String player){
      Player player1=new Player();
      PlayerBoard playerBoard=new PlayerBoard();
      Model model[]=playerBoard.board(color);
      player1.setPlayerName(player);
      player1.setColor(color);
      player1.setModel(model);
      return player1;
    }
    public Player nullPlayer(){
         PlayerBoard playerBoard=new PlayerBoard();
         Player player=new Player();
         Model model[]=playerBoard.nullPlay();
         player.setModel(model);
         return player;
    }
}
