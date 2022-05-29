package com.example.test.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "groupmembers")
public class Groupmember {
    @EmbeddedId
    private GroupmemberId id;

    public GroupmemberId getId() {
        return id;
    }

    public void setId(GroupmemberId id) {
        this.id = id;
    }

//TODO [JPA Buddy] generate columns from DB
}