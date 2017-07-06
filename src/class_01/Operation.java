package class_01;

/**
 * Created by Administrator on 2017/6/30.
 */
public abstract class Operation {

    protected double numberA;
    protected double numberB;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public abstract double GetResult();
}
