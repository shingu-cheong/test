package com.example.test.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@ToString
@Setter
@Getter
@Entity
@Table(name = "elders")
public class Elder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "elder_num", nullable = false)
    private Integer id;

    @Column(name = "elder_name", nullable = false, length = 100)
    private String elderName;

    @Column(name = "elder_ph", length = 11)
    private String elderPh;

    @Column(name = "elder_adr", length = 100)
    private String elderAdr;

    @Column(name = "elder_img")
    private String elderImg;

    @Column(name = "mng_ph", length = 11)
    private String mngPh;



    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", updatable = true)
    private LocalDateTime updatedAt;

//    @JsonIgnore
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(name = "user_elder",
            joinColumns = { @JoinColumn(name = "elder_num")},
            inverseJoinColumns = {@JoinColumn(name = "user_num")})
    private Set<User> users = new HashSet<>();


    public Elder() {
        super();
    }
}