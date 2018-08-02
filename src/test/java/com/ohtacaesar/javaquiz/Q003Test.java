package com.ohtacaesar.javaquiz;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Q003Test {

  private Q003 q = new Q003();

  @Test
  void test01() {
    assertTrue(q.run("Java"));
  }

  @Test
  void test02() {
    assertFalse(q.run("PHP"));
  }

  @Test
  void test03() {
    assertTrue(q.run("JavaScript"));
  }

  @Test
  void test04() {
    assertFalse(q.run(null));
  }
}
