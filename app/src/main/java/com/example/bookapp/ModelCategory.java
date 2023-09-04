package com.example.bookapp;

public class ModelCategory {
    String id, category, Uid;
    long timestamp;

    public ModelCategory() {

    }

    public ModelCategory(String id, String category, String uid, long timestamp) {
        this.id = id;
        this.category = category;
        Uid = uid;
        this.timestamp = timestamp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUid() {
        return Uid;
    }

    public void setUid(String uid) {
        Uid = uid;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
