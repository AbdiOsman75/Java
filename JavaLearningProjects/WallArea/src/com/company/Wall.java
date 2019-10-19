package com.company;

public class Wall {
    public Wall() {
        this.width= width;
        this.height = height;
    }

    public Wall(double width, double height){
        if (height < 0 ){
            this.height = 0;
        }else{
            this.height=height;
        }

        if (width < 0){
            this.width = 0;
        }else{
            this.width=width;
        }


    }

    private double width;
    private double height;

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        if (width<0){
            this.width=0;
        }else {
            this.width = width;
        }
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        if (height<0){
            this.height= 0;
        }else {
            this.height = height;
        }
    }

    public double getArea(){
        double area = this.width*this.height;
        return area;
    }
}
