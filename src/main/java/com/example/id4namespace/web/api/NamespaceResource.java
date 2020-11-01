package com.example.id4namespace.web.api;

import com.example.id4namespace.service.NamespaceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/namespace")
@RequiredArgsConstructor
public class NamespaceResource {

    private final NamespaceService service;

    @GetMapping("/{namespace}/id")
    public ResponseEntity<String> createNamespace(@PathVariable String namespace) {
        return ResponseEntity.ok(service.generateId(namespace));
    }
}
