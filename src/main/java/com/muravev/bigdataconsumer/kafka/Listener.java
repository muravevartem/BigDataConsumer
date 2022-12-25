package com.muravev.bigdataconsumer.kafka;

import com.muravev.bigdataconsumer.data.SensorData;
import com.muravev.bigdataconsumer.data.SensorDataRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class Listener {
    private final SensorDataRepository repository;

    @KafkaListener(topics = "transport-base-sensor")
    public void save(SensorData data) {
        repository.save(data);
        log.info("Saved #{}", data.getNumber());
    }
}
