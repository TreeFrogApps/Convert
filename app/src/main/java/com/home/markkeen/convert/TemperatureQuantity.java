package com.home.markkeen.convert;


public class TemperatureQuantity {

    private double value;
    private String from;
    private String to;

    public TemperatureQuantity(double value, String from, String to) {
        this.value = value;
        this.from = from;
        this.to = to;
    }

    public TemperatureQuantity(double value){
        this.value = value;
    }

    public TemperatureQuantity convert(double value){

        String[] temps = new String[] {"Celsius", "Fahrenheit", "Kelvin"};

        if (temps[0].equals(this.from) && temps[1].equals(this.to)){
            return new TemperatureQuantity((value * 9)/5 + 32);

        } else if (temps[0].equals(this.from) && temps[2].equals(this.to)){
            return new TemperatureQuantity(value + 273.15);

        } else if (temps[1].equals(this.from) && temps[0].equals(this.to)){
            return new TemperatureQuantity(((value - 32) * 5) / 9);

        } else if (temps[1].equals(this.from) && temps[2].equals(this.to)){
            return new TemperatureQuantity((value + 459.67) * 0.555556);

        } else if (temps[2].equals(this.from) && temps[0].equals(this.to)){
            return new TemperatureQuantity((value - 273.15));

        } else if (temps[2].equals(this.from) && temps[1].equals(this.to)) {
            return new TemperatureQuantity((value * 1.8) - 459.67);

        } else {

            return new TemperatureQuantity(value);
        }

    }

    @Override
    public String toString(){

        String sf = String.format("%.6f", value);

        sf = sf.replaceAll("0*$", "").replaceAll("\\.$", "");

        return sf;
    }
}
