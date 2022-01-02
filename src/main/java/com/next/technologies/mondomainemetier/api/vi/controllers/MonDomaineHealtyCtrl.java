package com.next.technologies.mondomainemetier.api.vi.controllers;


import com.next.technologies.mondomainemetier.brouillons.ConfigPropTest;
import com.next.technologies.mondomainemetier.dtos.HealtyObject;
import com.next.technologies.mondomainemetier.services.MonDomaineHealtySrv;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = {"service/metier/mon-domaine"}, produces = MediaType.APPLICATION_JSON_VALUE)
public class MonDomaineHealtyCtrl {

    @Value("${app.healty.message}")
    private String healtyMsg;

    @GetMapping
    public HealtyObject testConfigServer() {
        return HealtyObject.builder()
                .serviceMetier(healtyMsg)
                .build();
    }

}
