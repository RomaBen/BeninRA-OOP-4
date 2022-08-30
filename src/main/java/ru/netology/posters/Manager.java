package ru.netology.posters;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Manager {
    private Posters[] posters = new Posters[0];
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
        int resultLength;
        if (showFivePosters) {
            resultLength = 5;
        } else {
            resultLength = 10;
        }
        Posters[] result = new Posters[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = posters.length - i - 1;
            result[i] = posters[index];
        }
        return result;
    }

}