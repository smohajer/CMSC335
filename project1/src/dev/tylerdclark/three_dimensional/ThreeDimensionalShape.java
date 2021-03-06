/*
 * *****************************************************************************
 * FILE: ThreeDimensionalShape.java
 * NAME: Tyler D Clark
 * PROJECT: Project 1
 * COURSE: CMSC 335
 * DATE: 25 OCT 2020
 * *****************************************************************************
 */

package dev.tylerdclark.three_dimensional;

import dev.tylerdclark.Shape;

/**
 * Class to be extended by Sphere, Cube, Cone, Cylinder, and Torus. Made
 * abstract as no instantiations of this class will be needed and implementation
 * of {@link #volume()} will depend on child class. Calling toString will print
 * volume information.
 */

public abstract class ThreeDimensionalShape extends Shape {
   /**
    * To be implemented with the volume formula specific to each shape.
    * 
    * @return the result from the calculation of volume
    */
   public abstract double volume();

   @Override
   public String toString() {
      return String.format("The volume of the %s is %.1f.", getClass().getSimpleName(), volume());
   }
}
