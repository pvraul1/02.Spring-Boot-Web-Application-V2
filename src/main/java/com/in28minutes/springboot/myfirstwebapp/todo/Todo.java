package com.in28minutes.springboot.myfirstwebapp.todo;

import java.time.LocalDate;

import jakarta.validation.constraints.Size;
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

    @Size(min=10, message="Enter atleast 10 characters")
    private String description;

    private LocalDate targetDate;
    private boolean done;

}
