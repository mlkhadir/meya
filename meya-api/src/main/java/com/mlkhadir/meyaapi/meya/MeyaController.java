package com.mlkhadir.meyaapi.meya;

import com.mlkhadir.meyaapi.dto.MeyaReponse;
import com.mlkhadir.meyaapi.dto.MeyaRequest;
import com.mlkhadir.meyaapi.mapper.MeyaMapper;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/meya/")
public class MeyaController {

    private final MeyaService meyaService;
    private final MeyaMapper meyaMapper;

    @GetMapping(value = "/{id}")
    public Meya getMeyaById(@PathVariable("id") UUID id) {
        return meyaService.getMeyaByID(id);
    }

    @PostMapping(value = "/create")
    public MeyaReponse createMeya(@RequestBody MeyaRequest meyaRequest) {
        Meya meya = meyaMapper.toMeya(meyaRequest);
        return meyaMapper.toMeyaResponse(meyaService.createMeya(meya));
    }
}
