package main.task10;

public class Door {
    private String material;
    private String colour;
    public boolean ifSet;

    public Door(final String material, final String colour){
        this.material = material;
        this.colour = colour;
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
            return "Двері не встановлено";
        else{
            return "Встановлені двері з кольору"+getColour()+" з "+getMaterial();
        }
    }
}
