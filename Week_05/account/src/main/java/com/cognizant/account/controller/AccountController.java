package com.cognizant.account.controller;
import java.util.Map;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {
	@GetMapping("/{number}")
    public Map<String, Object> getAccountDetails(@PathVariable String number) {
        return Map.of(
            "number", number,
            "type", "savings",
            "balance", 34567
        );
    }
}
