package com.example.id4namespace.web.api;

import com.example.id4namespace.service.NamespaceService;
import com.example.id4namespace.service.dto.NamespaceCreateDTO;
import com.example.id4namespace.web.vm.NamespaceId;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/namespace")
@RequiredArgsConstructor
public class NamespaceResource {

    private final NamespaceService service;

    @PostMapping
    public ResponseEntity<NamespaceId> createNamespace(@Valid @RequestBody NamespaceCreateDTO createDTO) {
        return ResponseEntity.ok(new NamespaceId(service.createNamespace(createDTO)));
    }
}
