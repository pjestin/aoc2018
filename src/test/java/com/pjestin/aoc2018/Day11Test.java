package com.pjestin.aoc2018;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day11Test {
  @Test
  public void getMaxPowerLevelSquareCoordinatesTest() {
    assertEquals("33,45", Day11.getMaxPowerLevelSquareCoordinates(18));
    assertEquals("21,61", Day11.getMaxPowerLevelSquareCoordinates(42));
    assertEquals("235,20", Day11.getMaxPowerLevelSquareCoordinates(7165));
  }

  @Test
  public void getMaxPowerLevelCoordinatesAndSizeTest() {
    assertEquals("90,269,16", Day11.getMaxPowerLevelCoordinatesAndSize(18));
    assertEquals("237,223,14", Day11.getMaxPowerLevelCoordinatesAndSize(7165));
  }
}
