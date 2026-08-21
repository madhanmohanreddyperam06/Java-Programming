interface I1{
    public void walk();
}
interface I2{
    public void run();
}
interface I3{
    public void eat();
}
interface I extends I1, I2, I3{
    public void sleep();
}