package ru.elleriumsoft.studyapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by mayorov_an on 19.06.2017.
 */
public class ListData {
    public static HashMap<String, List<String>> loadData() {
        HashMap<String, List<String>> expDetails = new HashMap<>();

        List<String> oopLanguages = new ArrayList<>();
        oopLanguages.add("Java");
        oopLanguages.add("C++");
        oopLanguages.add("C#");
        oopLanguages.add("Python");
        oopLanguages.add("Scala");
        for (int i=0; i<25; i++)
        {
            oopLanguages.add("Java");
        }

        List<String> structuredLanguages = new ArrayList<>();
        structuredLanguages.add("ALGOL");
        structuredLanguages.add("COBOL");
        structuredLanguages.add("QBasic");
        structuredLanguages.add("COMAL");
        structuredLanguages.add("LEAP");

        List<String> functionalLanguages = new ArrayList<>();
        functionalLanguages.add("Haskell");
        functionalLanguages.add("Miranda");
        functionalLanguages.add("Curry");
        functionalLanguages.add("Clean");
        functionalLanguages.add("Joy");

        expDetails.put("OOP языки программирования", oopLanguages);
        expDetails.put("Structured языки программирования", structuredLanguages);
        expDetails.put("Functional языки программирования", functionalLanguages);

        return expDetails;
    }
}
