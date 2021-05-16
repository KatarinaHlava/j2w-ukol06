package cz.czechitas.java2webapps.ukol6.service;

import org.springframework.stereotype.Service;

import java.util.Random;

//NahodneCisloService bude mít jendu metodu – dejNahodneCislo(int horniMez),
// která dostane jako parametr číslo,
// a bude vracet náhodné číslo (typu int) mezi 0 (včetně) a parametrem horniMez (mimo).
@Service
public class NahodneCisloService {
    private Random random;


    public int dejNahodneCislo(int horniMez) {
        this.random = new Random();
        return random.nextInt(horniMez);
    }

}
