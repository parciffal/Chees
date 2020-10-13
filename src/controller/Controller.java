package controller;

import model.Board.BoardMethods;
import model.Model;
import model.Players.Player;
import model.Players.PlayerMethods;

public class Controller implements ControllerMethods {
    public void game(){
        PlayerMethods sd=new PlayerMethods();
        BoardMethods boardMethods=new BoardMethods();
        Player player0=sd.player(1,"Ashot");
        Player player7=sd.player(2,"Edgar");
        Player playernull2=sd.nullPlayer();
        Player playernull3=sd.nullPlayer();
        Player playernull4=sd.nullPlayer();
        Player playernull5=sd.nullPlayer();
        Player players[]={player0,playernull2,playernull3,playernull4,playernull5,player7};
        Model[][] board=boardMethods.boardSet(players);
       players= gameDemo(players,board,0);
       board=boardMethods.boardSet(players);
       board(board);
    }
}
