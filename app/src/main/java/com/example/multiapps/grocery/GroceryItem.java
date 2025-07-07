package com.example.multiapps.grocery;

public class GroceryItem {
    private int image;
    private String desc;
    private String name;

    public GroceryItem(int image, String desc, String name) {
        this.image = image;
        this.desc = desc;
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
