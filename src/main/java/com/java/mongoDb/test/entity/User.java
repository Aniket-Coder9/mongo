package com.java.mongoDb.test.entity;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Getter
@Setter
@Document(collation = "user")
public class User {

    @Id
    private ObjectId id;

    private String name;
    private String password;
    private String email;
}
