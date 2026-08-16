public class School{
    public static void main(String[] args){
        Student st[] = new Student[5];
        Student s1=new Student("Raju",420,22,'M',99);
        st[0]=s1;
        st[1]=new Student("Rani",421,21,'F',98);
        st[2]=new Student("Radhika",422,16,'F',95);
        st[3]=new Student("Tillu",423,19,'M',94);
        st[4]=new Student("Madhav",424,20,'M',96);
        for(int i=0;i<st.length;i++){
            System.out.println(st[i]);
        }
        System.out.println("===============================Highest Percentage===================================");
        Student max = st[0];
        for(int i=0;i<st.length;i++){
            if(st[i].percentage > max.percentage){
            max=st[i];
            }
        }
        System.out.println(max);
    }
}