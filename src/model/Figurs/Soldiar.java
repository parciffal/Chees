package model.Figurs;

import model.Model;

public class Soldiar implements Figures{
    @Override
    public Model setter(int color) {
        Model model=new Model();
        model.setName("S");
        model.setAlive(true);
        model.setColor(color);
        return model;
    }

    @Override
    public Boolean exeption(int i,int j) {
        boolean exp=false;
        if (i==1 && j==0){
            exp=true;
        }
        return exp;
    }

    @Override
    public Model ret() {
        Model model=new Model();
        model.setName("S");
        model.setAlive(true);
        return model;
    }
}
