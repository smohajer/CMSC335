/*
 * *****************************************************************************
 * FILE: Cylinder.java
 * NAME: Tyler D Clark
 * PROJECT: Project 1
 * COURSE: CMSC 335
 * DATE: 28 OCT 2020
 * *****************************************************************************
 */
package dev.tylerdclark.three_dimensional;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * This class has a constructor that allows cylinder objects to use
 * {@link #volume()} method to calculate the area based on the {@link #radius}
 * and {@link #height} passed as arguments.
 */
public class Cylinder extends ThreeDimensionalShape {

    private int radius, height;

    /**
     * Creates a cylinder object that can call {@link #volume()} method to calculate
     * volume
     */
    public Cylinder() {

    }

    /**
     * Calculates the volume of the cylinder using the formula: pi * r^2 * h
     * 
     * @return calculated volume of this cylinder
     */
    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    /**
     * Used to properly display the required fields of each shape object
     *
     * @return an array of required fields for shape creation
     */
    @Override
    public String[] getSpecifications() {
        return new String[]{"Radius", "Height"};
    }

    /**
     * Returns a JPanel containing a drawn shape based on the data passed to the object.
     *
     * @return returns a JPanel containing the shape
     */
    @Override
    public JPanel getShape() throws IOException {
        final BufferedImage image = ImageIO.read(new File("src/dev/tylerdclark/img/cylinder.jpg"));
        Image reScaledImage = image.getScaledInstance(300, 300, image.getType());

        return new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(reScaledImage, 0, 0, null);
            }
        };
    }

    /**
     * Passes values to the objects in a way that shapes with varying parameter counts can implement.
     *
     * @param values an arraylist of integers. First index is the first initialized data member and so on.
     */
    @Override
    public void passValues(ArrayList<Integer> values) {
        this.radius = values.get(0);
        this.height = values.get(1);
    }
}
