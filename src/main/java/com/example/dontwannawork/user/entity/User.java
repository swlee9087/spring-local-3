package com.example.dontwannawork.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private String userId;
    private String name;
    private String email;
    private String password;

    @Override
    public String toString(){
        return "UserDetails{"+
                "ID='"+userId+'\''+
                "Name='"+name+'\''+
                "Email='"+email+'\''+
                "Pw='"+password+'\''+'}';

    }

}
