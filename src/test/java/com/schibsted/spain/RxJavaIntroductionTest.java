package com.schibsted.spain;

import org.junit.Test;
import rx.Observable;

import static org.junit.Assert.assertEquals;


public class RxJavaIntroductionTest {

  @Test
  public void testItWorks() throws Exception {
    int value = Observable.just(4)
        .toBlocking().single();

    assertEquals(3,value);
  }
}
