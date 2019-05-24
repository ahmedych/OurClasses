package com.epam.first;

public class CivicH extends Honda {
    private String body;
    private int volume;
    private String color;

    public CivicH(String body, int volume, String color) {
        this.body = body;
        this.volume = volume;
        this.color = color;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "CivicH{" +
                "body='" + body + '\'' +
                ", volume=" + volume +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void move() {
        System.out.println("JJJJJJJJ I'm Civic");

    }
}
