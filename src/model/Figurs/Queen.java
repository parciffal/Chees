package model.Figurs;

import model.Model;

public class Queen implements Figures {
    @Override
    public Model setter(int color) {
        Model model=new Model();
        model.setName("Q");
        model.setAlive(true);
        model.setColor(color);
        return model;
    }

    @Override
    public Boolean exeption(int i, int j) {
        return true;
    }

    @Override
    public Model ret() {
        Model model=new Model();
        model.setName("Q");
        model.setAlive(true);
        return model;
    }
}
