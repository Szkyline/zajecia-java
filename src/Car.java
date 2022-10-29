public class Car {


    final String producent;
    final String model;
    Double milalge;
    String color;

    public Car(String producent, String model){
        this.producent = producent;
        this.model = model;

    }

    public String toString(){
        return "Producer: " + this.producent
                + "Model: " + this.model;
    }


}
