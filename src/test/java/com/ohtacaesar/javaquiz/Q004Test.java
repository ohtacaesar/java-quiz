package com.ohtacaesar.javaquiz;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Q004Test {

  private Q004 q = new Q004();


  @Test
  void test01() {
    assertEquals(0, q.run("JavaScript"));
  }

  @Test
  void test02() {
    assertEquals(6, q.run("OracleJava"));
  }

  @Test
  void test03() {
    assertEquals(26, q.run("Which do you like better, Java or JavaScript."));
  }

  @Test
  void test04() {
    assertEquals(-1, q.run("JAVASCRIPT"));
  }

}
