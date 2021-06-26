package edu.hm.cs.bka.dev2.jeans;

import java.util.*;

/**
 * Repräsentiert eine Jeans.
 */
public class Jeans implements Comparable<Jeans> {

  private final String typ;
  private final int waist;
  private final int inseam;
  private final Color color;

  /**
   * Konstruktor.
   */
  public Jeans(String typ, int waist, int inseam, Color color) {
    this.typ = typ;
    this.waist = waist;
    this.inseam = inseam;
    this.color = color;
  }

  @Override
  public int compareTo(Jeans o) {
    // TODO: Implementierung ergänzen!
    if (!typ.equals(o.typ)) {
      return typ.compareTo(o.typ);
    } else if (waist != o.waist) {
      return waist - o.waist;
    } else if (inseam != o.inseam) {
      return inseam - o.inseam;
    }
    return color.compareTo(o.color);
  }

  public String getTyp() {
    return typ;
  }

  public int getWaist() {
    return waist;
  }

  public int getInseam() {
    return inseam;
  }

  public Color getColor() {
    return color;
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, inseam, typ, waist);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Jeans other = (Jeans) obj;
    return color == other.color && inseam == other.inseam && Objects.equals(typ, other.typ)
        && waist == other.waist;
  }

  @Override
  public String toString() {
    return typ + " / " + color + " (" + waist + "/" + inseam + ")";
  }

}
