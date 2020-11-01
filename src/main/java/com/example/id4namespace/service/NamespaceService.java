package com.example.id4namespace.service;

import com.example.id4namespace.domain.Namespace;
import com.example.id4namespace.service.dto.NamespaceCreateDTO;

public interface NamespaceService {
    Namespace createNamespace(NamespaceCreateDTO namespaceDTO);
}
