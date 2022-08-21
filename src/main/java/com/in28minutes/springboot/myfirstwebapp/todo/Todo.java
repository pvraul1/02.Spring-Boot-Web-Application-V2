package com.in28minutes.springboot.myfirstwebapp.todo;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * The Todo class.
 *
 * @author architecture - pvraul1
 * @since 1.17
 * @version Aug 21, 2022 - 1:13:30 PM
 *
 */
@Data
@AllArgsConstructor
public class Todo {

    private int id;
    private String username;
    private String description;
    private LocalDate targetDate;
    private boolean done;

}
