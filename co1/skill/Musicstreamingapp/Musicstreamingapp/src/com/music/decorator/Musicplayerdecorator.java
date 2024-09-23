package com.music.decorator;

import com.music.player.Musicplayer;

public abstract class Musicplayerdecorator implements Musicplayer{
	 protected Musicplayer decoratedPlayer;

	    public Musicplayerdecorator(Musicplayer decoratedPlayer) {
	        this.decoratedPlayer = decoratedPlayer;
	    }

	    @Override
	    public void play() {
	        decoratedPlayer.play();
	    }

}
