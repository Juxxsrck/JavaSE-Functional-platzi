package com.platzi.functional._14_optionals;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class OptionalsEjm {

    public static void main(String[] args) {
        List<String> names = getNames();
        if (names != null){
            //Operar con nombres.
        }

        Optional<List<String>> optionalNames = getOptionalNames();
        if (optionalNames.isPresent()){

        }

        optionalNames.ifPresent(namesValues -> namesValues.forEach(System.out::println));

        Optional<String> valuablePlayer = optionalValuablePlayer();
        String valuablePlayerName = valuablePlayer.orElseGet(() -> "No Player");
    }

    static List<String> getNames(){
        List<String> list = new LinkedList<>();

        return Collections.emptyList();
    }

    static String mostValuablePlayer() {
        //return ""
        return null;
    }

    static int mostExpensiveItem() {
        return -1;
    }

    static Optional<List<String>> getOptionalNames() {
        List<String> namesList = new LinkedList<>();
        //Obtención de nombres
        return Optional.of(namesList);
    }

    static Optional<String> optionalValuablePlayer() {
        //
        //return Optional.ofNullable();
        try {
            //Accesos
            return Optional.of("Juss");
        }catch (Exception e){
            e.printStackTrace();
        }
        return Optional.empty();
    }
}
