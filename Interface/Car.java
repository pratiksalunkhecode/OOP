package Interface;

public class Car implements engine,Break,Media{

    @Override
    public void start() {
        // TODO Auto-generated method stub
        System.out.println("start my car engine");
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        System.out.println("stop my car engine");
    }

    @Override
    public void acc() {
        // TODO Auto-generated method stub
        System.out.println("acc my car");
    }

    public void break1(){
        System.out.println("for stop need break");
    }


    
}
