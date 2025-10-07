class SumOfArray{

    //find the sum of all the elements
    public static void sum(int arr[]){
        int sum =0;
        for(int i =0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    
    }

    //find the avg in an array
    public static void avg(int arr[]){
        int sum =0;
        for(int i =0;i<arr.length;i++){
            sum+=arr[i];
        }
        int avg = sum/arr.length;
        System.out.println(avg);
    }

    //find min and max element in an array
    public static void minMax(int arr[]){
        int min = arr[0];
        int max = arr[0];

        for(int i=0;i<arr.length;i++){
            if(min < arr[i]){
                min = arr[i];
            }
            if(max > arr[i]){
                max = arr[i];
            }
        }
        System.out.println("min = "+min);
        System.out.println("max = "+max);
    }


    public static void linear(int arr[],int key){
        int index = 0;

        for(int i =0;i<arr.length;i++){
            if(arr[i] == key){
                index = i;
                break;
            }
        }
        if(index == 0){
            System.out.println("not found");

        }else{
            System.out.println("found at index "+index);
        }

    }


    // count the occurrnce of a specific element

    public static int occ(int arr[],int key){
        int count =0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]== key){
               count++;
            }
        } 
        return count;
    }


    //replace the occurence number
    public static void replace(int arr[],int old,int newPlace){
        for(int i =0;i<arr.length;i++){
            if(arr[i]== old){
               arr[i] = newPlace;
            }
        }

        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

    //check if an arrayaz  contains given number
    public static void contains(int arr[],int key){
        boolean found = false;
        for(int i =0;i<arr.length;i++){
            if(arr[i] == key){
                found = true;
                break;
            }
        }

        if(found){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }
    }

    //even and odd numbers in an array

    public static void evenOdd(int arr[]){
        
        int ecount= 0;
        int ocount = 0;

        for(int i =0;i<arr.length;i++){
            if(arr[i] % 2==0){
               ecount++;
            }else{
                ocount++;
            }
        }


        int even[] = new int[ecount];
        int odd[] = new int[ocount];

        int e=0,o=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i] % 2==0){
                even[e] = arr[i];
                e++;
            }else{
                odd[o] = arr[i];
                o++;
            }
        }

        for(int i=0;i<even.length;i++){
            System.out.print(even[i]+" ");
        }
        System.out.println();
        for(int i =0;i<odd.length;i++){
            System.out.print(odd[i]+" ");
        }
        System.out.println();



        // System.out.print("Odd number : ");
        // for(int i =0;i<arr.length;i++){
        //     if(arr[i] % 2!=0){
        //         System.out.print(arr[i]+" ");
        //     }
        // }
    }
    

    //copy element from one to another
    public static void copy(int source[],int dest[]){
        for(int i =0;i<source.length;i++){
            dest[i] = source[i];
        }

        for(int i =0;i<dest.length;i++){
            System.out.print(dest[i] + " ");
        }
    }


    public static void merge(int arr1[],int arr2[]){
        int merge[] = new int[arr1.length + arr2.length];
        for(int i =0;i<arr1.length;i++){
            merge[i] = arr1[i];
        }

        for(int i =0;i<arr2.length;i++){
            merge[arr1.length + i] = arr2[i];
        }

        for(int i=0;i<merge.length;i++){
            System.out.print(merge[i]+" ");
        }
    }

    //comparing two elemnts for equality
    public static void compare(int arr1[],int arr2[]){
        int n1 = arr1.length;
        int n2 = arr2.length;
        boolean isEqual =true;

        for(int i =0;i<n1;i++){
            if(n1 != n2){
                isEqual = false;
            }else{
                for(int j =0;j<n1;j++){
                    if(arr1[j] != arr2[j]){
                        isEqual = false;
                        break;
                    }
                }
            }
        }

        if(isEqual){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }

    }

    public static void main(String[] args) {
       int arr[] = {1,2,3,4,5};
       
    //    minMax(arr);

    // linear(arr, 3);
    //   System.out.println(occ(arr, 2));
    //     replace(arr, 2, 9);

        // contains(arr, 3);
        // evenOdd(arr);

        // int dest[] = new int[arr.length];
        // copy(arr, dest);

        // int arr2[] = {6,7,8};
        // merge(arr, arr2);

        int arr2[] = {1,2,3,4,6};
        compare(arr, arr2);
    }
}