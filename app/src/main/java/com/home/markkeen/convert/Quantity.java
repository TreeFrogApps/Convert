package com.home.markkeen.convert;


import java.text.DecimalFormat;

public class Quantity {

    final double value;
    final Unit unit;

    public static enum Unit {

        Celsius(1.0d), Fahrenheit(33.8d), Kelvin(274.15);

        final double baseUnit;

        private Unit(double inCelsius){
            this.baseUnit = inCelsius;
        }

        public double toBaseUnit(double value){

            return value / baseUnit;
        }

        public double fromBaseUnit(double value){

            return value * baseUnit;
        }

    }

    public Quantity(double value, Unit unit){
        super();

        this.value = value;
        this.unit = unit;

    }

    public Quantity toResult(Unit convertToUnit){

        Unit fromUnit = unit;

        return new Quantity(convertToUnit.fromBaseUnit(fromUnit.toBaseUnit(value)), convertToUnit);

    }

    @Override
    public String toString(){

        DecimalFormat df = new DecimalFormat("#.0000");

        return df.format(value);
    }


}
