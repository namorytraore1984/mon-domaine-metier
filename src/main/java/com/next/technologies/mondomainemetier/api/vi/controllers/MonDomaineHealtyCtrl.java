package com.next.technologies.mondomainemetier.api.vi.controllers;


import com.next.technologies.mondomainemetier.dtos.HealtyObject;
import com.next.technologies.mondomainemetier.services.MonDomaineHealtySrv;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = {"service/metier/mon-domaine"}, produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class MonDomaineHealtyCtrl {

    private final MonDomaineHealtySrv healtySrv;

    @GetMapping("/sante")
    public HealtyObject sanityCheck() {
        return healtySrv.getAllServicesHealtyMsg();
    }
}
