package ru.netology.posters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ManagerTest {
    Posters poster = new Posters(0, "Obochina",
            "Uzhas", true);
    Posters poster1 = new Posters(1, "Hohotach",
            "Comedy", true);
    Posters poster2 = new Posters(2, "Si-Xian",
            "BattleArt", false);
    Posters poster3 = new Posters(4, "Chelovek-Bomj",
            "Boevik", false);
    Posters poster4 = new Posters(3,"Povorot von tuda",
            "Thriller",false);
    Posters poster5 = new Posters(5, "Anek za sotku",
            "Comedy", true);
    Posters poster6 = new Posters(6, "Po4emu?",
            "Documentary", false);
    Posters poster7 = new Posters(7, "Testirovshik s nulya",
            "Documentary", true);
    Posters poster8 = new Posters(8, "Mama ya poluchil dva",
            "Thriller", true);
    Posters poster9 = new Posters(9);
    Posters poster10 = new Posters(10, "Ya nesu tortic",
            "Adventure", false);
    Posters poster11 = new Posters(11, "Hohotach2-Polniy Hohotach",
            "Thriller", true);
    Manager manager = new Manager();
    Manager managerSF = new Manager(true); // SF - Show Five

    @Test
    public void shouldFindLastTenPostersSaved() {
        manager.save(poster);
        manager.save(poster1);
        manager.save(poster2);
        manager.save(poster3);
        manager.save(poster4);
        manager.save(poster5);
        manager.save(poster6);
        manager.save(poster7);
        manager.save(poster8);
        manager.save(poster9);
        manager.save(poster10);
        manager.save(poster11);

        Posters[] actual = manager.findLast();
        Posters[] expected = { poster11, poster10,
        poster9, poster8, poster7, poster6, poster5,
        poster4, poster3, poster2};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFivePostersSaved() {
        managerSF.save(poster);
        managerSF.save(poster1);
        managerSF.save(poster2);
        managerSF.save(poster3);
        managerSF.save(poster4);
        managerSF.save(poster5);
        managerSF.save(poster6);
        managerSF.save(poster7);
        managerSF.save(poster8);
        managerSF.save(poster9);
        managerSF.save(poster10);
        managerSF.save(poster11);

        Posters[] actual = managerSF.findLast();
        Posters[] expected = { poster11, poster10,
                poster9, poster8, poster7};
        assertArrayEquals(expected, actual);
    }

}