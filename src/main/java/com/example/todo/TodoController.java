package com.example.todo;

import org.springframework.web.bind.annotation.*;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    @GetMapping
    public List<Todo> getTodos() {
        return Arrays.asList(
            new Todo(1L, "Devenir un pro de Spring Boot", true),
            new Todo(2L, "Maitriser les branches Git", false)
        );
    }
}
