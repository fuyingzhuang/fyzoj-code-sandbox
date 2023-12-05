package com.ambition.fyzojcodesandbox.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ambition
 * @date 2023/12/5 22:18
 */

@RestController
@RequestMapping("/code/sandbox")
public class MainController {

    @GetMapping("/health")
    public String getHealth() {
        return "ok";
    }
}
