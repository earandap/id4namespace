package com.example.id4namespace.service;

import com.example.id4namespace.domain.Namespace;
import com.example.id4namespace.repository.NamespaceRepository;
import com.example.id4namespace.service.dto.NamespaceCreateDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NamespaceService {

    private final NamespaceRepository repository;
    private final IdGenerator generator;

    public Namespace createNamespace(NamespaceCreateDTO namespaceDTO) {
        return repository.save(Namespace.builder()
                .id(generator.generateId(namespaceDTO.getName()))
                .name(namespaceDTO.getName())
                .build());
    }

}
