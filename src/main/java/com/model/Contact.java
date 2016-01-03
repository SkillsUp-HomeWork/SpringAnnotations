package com.model;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

public class Contact {
    private String firstName;
    private String secondName;
    private String login;
    private String password;
    private ContactRole role;
    private boolean state;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ContactRole getRole() {
        return role;
    }

    public void setRole(ContactRole role) {
        this.role = role;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;

        Contact contact = (Contact) o;

        if (!getFirstName().equals(contact.getFirstName())) return false;
        if (!getSecondName().equals(contact.getSecondName())) return false;
        if (!getLogin().equals(contact.getLogin())) return false;
        if (!getPassword().equals(contact.getPassword())) return false;
        return getRole() == contact.getRole();

    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.firstName, this.secondName, this.login);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .addValue(this.firstName)
                .addValue(this.secondName)
                .addValue(this.login)
                .addValue(this.password)
                .addValue(this.role)
                .toString();
    }
}
