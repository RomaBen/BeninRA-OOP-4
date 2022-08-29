package ru.netology.posters;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Manager {
    private Posters[] posters = new Posters[0];
    int numberFindLastPosters = 10;
    boolean showFivePosters = false;
    private Manager postersManager;

    public Manager (boolean showFivePosters) {
        if (showFivePosters) {
            this.numberFindLastPosters = 5;
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

    public void findLast() {

    }
}