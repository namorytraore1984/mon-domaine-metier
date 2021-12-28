package com.next.technologies.mondomainemetier.services;

import static com.next.technologies.mondomainemetier.constantes.MonDomaineConst.HEALTHY_MSG;
import com.next.technologies.mondomainemetier.dtos.HealtyObject;
import org.springframework.stereotype.Service;

@Service
public class MonDomaineHealtySrv {

    public HealtyObject getAllServicesHealtyMsg() {
        return HealtyObject.builder()
                .serviceMetier(
                        HEALTHY_MSG)
                .build();
    }
}
