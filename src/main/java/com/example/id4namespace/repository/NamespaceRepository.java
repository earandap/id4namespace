package com.example.id4namespace.repository;

import com.example.id4namespace.domain.Namespace;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NamespaceRepository extends MongoRepository<Namespace, String> {

}
