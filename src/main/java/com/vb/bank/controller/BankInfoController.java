package com.vb.bank.controller;

@RestController
public class BankInfoController {

    @GetMapping(path="/bank/all")
    public Map<String, String> getBankInfoMap(){
        Map<String, String> map = new HashMap<>();
        map.put("012", "China Bank Hong Kong");
        map.put("390", "Welab Bank");
        return map;
    }
}
