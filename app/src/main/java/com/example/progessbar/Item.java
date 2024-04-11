package com.example.progessbar;

public class Item {
    int status;
    String filename;
    int type;
    String capacity;
    String speed;
    String time;
    public Item() {
    }

    public Item(int status, String filename, int type, String capacity, String speed, String time) {
        this.status = status;
        this.filename = filename;
        this.type = type;
        this.capacity = capacity;
        this.speed = speed;
        this.time = time;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
