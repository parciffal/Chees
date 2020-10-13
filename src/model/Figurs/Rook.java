package model.Figurs;

import model.Model;

public class Rook implements Figures {
    @Override
    public Model setter(int color) {
        Model model=new Model();
        model.setName("R");
        model.setAlive(true);
        model.setColor(color);
        return model;
    }

    @Override
    public Boolean exeption(int i, int j) {
        Boolean exp=false;
        if (i==j){
            exp=true;
        }
        return exp;
    }

    @Override
    public Model ret() {
        Model model=new Model();
        model.setName("R");
        model.setAlive(true);
        return model;
    }
}
