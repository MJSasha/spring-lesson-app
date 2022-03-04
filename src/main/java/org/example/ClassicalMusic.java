package org.example;

public class ClassicalMusic implements Music {
    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    public void doMyInit(){
        System.out.println("Im inited");
    }

    public void doMyDestroy(){
        System.out.println("Im destroying");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
