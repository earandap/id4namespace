package com.example.id4namespace.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Namespace {

    @Id
    private String id;
    private String name;
}
