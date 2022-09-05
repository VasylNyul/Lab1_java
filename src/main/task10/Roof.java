package main.task10;

public class Roof {
    private String material;
    private String colour;
    public boolean ifSet;

    public Roof(final String material, final String colour) {
        this.colour = colour;
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
    public String getColour() {
        return colour;
    }

    @Override
    public String toString(){
        if(!ifSet)
            return "Дах не встановлено";
        else{
            return "Встановлений дах з кольору - "+getColour()+" з "+getMaterial();
        }
    }
}
