package com.mlkhadir.meyaapi.dto;

import lombok.Builder;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Builder
public record MeyaReponse(UUID id, String name, LocalDate createdAt) implements Serializable {
}
