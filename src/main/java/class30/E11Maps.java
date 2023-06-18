package class30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class E11Maps {
    public static void main(String[] args) {
        Map<String, String> info=new HashMap<>();
        info.put("Moncef","Morocco");

        Map<String, List<String>> moreInfo=new HashMap<>();

        List<String> moncefCities=new ArrayList<>();
        moncefCities.add("Rabat");
        moncefCities.add("Hoceima");
        moncefCities.add("Marrakech");

        List<String> karenStates=new ArrayList<>();
        karenStates.add("California");
        karenStates.add("Nevada");
        karenStates.add("Utah");
        karenStates.add("Alaska");
        karenStates.add("Florida");
        karenStates.add("Hawaii");
        karenStates.add("New Mexico");
        karenStates.add("Colorado");
        karenStates.add("New York");
        karenStates.add("Idaho");

        moreInfo.put("Karen visits",karenStates);
        moreInfo.put("Moncef visits",moncefCities);
        System.out.println(moreInfo);

    }
}
