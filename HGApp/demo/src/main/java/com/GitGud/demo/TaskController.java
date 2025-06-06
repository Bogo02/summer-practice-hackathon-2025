package com.GitGud.demo;

import org.springframework.ui.Model;
import ort.springframework.stereotype.Controller;
import org.springframework.web.bind.annotations.getMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TaskController{

    @GetMapping("/")
    public String home(Model model){
        List<String> tasks = new ArrayList<>();

        tasks.add("Add code");
        tasks.add("Add comments");
        tasks.add("Add Edit function");

        model.addAttribute("task:",tasks);
        return "index";
    }
}