package com.mlkhadir.meyaapi.meya;

import com.mlkhadir.meyaapi.models.MeyaUser;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
@AllArgsConstructor
public class MeyaService {

    private final MeyaRepository meyaRepository;

    public Set<Meya> getMeyasByUSer(MeyaUser meyaUser) {
        return meyaRepository.findMeyaByMember(meyaUser);
    }

    public Meya getMeyaByID(UUID id) {
        return meyaRepository.findById(id).orElse(null);
    }

    public Meya createMeya(Meya meya) {
        return meyaRepository.save(meya);
    }
}
