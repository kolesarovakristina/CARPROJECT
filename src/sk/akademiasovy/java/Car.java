package sk.akademiasovy.java;

public class Car {
    private String brand;
    private int speed;
    private boolean engine;
    private float gasConsumption;
    //constructor

    public Car(){
        speed=0;
        engine=false;
        gasConsumption=7.9f;
        brand=null;
    }

    public Car(String brand,float consumption){
        speed=0;
        engine=false;
        gasConsumption=consumption;
        this.brand=brand;
    }
    public void setBrand(String value){
        brand=value;
    }
    public void setGasConsumption(float gasConsumption){
        this.gasConsumption=gasConsumption;
    }
    public void printInfo(){
        System.out.println("Brand:"+brand+" Concumption:"+gasConsumption+" Actual speed:"+speed+" Engine:"+engine);
    }
    public void startEngine(){
        engine=true;

    }
    public void stopEngine(){
        engine=false;
    }
    public void increaseSpeed(){
        if(engine)
        speed+=10;
    }
    public void decreaseSpeed(){
        speed-=10;
        if(speed<0)
            speed=0;
    }
    public void stop(){
        speed=0;
    }
    public float getPrice(int distance,float costPerLiter){
        float price;
        price=distance*gasConsumption*costPerLiter/100;
        return price;
    }

}
