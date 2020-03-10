package de.model;

import java.awt.Image;

public class Actor {

    private int Size;
    private int x;
    private int y;
    private Image image;

    public Actor (int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public void setX(int x) { this.x = x; }

    public int getY() { return y; }
    public void setY(int y) { this.y = y; }

    public Image getImage() { return image; }
    public void setImage(Image image) { this.image = image; }
}