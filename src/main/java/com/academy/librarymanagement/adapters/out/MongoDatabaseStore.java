package com.academy.librarymanagement.adapters.out;

import com.academy.librarymanagement.ports.out.MongoDatabaseStoreOutbound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class MongoDatabaseStore implements MongoDatabaseStoreOutbound {

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public List<Book> findAll() {

        Query query = new Query();

        return mongoTemplate.find(query, Book.class);
    }
}
