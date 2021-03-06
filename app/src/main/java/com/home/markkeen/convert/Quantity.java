package com.home.markkeen.convert;


public class Quantity {

    final double value;
    final Unit unit;

    public enum Unit {

        Kilometer(1.0d), Meter(1000.0d), Centimeter(100000.0d), Millimeter(1000000.0d),
        Mile(0.6214d), Yard(1093.61d), Foot(3280.84d), Inch(39370.1d), NauticalMile(0.54d),

        Kilogram(1.0d), Metricton(0.001d), Gram(1000.0d), Milligram(1000000.0d), Mcg(1000000000d),
        Longton(0.000984d), Shortton(0.001102d), Stone(0.157473), Pound(2.20462d), Ounce(35.274d),

        Milesperhour(1.0d), Feetpersecond(1.46667), Meterspersecond(0.44704d), Kmperhour(1.60934d), Knot(0.868976d),

        USgal(1.0d), USquart(4.0d), USpint(8), UScup(16.0d), USoz(128.0d), UStbsp(256.0d), UStsp(768.0d), Cubicmeter(0.003785d),
        Liter(3.78541d), Milliliter(3785.41d), Imperialgal(0.832674d), Imperialquart(3.3307d), Imperialpint(6.66139d),
        Imperialoz(133.228d), Imperialtbsp(213.165d), Imperialtsp(639.494d), Cubicfoot(0.133681d), Cubicinch(231.0d),

        Acre(1.0d), Squarekm(0.004047d), Hectare(0.404686d), Squaremeter(4046.86d), Squaremile(.001563d),
        Squareyard(4840.0d), Squarefoot(43560.0d), Sqaureinch(6272640.0d),

        MPGUS(1.0d), MPGImperial(1.20095d), Kmperliter(0.425144d), Literper100km(235.215d),

        Hour(1.0d), Millisecond(3600000.0d), Minute(60.0d), Day(0.041667d), Week(0.00595238d), Month(0.00136895d), Year(0.00011408d),

        Gigabit(1.0d), Kilobyte(125000.0d), Kibibit(976563.0d), Kibibyte(122070), Megabit(1000.0d), Megabyte(125.0d),
        Mebibit(953.674d), Mebibyte(119.209), Gigabyte(0.125d), Gibibit(0.931323d), Gibibyte(0.116415d),
        Terabit(0.001d), Terabyte(0.000125d), Tebibit(0.000909495d), Tebibyte(0.000113687d);


        final double baseUnit;

        Unit(double inBaseUnit){
            this.baseUnit = inBaseUnit;
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

        String sf = String.format("%.6f", value);

        sf = sf.replaceAll("0*$", "").replaceAll("\\.$", "");

        return sf;
    }


}
