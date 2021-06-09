package mitsk.simulation.continuous.rk;

import mitsk.simulation.continuous.rk.relations.Function;

public class _2D extends Function {
//    public _2A() {
//        public double getValue(double x, double y);
//
//    }

    @Override
    public double getValue(double x, double y) {
        return (6-2*x/y);
    }
}
