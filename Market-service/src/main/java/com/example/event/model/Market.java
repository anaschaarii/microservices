package com.example.event.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "market")
@Getter
@Setter
@NoArgsConstructor
public class Market implements Serializable {
    @Id
    private int id;
    private String name;
    private  String oddType;

}
