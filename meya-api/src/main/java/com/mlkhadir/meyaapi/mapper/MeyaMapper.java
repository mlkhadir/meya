package com.mlkhadir.meyaapi.mapper;

import com.mlkhadir.meyaapi.dto.MeyaReponse;
import com.mlkhadir.meyaapi.dto.MeyaRequest;
import com.mlkhadir.meyaapi.meya.Meya;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class MeyaMapper {

    public Meya toMeya(MeyaRequest meyaRequest) {
        return Meya.builder()
                .name(meyaRequest.name())
                .createdAt(LocalDate.now())
                .description(meyaRequest.description())
                .build();
    }

    public MeyaReponse toMeyaResponse(Meya meya) {
        return MeyaReponse.builder()
                .id(meya.getId())
                .name(meya.getName())
                .createdAt(meya.getCreatedAt())
                .build();
    }
}
