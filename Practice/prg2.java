package Practice;

public class prg2 {
    public static void main(String[] args) {
        int digs[] = {1, 2, 3, 4};
        printCombwithoutRep(digs); //print to get count
        printCombwithRep(digs); // print to get count
        
    }

    public static int printCombwithRep(int digs[]){
        int count= 0;
        for(int i : digs){
            for(int j : digs){
                for(int k : digs){
                    for(int l : digs){
                        int num = 1000*i + 100*j + 10*k + l;
                        System.out.println(num);
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static int printCombwithoutRep(int digs[]){
        int count= 0;
        for(int i : digs){
            for(int j : digs){
                if(i!=j){
                    for(int k : digs){
                        if(j!=k && i!=k){
                            for(int l : digs){
                                if(i!=l && j!=l && k!=l){
                                    int num = 1000*i + 100*j + 10*k + l;
                                    System.out.println(num);
                                    count++;
                                }
                                    
                            }
                        }
                            
                    }
                }
                    
            }
        }
        return count;
    }
}
