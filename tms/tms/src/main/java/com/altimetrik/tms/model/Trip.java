package com.altimetrik.tms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
@Data
@NoArgsConstructor
@Entity
public class Trip {
    @Id
    @GeneratedValue
    private int tripId;
    @NotEmpty(message = "Enter the source")
    private String source;
    @NotEmpty(message = "Enter the destination")
    private String destination;
    @Min(100)
    private int cost;
    @NotEmpty(message = "Enter the destination")
    private String message;

}
