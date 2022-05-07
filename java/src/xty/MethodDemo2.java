package xty;

import javax.lang.model.util.ElementScanner6;

public class MethodDemo2 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={1,2,3,4,5};
        System.out.println( compare(arr1,arr2));
    }
    public static boolean compare(int[] a,int[] b){
        if(a.length==b.length){
            for(int i=0;i<a.length;i++){
                if(a[i]!=b[i]){
                    return false;
                } 
            }
            return true;
        }
        else{
            return false;
        }
    }
    
}
    

