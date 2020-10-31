package com.example.id4namespace.service.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class NamespaceCreateDTO {
    @NotNull
    private String name;
}
