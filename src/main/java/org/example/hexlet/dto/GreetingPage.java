package org.example.hexlet.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class GreetingPage {
    private Boolean visited;
    private String currentUser;

    public Boolean isVisited() {
        return visited;
    }
}
