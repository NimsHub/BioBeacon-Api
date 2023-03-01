package com.nimshub.biobeacon.session;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.Date;

// This class defines Session Entity and its properties

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Session {
    @Id
    @GeneratedValue
    private Integer sessionId;
    @NotNull(message = "User ID cannot be null for a session")
    private Integer userId;
    @NotNull(message = "Device ID cannot be null for a session")
    private Long deviceId;
    @Column(columnDefinition = "boolean default false")
    private boolean isComplete;
    private String heartRate;
    private String bloodPressure;
    private String respirationRate;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private Long sessionDuration;
    @CreationTimestamp
    private Date createDateTime;
}
