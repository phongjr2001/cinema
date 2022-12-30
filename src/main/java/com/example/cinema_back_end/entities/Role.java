package com.example.cinema_back_end.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "roles")
public class Role {
    @Id
    //khai báo là primarykey với not null
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //dòng cho id tự tăng
    private Integer id;
    private String name;
}
