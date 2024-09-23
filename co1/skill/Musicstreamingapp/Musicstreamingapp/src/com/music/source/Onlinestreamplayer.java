package com.music.source;

import com.music.player.Musicplayer;

public class Onlinestreamplayer implements Musicplayer{
	  @Override
	    public void play() {
	        System.out.println("Playing music from an online streaming service.");
	    }

}
