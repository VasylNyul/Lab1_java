package main.task10;

public class Window {
     private String colour;
     private final int count;
     public boolean ifSet;

    public Window(final String colour, final int count) {
        this.colour = colour;
        this.count = count;
    }

    public int getCount() {return count; }
    public String getColour() {
        return colour;
    }

    @Override
    public String toString(){
        if (!ifSet){
            if(count ==0) {
                return "Немає вікон";
            }
            else if(count ==1){
                return("Вікно не встановлене");
            }
            else{
                return("Вікна не встановлені");
            }
        }
        else{
            if(count >1){
                return (getCount() +" вікна встановлені з кольору - "+ getColour() );
            }
            else{
                return ("Встановлене вікно з кольору - "+ getColour() );
            }
        }
    }
}
