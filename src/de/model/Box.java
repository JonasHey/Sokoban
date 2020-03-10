package de.model;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Box extends Actor {
    private boolean isHighlighted;
    private Image highlighted;
    private Image notHighlighted;

    public Box (int x, int y){
        super(x,y);
    }

    public void move(int x, int y){

    }

    private void init(){

    }

    public boolean isHighlighted() { return isHighlighted; }
    public void setHighlighted(boolean highlighted) { isHighlighted = highlighted; }
}