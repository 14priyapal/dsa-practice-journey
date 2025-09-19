public class PrintAllDevisor {
    public static void main(String args[]){
        int nums = 50;

        // for(int i=1; i<=nums; i++){
        //     if(nums % i == 0){
        //         System.out.print(i +" ");
        //     }
        // }
        // System.out.println();

        // or 

        for(int i=1; i<=Math.sqrt(nums); i++){
            if(nums%i ==0){
                 System.out.print(i +" "); // print i as devisor

                 if(i != nums/i){
                    System.out.print((nums/i)+" "); //print nums/i as devisor
                 }
            }
        }
        System.out.println();
    }
}
