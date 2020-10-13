package model.Figurs;

import model.Model;

public class Horse implements Figures{
    @Override
    public Model setter(int color) {
        Model model=new Model();
        model.setName("H");
        model.setAlive(true);
        model.setColor(color);
        return model;
    }

    @Override
    public Boolean exeption(int i, int j) {
        boolean exp=false;
        if (i==3 && j==1 || i==1 && j==3 || i==-3 && ){
            exp=true;
        }
        return exp;
    }

    @Override
    public Model ret() {
        Model model=new Model();
        model.setName("H");
        model.setAlive(true);
        return model;
    }

}
