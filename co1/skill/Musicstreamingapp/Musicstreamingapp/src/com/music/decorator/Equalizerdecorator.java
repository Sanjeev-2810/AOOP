package com.music.decorator;

import com.music.player.Musicplayer;

public class Equalizerdecorator extends Musicplayerdecorator{
	public Equalizerdecorator(Musicplayer decoratedPlayer) {
        super(decoratedPlayer);
    }

    @Override
    public void play() {
        super.play();
        addEqualizer();
    }

    private void addEqualizer() {
        System.out.println("Applying equalizer settings.");
    }

}
