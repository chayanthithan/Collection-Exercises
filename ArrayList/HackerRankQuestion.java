import java.util.*;

class HackeerRankQuestion{
    public static void main(String[] args) {
        // ArrayList<Integer> al=new ArrayList<>();
        
        Scanner sc=new Scanner(System.in);
        List<List<Integer>> ls=new ArrayList<>();
        // char letter=' ';
    //    do{
        System.out.print("enter array size:");
        int n=sc.nextInt();
        for(int j=0;j<n;j++){
            List<Integer> l1=new ArrayList<>();
            System.out.print("enter size of array:");
            int d=sc.nextInt();
            for(int i=0;i<d;i++){
                l1.add(sc.nextInt());
            }
            ls.add(l1);
        }
            
    //         System.out.print("do you want to add more array:");
    //         letter=sc.next().charAt(0);
    //    }while(letter=='y'||letter=='Y');
       
       System.out.print("how many elements do you want to check:");
       int q=sc.nextInt(); //this is for number of queries
       for(int i=0;i<q;i++){
         int x=sc.nextInt();
         int y=sc.nextInt();

         
         try{
            System.out.println( ls.get(x-1).get(y-1));
         }catch(Exception e){
            System.out.println("ERROR!");
         }
       }

    }
}