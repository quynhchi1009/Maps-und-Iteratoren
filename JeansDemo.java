package edu.hm.cs.bka.dev2.jeans;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Demo.
 */
public class JeansDemo {

  /**
   * Demo.
   *
   * @param args nicht genutzt.
   */
  public static void main(String[] args) {

    List<Jeans> jeans = new ArrayList<>();

    jeans.add(new Jeans("Hipster Straight Cut", 30, 32, Color.DARK_STONEWASH));
    jeans.add(new Jeans("Hipster Straight Cut", 31, 31, Color.DARK_STONEWASH));
    jeans.add(new Jeans("Hipster Straight Cut", 31, 32, Color.NAVARRO_DARK_WASH));
    jeans.add(new Jeans("Hipster Straight Cut", 33, 32, Color.DARK_STONEWASH));
    jeans.add(new Jeans("SuperSkinny", 28, 30, Color.DARK_STONEWASH));
    jeans.add(new Jeans("SuperSkinny", 27, 30, Color.KANSAS_GREY));
    jeans.add(new Jeans("SuperSkinny", 27, 29, Color.KANSAS_GREY));
    jeans.add(new Jeans("SuperSkinny", 28, 29, Color.NAVARRO_DARK_WASH));
    jeans.add(new Jeans("AthleticTaper", 32, 32, Color.NAVARRO_DARK_WASH));
    jeans.add(new Jeans("AthleticTaper", 32, 32, Color.LIGHT_WASH));

    // Sollte nach Typ, Farbe, Weite und Länge sortieren
    System.out.println("Zuerst nach Typ/Farbe sortiert:");
    Collections.sort(jeans);
    for (Jeans j : jeans) {
      System.out.println(j);
    }

    // Sollte nach Weite, Länge, Farbe und Typ sortieren
    System.out.println("\nZuerst nach Größen sortiert:");
    Collections.sort(jeans, new SizeComparator());
    for (Jeans j : jeans) {
      System.out.println(j);
    }

  }
}
