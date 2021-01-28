package velometer;

public class Velometer {
    private int standardTime;

    //构造方法
    public Velometer(){}
    public Velometer(int standardTime){
        this.standardTime=standardTime;
    }
    public void measure(Car car){
        int carSpeed=car.getSpeed();
        int carTime=100/carSpeed;

        if(this.standardTime<=carTime){
            System.out.println("速度正常，请保持");
        }else{
            System.out.println("汽车超速");
            PoliceCar pc=new PoliceCar(25);
            pc.chase(car);
        }
    }
}
