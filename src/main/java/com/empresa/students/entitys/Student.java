package com.empresa.students.entitys;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="students")
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="name", nullable=false, length=75)
    private String name;
    @Column(name="lastname", nullable=false, length=75)
    private String lastname;
    @Column(name="email", nullable=false, length=75, unique=true)
    private String email;

    @OneToOne
    private Carrera carrera;

    public Student(long id, String name, String lastname, String email, Carrera carrera) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.carrera = carrera;
    }

    public Student() {
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
