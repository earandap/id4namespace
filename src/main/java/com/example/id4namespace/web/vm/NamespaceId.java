package com.example.id4namespace.web.vm;

import com.example.id4namespace.domain.Namespace;
import lombok.Data;

@Data
public class NamespaceId {
    private String id;

    public NamespaceId(Namespace namespace) {
        this.id = new StringBuilder(namespace.getName())
                .append("-")
                .append(namespace.getId())
                .toString();
    }
}
