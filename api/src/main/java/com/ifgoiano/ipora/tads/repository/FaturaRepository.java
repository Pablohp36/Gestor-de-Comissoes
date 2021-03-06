package com.ifgoiano.ipora.tads.repository;

import com.ifgoiano.ipora.tads.model.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by 2898807 on 22/11/2016.
 */
public interface FaturaRepository extends MongoRepository<Cliente,String> {

    AtomicLong VERSION = new AtomicLong();

}
