package com.agile.app.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.Set;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String name;

    @OneToMany
    @Transient
    private Set<Application> applicationSet;

}
