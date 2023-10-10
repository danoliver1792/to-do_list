package br.com.todo.todolist.user;

import lombok.Data;

// criando os getters e setters para todos os atributos
@Data
public class UserModel {

    private String username;
    private String name;
    private String password;
}
