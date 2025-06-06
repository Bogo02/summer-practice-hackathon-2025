package com.example.HGHack;

import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TaskController {

    @GetMapping
    public String home(Model model) {
        List<String> tasks = new ArrayList<>();
        tasks.add("Add Code");
        tasks.add("Add Comments");

        model.addAttribute("tasks", tasks);
        return "index";
    }
}
