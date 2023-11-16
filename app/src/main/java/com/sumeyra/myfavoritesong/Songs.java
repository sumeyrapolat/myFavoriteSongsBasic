package com.sumeyra.myfavoritesong;

import java.io.Serializable;

public class Songs implements Serializable {

    String bandName;
    String song;
    int image;

    public Songs(String bandName, String song, int image) {
        this.bandName = bandName;
        this.song = song;
        this.image = image;
    }
}


