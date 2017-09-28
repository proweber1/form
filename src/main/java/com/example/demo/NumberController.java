package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class NumberController {

    @GetMapping("/")
    public String showForm() {
        return "number_form";
    }

    @PostMapping("/calculate")
    public String multiply(@RequestParam int number, Model ui) {
        ui.addAttribute("result", number * 2);

        return "number_multiply_result";
    }
}
