package cz.czechitas.java2webapps.ukol6.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitatyRepository {
    private final List<String> seznamCitatu = List.of(
            "Debugging /de·bugh·ing/ (verb): The Classic Mystery Game where you are the detective, the victim, and the murderer.",
            "A user interface is like a joke. If you have to explain it, it's not that good.",
            "To replace programmers with robots, clients will have to accurately describe what they want. We're safe.",
            "I have a joke on programming but it only works on my computer.",
            "99 little bugs in the code, 99 bugs in the code. Take one down, patch it around. 127 little bugs in the code…",
            "When I wrote this code, only God & I understood what it did. Now… Only God knows.",
            "Programmer (noun.): A machine that turns coffee into code.",
            "Real programmers count from 0.",
            "First, solve the problem. Then, write the code",
            "Sometimes it pays to stay in bed on Monday, rather than spending the rest of the week debugging Monday’s code.",
            "Optimism is an occupational hazard of programming: feedback is the treatment"
    );


    public int pocet() {
        return seznamCitatu.size();
    }

    public String citat(int poradi) {
        return seznamCitatu.get(poradi);
    }

}

//. Metoda pocet() bude vracet číslo (int) – počet citátů v naší „databázi“.
// Metoda citat(int poradi) bude vracet text citátu se zadaným pořadovým číslem.
