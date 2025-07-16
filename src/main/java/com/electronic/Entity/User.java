package com.electronic.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name ="user_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Id
    private String  userId;

    @Column(name ="name")
    private String  name;


    @Column(name = "email", unique = true)
    private String email;

    @Column(name ="password" , length =20)
    private String password;

    @Column(name = "gender", length =6)
    private String gender;

    private  String about;
    @Column(name = "user_imageName")
    private String imageName;

}
