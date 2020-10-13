package controller;

import model.Figurs.*;
import model.Model;
import model.Players.Player;

import java.rmi.MarshalledObject;
import java.time.Year;
import java.util.Scanner;

public interface ControllerMethods {
    Scanner in=new Scanner(System.in);
    default Player[] gameDemo(Player[] players, Model[][] model1,int k){
        board(model1);
        System.out.println("Choose figur");
        Model model[]=players[k].getModel();
        for (int i=0;i<model.length;i++){
            System.out.print((i+1)+")"+ model[i].getName()+" ");
        }
        System.out.println();
        System.out.println("Choose figure");
        String fig=in.next();
        int nu=0;
        for (int i=0;i<model.length;i++){
            if (fig.equals(model[i].getName())){
                nu=i;
            }
        }
        System.out.println("enter pos i");
        int i=in.nextInt();
        System.out.println("enter pos j");
        int j=in.nextInt();
       // model[nu]=qayl(model1,fig,i,j,model);
        players=figurSet(players,i,j,nu,k);
        return players;
    }
    default void board(Model[][] models){
        for (int i=0;i<8;i++){
            for (int j=0;j<8;j++){
                System.out.print(models[i][j].getName()+" ");
            }
            System.out.println();
        }
    }
    default Model qayl(Model[][] models,String fig,int i,int j,Model[] model){
        int num=0;
        for (int i1=0;i1<models.length;i1++){
            if (fig.equals(model[i1].getName())){
                num=i1;
            }
        }
        if (greg(model[num],i,j)==true){
            model[num].setY(i);
            model[num].setX(j);
        }
        boolean exp=exep(models,model[num],i,j);
        if (exp==true) {
            return model[num];
        }else{
            System.out.println("retry");
            System.out.println("int i");
            int iNew=in.nextInt();
            System.out.println("int j");
            int jNew=in.nextInt();
            model[num]=qayl(models,fig,iNew,jNew,model);
        }
        return model[num];
    }
    default boolean greg(Model model,int i,int j){
        King king=new King();
        Bishop bishop=new Bishop();
        Horse horse=new Horse();
        Queen queen=new Queen();
        Rook rook=new Rook();
        Soldiar soldiar=new Soldiar();
        String a="";
        boolean exp=false;
        a+=model.getName().charAt(0);
        if (a.equals(king.ret().getName())){
           exp= king.exeption(i, j);
        }else{
            if (a.equals(bishop.ret().getName())){
                exp=bishop.exeption(i, j);
            }else{
                if (a.equals(horse.ret().getName())){
                    exp=horse.exeption(i, j);
                }else{
                    if (a.equals(queen.ret().getName())){
                        exp=queen.exeption(i, j);
                    }else{
                        if (a.equals(rook.ret().getName())){
                            exp=rook.exeption(i, j);
                        }else{
                            if (a.equals(soldiar.ret().getName())) {
                                exp=soldiar.exeption(i, j);
                            }
                        }
                    }
                }
            }
        }
        return exp;
    }
    default boolean exep(Model[][] model,Model qaylox,int newX,int newY){
        boolean exp=false;
        if (model[newX][newY].getName().equals("b") || model[newX][newY].getName().equals("w")){
            exp=true;
        }
        return exp;
    }
    default Player[] figurSet(Player[] players, int x, int y, int qayloxqaritex,int xaxacoxhamar){
        xaxacoxhamar=xaxacoxhamar;
        Model xaxacox[]=players[xaxacoxhamar].getModel();
        int hinx=xaxacox[qayloxqaritex].getX();
        int hiny=xaxacox[qayloxqaritex].getY();
        Model tazaTex[]=players[x-1].getModel();
        xaxacox[qayloxqaritex].setX(x);
        xaxacox[qayloxqaritex].setY(y);
        tazaTex[y].setX(hinx);
        tazaTex[y].setY(hiny);
        Model model=xaxacox[qayloxqaritex];
        xaxacox[qayloxqaritex]=tazaTex[y];
        tazaTex[y]=model;
        players[xaxacoxhamar].setModel(xaxacox);
        players[x-1].setModel(tazaTex);
        return players;
    }
}
