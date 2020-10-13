package model.Board;
import model.Model;
import model.Figurs.PlayerBoard;
import model.Players.Player;
import model.Players.PlayerMethods;

public class BoardMethods extends PlayerBoard {
    public Model[][] boardSet(Player[] players){
        Model model[][]=new Model[8][8];
        for (int i=0;i<1;i++){
            Model model1[]=players[0].getModel();
            for (int j=0;j<8;j++){
                model[i][j]=model1[j];
            }
        }
        for (int i=1;i<2;i++){
            int a=8;
            Model model1[]=players[0].getModel();
            for (int j=0;j<8;j++){
                model[i][j]=model1[a];
                a++;
            }
        }
        for (int i=2;i<3;i++){
            int a=1;
            Model model1[]=players[a].getModel();
            for (int j=0;j<8;j++){
                model[i][j]=model1[j];
            }
        }
        for (int i=3;i<4;i++){
            int a=2;
            Model model1[]=players[a].getModel();
            for (int j=0;j<8;j++){
                model[i][j]=model1[j];
            }
        }
        for (int i=4;i<5;i++){
            int a=3;
            Model model1[]=players[a].getModel();
            for (int j=0;j<8;j++){
                model[i][j]=model1[j];
            }
        }
        for (int i=5;i<6;i++){
            int a=4;
            Model model1[]=players[a].getModel();
            for (int j=0;j<8;j++){
                model[i][j]=model1[j];
            }
            a++;
        }
        for (int i=7;i<8;i++){
            Model model1[]=players[5].getModel();
            for (int j=0;j<8;j++){
                model[i][j]=model1[j];
            }
        }
        for (int i=6;i<7;i++){
            int a=8;
            Model model1[]=players[5].getModel();
            for (int j=0;j<8;j++){
                model[i][j]=model1[a];
                a++;
            }
        }

        return model;
    }
}
