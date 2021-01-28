package velometer;

public class PoliceCar {
    public String carName;
    public int speed;
    //构造方法
    public PoliceCar(){}
    public  PoliceCar(int speed){
        this.speed=speed;
    }
    //警车追击小汽车 依赖关系
    public void chase(Car car){
        int carSpeed= car.getSpeed();
        if(this.speed>carSpeed){
            System.out.println("警车开始追迹");
            int time=100/(this.speed-carSpeed);
            System.out.println("经过"+time+"追上");
        }else {
            System.out.println("小汽车飞的太快，追不上");
        }
    }
}
