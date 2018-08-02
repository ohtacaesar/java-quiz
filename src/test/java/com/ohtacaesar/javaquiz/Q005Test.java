package com.ohtacaesar.javaquiz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Q005Test {

  private Q005 q = new Q005();

  @Test
  void test01() {
    assertEquals(0, q.run(".Hack"));
  }

  @Test
  void test02() {
    assertEquals(5, q.run("virus.exe"));
  }

  @Test
  void test03() {
    assertEquals(10, q.run("map.google.com"));
  }

  @Test
  void test04() {
    assertEquals(-1, q.run(",d,s,fdsdf,s,,f,sd,f"));
  }

}
