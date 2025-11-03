package br.com.myappquarkus.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "\"User\"")
public class User extends PanacheEntity {

    public String name;
    public String email;
}
