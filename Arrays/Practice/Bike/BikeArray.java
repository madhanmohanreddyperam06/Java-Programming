public class BikeArray{
    public static void main(String[] args){
        Bike[] bt = {new Bike("TVS-XL", 95000),
                    new Bike("Pulsar-250", 98000),
                    new Bike("RX-100", 150000),
                    new Bike("Royal Enfield", 250000),
                    new Bike("Ola", 120000),
                    new Bike("Activa", 180000)};
        //System.out.println(bt.length);
        
        //task1
        System.out.println("-------Task-1(Print all bikes)-------");
        for(Bike obj : bt){
        System.out.println(obj);
        }
        System.out.println("");

        //task2
        System.out.println("-------Task-2(print all bikes in reversed index)-------");
        for(int i=bt.length-1; i>=0; i--){
            System.out.println(bt[i]);
        }
        System.out.println("");

        //task3-find avg price of all bikes
        System.out.println("-------Task-3(Avg Price of Bikes)-------");
        double sum = 0;
        for(Bike obj : bt){
            sum += obj.price;
        }
        double avg = sum/bt.length;
        System.out.println("Average price of all bikes = " + avg);
        System.out.println("");

        //task4-find the bike with price >= avg price
        System.out.println("-------Task-4(Bike With price >= Avg Price)-------");
        for(Bike obj : bt){
            if(obj.price >= avg){
                System.out.println(obj);
            }
        }
        System.out.println("");
        
        //task5- get the costliest bike details
        System.out.println("-------Task-5()Costliest Bike Details)-------");
        double max = 0.0;
        int index = 0;
        for(int i=0; i<bt.length; i++){
            if(bt[i].price > max){
                max = bt[i].price;
                index = i;
            }
        }
        System.out.println("Costliest bike details = " + bt[index]);
        System.out.println("");

        //task6- get bike details whose brand name starts with Vowel characters
        System.out.println("-------Task-6(Bike Details Whose Brand Name Starts With Vowel Characters)-------");
        for(Bike obj : bt){
            char ch = obj.brand.charAt(0);
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                System.out.println(obj);
            }
        }

    }
}