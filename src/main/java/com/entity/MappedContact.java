package com.entity;

import com.google.common.base.MoreObjects;
import com.model.ContactRole;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Contacts")
public class MappedContact {
    @Id
    @GeneratedValue
    @Column(name = "CONTACT_ID")
    private int id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "SECOND_NAME")
    private String secondName;

    @Column(name = "CONTACT_LOGIN")
    private String login;

    @Column(name = "CONTACT_PASSWORD")
    private String password;

    @Column(name = "CONTACT_ROLE")
    private ContactRole role;

    @Column(name = "CONTACT_STATE")
    private boolean state;

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public int getId() {
        return id;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MappedContact)) return false;

        MappedContact that = (MappedContact) o;

        if (getId() != that.getId()) return false;
        if (!getFirstName().equals(that.getFirstName())) return false;
        if (!getSecondName().equals(that.getSecondName())) return false;
        if (!getLogin().equals(that.getLogin())) return false;
        if (!getPassword().equals(that.getPassword())) return false;
        return getRole() == that.getRole();
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .addValue(this.id)
                .addValue(this.firstName)
                .addValue(this.secondName)
                .addValue(this.login)
                .addValue(this.password)
                .addValue(this.role)
                .toString();
    }
}
