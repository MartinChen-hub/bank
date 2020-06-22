package com.vb.bank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class BankController {

    @GetMapping(path="/bank/all")
    public Map<String, String> getBankInfoMap(){
        Map<String, String> map = new HashMap<>();
        map.put("012", "China Bank Hong Kong");
        map.put("390", "Welab Bank");
        return map;
    }
}
