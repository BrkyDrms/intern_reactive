package com.etiya.intern.entity.datatransfer;

public class UserDataTransfer {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserDataTransfer(String name) {
        this.name = name;
    }

    public UserDataTransfer() {
    }
}
