package model;

public interface User {

    String getEmail();
    String getPassword();
    boolean isValid();
}