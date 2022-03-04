package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer firstPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        firstPlayer.setVolume(10);

        System.out.println(firstPlayer == secondPlayer);
        System.out.println(firstPlayer);
        System.out.println(secondPlayer);
        context.close();
    }
}
