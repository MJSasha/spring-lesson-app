package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("rockMusic", Music.class);
        MusicPlayer firstPlayer = new MusicPlayer(music);
        firstPlayer.playMusic();

        music = context.getBean("classicalMusic", Music.class);
        MusicPlayer secondPlayer = new MusicPlayer(music);
        secondPlayer.playMusic();

        context.close();
    }
}
