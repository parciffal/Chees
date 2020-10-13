package model.Figurs;

import model.Model;

public class PlayerBoard {
    King king=new King();
    Bishop bishop=new Bishop();
    Horse horse=new Horse();
    Queen queen=new Queen();
    Rook rook=new Rook();
    Soldiar soldiar=new Soldiar();
    public Model[] board(int color){
        Model kin=king.setter(color);
        kin.setName("K ");
        Model quen=queen.setter(color);
        quen.setName("Q ");
        Model hors=horse.setter(color);
        hors.setName("H ");
        Model nav=bishop.setter(color);
        nav.setName("B ");
        Model pix=rook.setter(color);
        pix.setName("R ");
        Model hors1=horse.setter(color);
        hors1.setName("H1");
        Model nav1=bishop.setter(color);
        nav1.setName("B1");
        Model pix1=rook.setter(color);
        pix1.setName("R1");
        Model sold1=soldiar.setter(color);
        sold1.setName("S1");
        Model sold2=soldiar.setter(color);
        sold2.setName("S2");
        Model sold3=soldiar.setter(color);
        sold3.setName("S3");
        Model sold4=soldiar.setter(color);
        sold4.setName("S4");
        Model sold5=soldiar.setter(color);
        sold5.setName("S5");
        Model sold6=soldiar.setter(color);
        sold6.setName("S6");
        Model sold7=soldiar.setter(color);
        sold7.setName("S7");
        Model sold8=soldiar.setter(color);
        sold8.setName("S8");
        Model model[]= {nav, pix, hors, quen, kin, hors1, pix1,nav1,sold1, sold2, sold3, sold4, sold5, sold6, sold7, sold8};
        if (color==1){
            for (int i=0;i<2;i++){
                for (int j=0;j<model.length/2;j++){
                    model[j].setX(i);
                    model[j].setY(j);
                }
            }


        }else{
            if (color==2) {
                model = new Model[]{nav, pix, hors, kin, quen, hors1, pix1, nav1, sold1, sold2, sold3, sold4, sold5, sold6, sold7, sold8};
                int a = 0;
                for (int i = 7; i > 5; i--) {
                    for (int j = 0; j > model.length / 2; j--) {
                        model[a].setX(i);
                        model[a].setY(j);
                        a++;
                    }
                }
            }
        }
        return model;
    }
    public Model[] nullPlay(){
        Model model[]=new Model[8];

        for (int i=0;i<model.length;i++){
            Model model1=new Model();
            model1.setName("[]");
            model[i]=model1;
        }
        return model;
    }
}
