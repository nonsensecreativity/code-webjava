package com.webjava.jdbc.dvd.domain;

public class Actor {
    private int actorId;
    private String firstName;
    private String lastName;

    public Actor(int actorId, String firstName, String lastName) {
	super();
	this.actorId = actorId;
	this.firstName = firstName;
	this.lastName = lastName;
    }

    public Actor(String firstName, String lastName) {
	this.firstName = firstName;
	this.lastName = lastName;
    }

    public int getActorId() {
        return actorId;
    }

    public void setActorId(int actorId) {
        this.actorId = actorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
}