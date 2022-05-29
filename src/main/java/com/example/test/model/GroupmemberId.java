package com.example.test.model;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class GroupmemberId implements Serializable {
    private static final long serialVersionUID = 8248430582093828893L;
    @Column(name = "elder_num", nullable = false)
    private Integer elderNum;

    @Column(name = "user_num", nullable = false)
    private Integer userNum;

    public Integer getElderNum() {
        return elderNum;
    }

    public void setElderNum(Integer elderNum) {
        this.elderNum = elderNum;
    }

    public Integer getUserNum() {
        return userNum;
    }

    public void setUserNum(Integer userNum) {
        this.userNum = userNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        GroupmemberId entity = (GroupmemberId) o;
        return Objects.equals(this.userNum, entity.userNum) &&
                Objects.equals(this.elderNum, entity.elderNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userNum, elderNum);
    }

}