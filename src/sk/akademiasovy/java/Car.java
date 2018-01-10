package sk.akademiasovy.java;

import java.util.Random;

public class Car {
    private String brand;
    private int speed;
    private boolean engine;
    private float gasConsumption;
    private boolean frontWiper;
    private String plate;
    //constructor

    public Car(){
        speed=0;
        engine=false;
        gasConsumption=7.9f;
        brand=null;
        frontWiper=false;
        generatePlate(null);
    }

    public Car(String brand,float consumption){
        speed=0;
        engine=false;
        gasConsumption=consumption;
        this.brand=brand;
        frontWiper=false;
        generatePlate(null);
    }
    public Car(String brand, float consumption, String city){
        speed=0;
        engine=false;
        gasConsumption=consumption;
        this.brand=brand;
        frontWiper=false;
        generatePlate(city);
    }
    private void generatePlate(String city){
        if (city==null)
            city="";
        switch(city.toLowerCase().trim()){
            case "trencin": plate= "TN-"; break;
            case "presov": plate= "PO-"; break;
            case "bratislava": plate= "BA-"; break;
            case "nitra": plate= "NR-"; break;
            case "senec": plate= "SC-"; break;
            default:plate= "KE-";
        }
        Random random=new Random();
        int i;
        for(i=1;i<=3;i++){
            int randomNumber=random.nextInt(10);
            plate=plate+randomNumber;
        }
        for(i=1;i<=2;i++){
            int randomNumber= random.nextInt(26)+'A';
            plate=plate+(char)randomNumber;
        }
        System.out.println("Assigned plate:"+plate);

    }

    public void setBrand(String value){
        brand=value;
    }
    public void setGasConsumption(float gasConsumption){
        this.gasConsumption=gasConsumption;
    }
    public void printInfo(){
        System.out.println("Brand:"+brand+" Consumption:"+gasConsumption+" Actual speed:"+speed+" Engine:"+engine+ " " +plate);
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
    public void increaseSpeed(int value){
        if(engine && value>0)
        speed+=value;
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

    public int getSpeed(){
        return speed;
    }
    public String getPlate(){
        return plate;
    }

    public void turnOnFrontWiper(){
        frontWiper=true;
    }

    public void turnOfFrontWiper(){
        frontWiper=false;

    }

}
