package com.example.multiapps.sports;

public class Sport {
    private int sportImage;
    private String sportName;

    public Sport(int sportImage, String sportName) {
        this.sportImage = sportImage;
        this.sportName = sportName;
    }

    public int getSportImage() {
        return sportImage;
    }

    public void setSportImage(int sportImage) {
        this.sportImage = sportImage;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }
}
