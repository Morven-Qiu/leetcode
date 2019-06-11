package src.interview.sort;

/**
 * Created by morven on 2019/3/19.
 */
public class InsertSort {

    public static void main(String[] args) {
        int a[] = {3,1,2,5,4};
//        insertSort(a);
//        for (int i=0;i<=a.length -1 ; i++){
//            System.out.println(a[i]);
//        }

        //fastSort(a);
//        for (int i=0;i<=a.length -1 ; i++){
//            System.out.println(a[i]);
//        }

//        maopao(a);
//        for (int i=0;i<=a.length -1 ; i++){
//            System.out.println(a[i]);
//        }

        int[] b = {1,5,7,9,10};
        System.out.println("args = [" + sort(b,7,0,5) + "]");
    }

    public static void insertSort(int[] arr){
        int target;
        for(int i = 1 ;i <arr.length ;i++){
            target = arr[i];
            int j = i -1 ;
            while (j >=0 && target < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = target;
        }
    }

    public static void selectSort(int[] arr){
        for(int i = 0 ;i <arr.length ;i++) {
            int k = i;
            for(int j = k+1; j <arr.length ;j++ ){
                if(arr[j] < arr[k] ){
                    k = j;
                }
            }
            if(k!=i){
                int temp = arr[k];
                arr[k] =  arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void maopao(int[] arr){
        for(int i = 0 ;i <arr.length ;i++) {
            for(int j = i;j < arr.length ;j++){
                if(arr[i] > arr [j]){
                    int temp = arr[j];
                    arr[j] =  arr[i];
                    arr[i] = temp;
                }
            }
        }
    }


    public static int sort(int []array,int a,int lo,int hi){
        if(lo<=hi){
            int mid=(lo+hi)/2;
            if(a==array[mid]){
                return mid;
            }
            else if(a>array[mid]){
                return sort(array,a,mid+1,hi);
            }else{
                return sort(array,a,lo,mid-1);
            }
        }
        return -1;
    }
}
