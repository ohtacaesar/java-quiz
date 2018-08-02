package com.ohtacaesar.javaquiz;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Q001Test {

  private Q001 q = new Q001();

  @Test
  void test01() {
    assertFalse(q.run("test1", "test2"));
  }

  @Test
  void test02() {
    assertTrue(q.run("test3", "test3"));
  }

  @Test
  void test03() {
    assertTrue(q.run(new String("test4"), new String("test4")));
  }
}
