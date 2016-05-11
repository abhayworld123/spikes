package com.novoda.firechat.chat.data.model;

import com.novoda.firechat.login.data.model.User;

public class Message {

    private User author;
    private String body;
    private long timestamp;

    @SuppressWarnings("unused") //Used by Firebase
    public Message() {
    }

    public Message(User author, String body) {
        this.author = author;
        this.body = body;
        this.timestamp = System.currentTimeMillis(); //TODO move timestamp db side ?
    }

    @Override
    public String toString() {
        return author + ": " + body;
    }

    public User getAuthor() {
        return author;
    }

    public String getBody() {
        return body;
    }

    public long getTimestamp() {
        return timestamp;
    }

}