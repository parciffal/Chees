package model.Figurs;

import model.Model;

public class Bishop implements Figures{
    @Override
    public Model setter(int color) {
        Model model=new Model();
        model.setName("B");
        model.setAlive(true);
        model.setColor(color);
        return model;
    }

    @Override
    public Boolean exeption(int i, int j) {
        boolean exp=false;
        if (i<9 && j==0 || j<9 && i==0){
            exp=true;
        }
        return exp;
    }

    @Override
    public Model ret() {
        Model model=new Model();
        model.setName("B");
        return model;
    }
}
