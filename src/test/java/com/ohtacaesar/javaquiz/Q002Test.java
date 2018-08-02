package com.ohtacaesar.javaquiz;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Q002Test {

  private Q002 q = new Q002();

  @Test
  void test01() {
    assertEquals(0, q.run(""));
  }

  @Test
  void test02() {
    assertEquals(4, q.run("test"));
  }

  @Test
  void test03() {
    assertEquals(3, q.run("日本語"));
  }

  @Test
  void test04() {
    assertEquals(-1, q.run(null));
  }
}
