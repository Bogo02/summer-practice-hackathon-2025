package com.example.HGHack.Post;

public class Post {
    private long ID;
    private String title;
    private String content;
    public Post(String title, long ID, String content) {
        this.ID = ID;
        this.title = title;
        this.content = content;
    }
    public long getID() {return ID;}
    public String getTitle() {return title;}
    public String getContent() {return content;}

    public void setID(long ID) {
        this.ID = ID;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setContent(String content) {
        this.content = content;
    }
}
