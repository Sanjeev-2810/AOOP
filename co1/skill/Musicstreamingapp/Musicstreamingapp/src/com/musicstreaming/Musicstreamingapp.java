package com.musicstreaming;

import com.music.decorator.Equalizerdecorator;
import com.music.decorator.Volumedecorator;
import com.music.player.Musicplayer;
import com.music.source.Localfileplayer;
import com.music.source.Onlinestreamplayer;
import com.music.source.Radiostationplayer;

public class Musicstreamingapp {
	public static void main(String[] args) {
      
        Musicplayer localFilePlayer = new Localfileplayer();
        Musicplayer onlineStreamPlayer = new Onlinestreamplayer();
        Musicplayer radioStationPlayer = new Radiostationplayer();
        
        Musicplayer decoratedLocalFilePlayer = new Equalizerdecorator(new Volumedecorator(localFilePlayer));
        Musicplayer decoratedOnlineStreamPlayer = new Equalizerdecorator(new Volumedecorator(onlineStreamPlayer));
        Musicplayer decoratedRadioStationPlayer = new Equalizerdecorator(new Volumedecorator(radioStationPlayer));

        System.out.println("Playing local file:");
        decoratedLocalFilePlayer.play();

        System.out.println("\nPlaying online stream:");
        decoratedOnlineStreamPlayer.play();

        System.out.println("\nPlaying radio station:");
        decoratedRadioStationPlayer.play();
    }


}
