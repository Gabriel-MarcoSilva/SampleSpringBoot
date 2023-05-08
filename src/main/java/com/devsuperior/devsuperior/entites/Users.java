package com.devsuperior.devsuperior.entites;

import jakarta.persistence.*;

@Entity
@Table(name="TD_USERS")
public class Users {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    @ManyToOne //muitos usuários para um departamaneto
    @JoinColumn(name = "departament_id")
    private Departament departament;

    public Users(){
       
    }

    public Departament getDepartament() {
        return departament;
    }
    public void setDepartament(Departament departament) {
        this.departament = departament;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    
}
