package com.music.decorator;

import com.music.player.Musicplayer;

public class Volumedecorator extends Musicplayerdecorator{
	public Volumedecorator(Musicplayer decoratedPlayer) {
        super(decoratedPlayer);
    }

    @Override
    public void play() {
        super.play();
        adjustVolume();
    }

    private void adjustVolume() {
        System.out.println("Adjusting volume.");
    }

}
