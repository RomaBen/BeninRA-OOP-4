package ru.netology.posters;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Manager {
    private Posters[] posters = new Posters[0];
    private int resultLength = 10;

    public Manager (boolean showFivePosters) {
        if (showFivePosters) {          // "Лимит указывается в
            this.resultLength = 5;      //  конструкторе менеджера"
        }                               // (с) Филипп Воронов 1:18:40
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
        if (posters.length < resultLength) {
            resultLength = posters.length;
        }
        Posters[] result = new Posters[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = posters.length - i - 1;
            result[i] = posters[index];
        }
        return result;
    }

}