package com.vb.bank.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class BankController {

    Logger log = LoggerFactory.getLogger(BankController.class);

    @GetMapping(path="/bank/all")
    public Map<String, String> getBankInfoMap(){
        log.info("Receive a request to get all bank list");
        Map<String, String> map = new HashMap<>();
        map.put("012", "China Bank Hong Kong");
        map.put("390", "Welab Bank");
        return map;
    }
}
