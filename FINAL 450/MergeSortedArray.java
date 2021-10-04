public class MergeSortedArray {
    public static void main(String[] args) {
        int a1[]={10,12};
        int a2[]={5,18,20};
        merge(a1,a2,2,3);
    }
    static void merge(int a1[], int a2[], int n, int m) {
        // code here
        int i=0,j=0;
        while(i<n && j<m){
            if(a1[i]<=a2[j]){
                System.out.print(a1[i]+" ");
                i++;
            }
            else {
                System.out.print(a2[j]+" ");
                j++;
            }
        }
        System.out.println();
        System.out.println(i+" "+j);
        while(j<m){
            System.out.print(a2[j]+" ");
            j++;
        }
        while(i<n){
            System.out.print(a1[i]+" ");
            i++;
        }
        
    }
    
}
