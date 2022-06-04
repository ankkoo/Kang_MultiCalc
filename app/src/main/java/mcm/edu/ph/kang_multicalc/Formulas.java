package mcm.edu.ph.kang_multicalc;

import java.lang.Math;

public class Formulas {

    //Geometry


    public double cuboidV(double length, double width, double height) {return length * width * height; }

    public double cylinderV(double radius, double height) { return (Math.PI) * (radius * radius) * height;}

    public double sphereV(double radius) { return 1.33 * (Math.PI) * (radius * radius * radius);}

    public double coneV(double radius, double height) { return 0.33 * (Math.PI) * (radius * radius) * height ;}

    public double pyramidV(double length, double width, double height) { return 0.33 * length * width * height;}



    //Physics

    public double speed(double distance, double time) {return distance / time;}

    //edit: gravity is removed.
    public double gravity(double vf, double vi, double time) {return (vf - vi) / time; }

    public double acceleration(double vf, double vi, double time) { return (vf - vi) / time; }

    public double distanceM(double vi, double time, double accel) { return (vi * time) + (0.5 * accel * (time * time)); }

    public double density(double mass, double volume) { return mass * volume; }

}
