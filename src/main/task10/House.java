package main.task10;

public class House {
    private Door door;
    private Roof roof;
    private Window window;

    public House(final Door door, final Roof roof, final Window window) {
        this.door = door;
        this.roof = roof;
        this.window = window;
    }

    public Door getDoor() {
        return door;
    }

    public Roof getRoof() {
        return roof;
    }

    public Window getWindow() {
        return window;
    }

    public void setRoof(){
        if(roof.ifSet)
            System.out.println("Вже встановили дах");
        else{
            roof.ifSet=true;
            System.out.println("Щойно встановили дах");
        }
    }

    public void setDoor(){
        if(door.ifSet)
            System.out.println("Вже встановили двері");
        else{
            door.ifSet=true;
            System.out.println("Щойно встановили двері");
        }
    }

    public void setWindow(){
        if(window.ifSet)
            if(window.getCount()>1){
                System.out.println("Вже встановили вікна");
            }
            else{
                System.out.println("Вже встановили вікно");
            }
        else{
            if(window.getCount()>1){
                window.ifSet=true;
                System.out.println("Щойно встановили вікна");
            }
            else if(window.getCount()==1){
                window.ifSet=true;
                System.out.println("Щойно встановили вікно");
            }
            else{
                window.ifSet=false;
                System.out.println("Вікна не можуть бути встановлені через брак кількості");
            }
        }
    }

    @Override
    public String toString(){
        if(!door.ifSet && !window.ifSet && !roof.ifSet){
            return "Нічого не встановлено";
        }
        else
        {
            int count=0;
            if(door.ifSet){
                count++;
            }
            if(roof.ifSet){
                count++;
            }
            if(window.ifSet){
                count++;
            }
            return "Будинок:\n"+(door.ifSet==true?"\t"+door+"\n":"")+(roof.ifSet==true?"\t"+roof+"\n":"")+(window.ifSet==true?"\t"+window+"\n":"")+"\t"+count*100/3.0+"% зроблений";
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

        final House house2 = (House) obj;
        return  (door == house2.door
                || (door != null && door.equals(house2.getDoor())))
                && (roof == house2.roof
                || (roof != null && roof.equals(house2.getRoof())
                && (window == house2.window
                || (window != null && window.equals(house2.getWindow())))
        ));
    }

    @Override
    public  int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((roof == null) ? 0 : roof.hashCode());
        result = prime * result + ((door == null) ? 0 : door.hashCode());
        result = prime * result + ((window == null) ? 0 : window.hashCode());
        return result;
    }
}
