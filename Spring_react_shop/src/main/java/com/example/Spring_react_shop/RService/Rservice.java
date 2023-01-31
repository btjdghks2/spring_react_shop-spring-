package com.example.Spring_react_shop.RService;

import com.example.Spring_react_shop.REntity.RSEntity;
import com.example.Spring_react_shop.Rrepository.RSrepositoty;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class Rservice {

    private final RSrepositoty rSrepositoty;

    @Transactional
    public RSEntity productupdate(Long id, RSEntity rsEntity) {
        RSEntity rsentity = rSrepositoty.findById(id)
                .orElseThrow(() ->new IllegalArgumentException("id 확인해주세요"));
        rsentity.setTitle(rsentity.getTitle());
        rsentity.setContent(rsentity.getContent());
        rsentity.setPrice(rsentity.getPrice());

        return null;
    }

    @Transactional
    public RSEntity save(RSEntity rsEntity) {
        return rSrepositoty.save(rsEntity);
    }

    @Transactional(readOnly = true)
    public List<RSEntity> productall() {
        return rSrepositoty.findAll();
    }

    @Transactional(readOnly = true)
    public RSEntity probyid(Long id) {
        return rSrepositoty.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("id 조회 실패!"));
    }


    @Transactional
    public String productdelete(Long id) {
         rSrepositoty.deleteById(id);
        return "ok";

    }
}
