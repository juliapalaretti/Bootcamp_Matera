package org.example.lombok;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pessoa {
    private Long id;
    private String name;
    private Integer idade;

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Integer getIdade() {
//        return idade;
//    }
//
//    public void setIdade(Integer idade) {
//        this.idade = idade;
//    }
}
