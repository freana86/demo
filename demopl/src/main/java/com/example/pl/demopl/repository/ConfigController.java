package com.example.pl.demopl.repository;


import com.example.pl.demopl.service.UttagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/config")
public class ConfigController {

    @Autowired
    private UttagService uttagService;

    @GetMapping("/sync")
    public boolean sync(@RequestParam("sync") boolean isActive){
        return uttagService.sync(isActive);
    }

}
