package com.DesignPatternExample.StructuralDP.Adapter.Media;

import com.DesignPatternExample.StructuralDP.Adapter.Players.AdvanceMediaPlayer;
import com.DesignPatternExample.StructuralDP.Adapter.Players.Mp4Player;
import com.DesignPatternExample.StructuralDP.Adapter.Players.VlcPlayer;

public class MediaAdapter implements MediaPlayer{
    AdvanceMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){

        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMusicPlayer = new VlcPlayer();

        }else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {

        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);
        }
        else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
