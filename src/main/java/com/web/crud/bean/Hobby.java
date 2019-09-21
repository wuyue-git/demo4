package com.web.crud.bean;

public class Hobby {
    private Integer hobbyId;

    private String hobbyName;

    public Integer getHobbyId() {
        return hobbyId;
    }

    public void setHobbyId(Integer hobbyId) {
        this.hobbyId = hobbyId;
    }

    public String getHobbyName() {
        return hobbyName;
    }

    public void setHobbyName(String hobbyName) {
        this.hobbyName = hobbyName == null ? null : hobbyName.trim();
    }
}