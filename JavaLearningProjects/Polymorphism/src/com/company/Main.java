package com.company;

class Movie{
    private String name;

    public Movie(String name){
        this.name= name;
    }

    public String getName() {
        return name;
    }

    public String plot(){
        return "No plot here";
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    @Override
    public String plot(){
        return "Shark eats people";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay(){
        super("Independence Day");
    }

    @Override
    public String plot(){
        return "Aliens attack Earth";
    }
}

class MazeRunner extends Movie{

    public MazeRunner(){
        super("Maze Runner");
    }

    @Override
    public String plot(){
        return "Kids try and escape maze";
    }
}

class Forgetable extends Movie{
    public Forgetable(){
        super("Forgetable");
    }
}

public class Main {

    public static void main(String[] args) {
        for (int i= 1; i<11;i++){
            Movie movie = randomMovie();
            System.out.println("Movie #"+i+": "+movie.getName()+"\n"+"Plot: "+movie.plot()+"\n");
        }
    }

    public static Movie randomMovie(){
        int randomNumber = (int)(Math.random()*4)+1;
        System.out.println("Random number was:"+randomNumber);
        switch(randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new Forgetable();
            default:
                return null;
        }
    }
}
