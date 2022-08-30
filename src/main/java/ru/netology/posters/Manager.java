package ru.netology.posters;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Manager {
    private Posters[] posters = new Posters[0];
    private  boolean showFivePosters = false;
    private int resultLength;

    public Manager (boolean showFivePosters) {
        this.showFivePosters = showFivePosters;
        if (showFivePosters) {
            this.resultLength = 5;      // "Лимит указывается в
        } else {                        //  конструкторе менеджера"
            this.resultLength = 10;     // (с) Филипп Воронов 1:18:40
        }
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
        Posters[] result = new Posters[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = posters.length - i - 1;
            result[i] = posters[index];
        }
        return result;
    }

}