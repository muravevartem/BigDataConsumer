package com.muravev.bigdataconsumer.data;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface SensorDataRepository extends MongoRepository<SensorData, UUID> {
}
