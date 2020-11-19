package com.agile.app.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(unique = true)
    private String name;

    @Transient
    @OneToMany
    private Set<Application> applicationSet = new HashSet<>();


    public void addApp(Application application) {
        applicationSet.add(application);
    }

    public void removeApp(String name) {
        applicationSet.removeIf(element -> element.getName().equals(name));
    }
}
