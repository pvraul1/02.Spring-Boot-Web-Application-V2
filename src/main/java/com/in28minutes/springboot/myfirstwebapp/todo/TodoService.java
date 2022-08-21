package com.in28minutes.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 * The todo service.
 *
 * @author architecture - pvraul1
 * @since 1.17
 * @version Aug 21, 2022 - 1:20:26 PM
 *
 */
@Service
public class TodoService {

    private static List<Todo> todos = new ArrayList<>();

    static {
        todos.add(new Todo(1, "in2minutes", "Learn AWS", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(1, "in2minutes", "Learn DevOps", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(1, "in2minutes", "Learn Full Stack Development", LocalDate.now().plusYears(3), false));
    }

    public List<Todo> findByUsername(String username) {
        return todos;
    }

}
