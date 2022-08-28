package ru.netology.posters;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Posters {
    private int id;
    private int filmId;
    private String filmName = "Placeholder";
    private String filmGenre = "Placeholder";
    private boolean filmAvailability = false;
}
