package ru.netology.posters;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Manager {
    private Posters[] posters = new Posters[0];
    private int numberLastPosters = 10;
    private  boolean showFivePosters = false;

    public Manager (boolean showFivePosters) {
        this.showFivePosters = showFivePosters;
    }

    public void save(Posters poster) {
        int length = posters.length + 1;
        Posters[] tmp = new Posters[length];
        System.arraycopy(posters, 0, tmp, 0, posters.length);
        int lastIndex = tmp.length - 1;
        tmp [lastIndex] = poster;
        posters = tmp;
    }

    public Posters[] findAll() {
        return posters;
    }

    public Posters[] findLast() {
        Posters[] posters = findAll();
        if (showFivePosters) {
            numberLastPosters = 5;
        }
        Posters[] postersGot = new Posters[numberLastPosters];
        for (int i = 0; i < postersGot.length; i++) {
            int index = posters.length - i - 1;
            postersGot[i] = posters[index];
        }
        return postersGot;
    }

}