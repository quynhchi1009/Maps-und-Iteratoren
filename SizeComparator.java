package edu.hm.cs.bka.dev2.jeans;

import java.util.*;

/**
 * Vergleichsklasse.
 */
public class SizeComparator implements Comparator<Jeans> {

  @Override
  public int compare(Jeans o1, Jeans o2) {
    if (o1.getWaist() != o2.getWaist()) {
      return o1.getWaist() - o2.getWaist();
    } else if (o1.getInseam() != o2.getInseam()) {
      return o1.getInseam() - o2.getInseam();
    } else if (!o1.getColor().equals(o2.getColor())) {
      return o1.getColor().compareTo(o2.getColor());
    }
    return o1.getTyp().compareTo(o2.getTyp());
  }
}
