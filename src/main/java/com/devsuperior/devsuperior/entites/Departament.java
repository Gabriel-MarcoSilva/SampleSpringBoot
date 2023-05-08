package com.devsuperior.devsuperior.entites;

import jakarta.persistence.*;

@Entity //mapeada pela tabela de dados
@Table(name = "TB_DEPARTAMENT")
public class Departament {
    

    @Id //autoincrementa um id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Departament(){
        
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
