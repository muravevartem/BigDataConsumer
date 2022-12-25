package com.muravev.bigdataconsumer.data;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;
import java.time.LocalDateTime;
import java.util.UUID;

@Document
@Getter
@Setter
public class SensorData {
    @Id
    private UUID id;
    private String number;
    private String route;
    private double voltage;
    private double pw;
    private double tempIn;
    private double hydraulic;
    private double temp;
    private double speed;
    private LocalDateTime time;
}
