//using method overriding
gh
class Journey{
    void travel(){
        System.out.println("Travel through any type of Transportation");
    }
}
class Bike extends Journey{
    @Override
    void travel(){
        System.out.println("Travel through Bike");
    }
}
class Car extends Journey{
    @Override
    void travel(){
        System.out.println("Travel through Car");
    }
}
class Bus extends Journey{
    @Override
    void travel(){
        System.out.println("Travel through Bus");
    }
}
class Train extends Journey{
    @Override
    void travel(){
        System.out.println("Travel through Train");
    }
}