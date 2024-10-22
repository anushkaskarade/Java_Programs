package MyMath;

public class Trig {
    private double angleInDegrees;

    public Trig(double angleInDegrees) {
        this.angleInDegrees = angleInDegrees;
    }

    private double degreesToRadians() {
        return (angleInDegrees * Math.PI) / 180;
    }

    public double getSine() {
        return Math.sin(degreesToRadians());
    }

    public double getCosine() {
        return Math.cos(degreesToRadians());
    }

    public double getTangent() {
        return Math.tan(degreesToRadians());
    }

    public double getSecant() {
        return 1 / getCosine();
    }

    public double getCosecant() {
        return 1 / getSine();
    }

    public double getCotangent() {
        return 1 / getTangent();
    }
}
