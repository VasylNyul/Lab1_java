package main.task8;


public class CustomDouble{
    private int integer;
    private double fractional;
    public CustomDouble (final int integer, final double fractional) throws Exception {
        if (fractional > 0.9){
            throw new Exception("bad double");

        }
        this.integer = integer;
        this.fractional = fractional;
    }

    public CustomDouble(final double obj){
        integer = (int)obj;
        fractional = obj - integer;
    }

    public int getInteger() { return integer;}

    public void setInteger(final int integer) {
        this.integer = integer;
    }

    public double getFractional() {
        return fractional;
    }

    public void setFractional(final double fractional) {
        this.fractional = fractional;
    }

    public CustomDouble Sum(final CustomDouble cd)throws Exception {
        final CustomDouble c = new CustomDouble(0,0.0) ;
        c.integer = integer + cd.integer;
        c.fractional = fractional + cd.fractional;

        return c;
    }
    public CustomDouble Sub(final CustomDouble cd) throws Exception{
        final CustomDouble c = new CustomDouble(0,0.0) ;
        final CustomDouble a = (CustomDouble) cd;
        c.integer = integer - a.integer;
        c.fractional = fractional - a.fractional;

        return c;
    }
    public void Porivn(final CustomDouble cd) {
        if (integer < cd.integer || integer == cd.integer && fractional < cd.fractional) {
            System.out.println("Число 1  < Число 2 ");
        }
        else if (integer == cd.integer && fractional == cd.fractional) {
            System.out.println("Число 1  = Число 2 ");
        } else if (integer > cd.integer || integer == cd.integer && fractional > cd.fractional){
            System.out.println("Число 1  > Число 2 ");
        }
    }


    @Override
    public  boolean equals(final Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        final CustomDouble customDouble2 = (CustomDouble) obj;
        return integer == customDouble2.integer && fractional == customDouble2.fractional;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        // final int c = (int) (integer + fractional);
        result = prime * result + integer;
        result = (int) (prime * result + fractional);
        return result;
    }
    public double toDouble(){
        final double d = (double) integer;
        return d + fractional;
    }

    public static void main(final String[] args) {
        try {
            final CustomDouble a = new CustomDouble( 2, 0.1);
            final CustomDouble b = new CustomDouble(3, 0.1);
            CustomDouble c = a.Sum(b);
            System.out.println("Sum :");
            System.out.println(c.getInteger());
            System.out.println(c.getFractional());
            c = a.Sub(b);
            System.out.println("Sub :");
            System.out.println(c.getInteger());
            System.out.println(c.getFractional());
            System.out.println("Method toDouble :");
            System.out.println(b.toDouble());

        }catch (final Exception e){
            System.out.println(e);
        }
    }
}
