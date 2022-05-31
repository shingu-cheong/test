package com.example.test.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


//@Getter
//@Setter
@ToString
@Entity
@Table(name = "user_elder")
public class UserElder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_num")
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "elder_num")
    private Elder elder;



}