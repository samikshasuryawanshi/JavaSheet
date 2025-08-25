class Basic{
    static int tree[];

    public static void init(int n){
        tree = new int[2*n];

    }

    public static int buildST(int arr[],int sti,int start,int end){
        if(start == end){
            tree[sti] = arr[start];
            return arr[start];
        }

        int mid = (start+end)/2;
         buildST(arr,2*sti+1,start,mid);
         buildST(arr,2*sti+2,mid+1,end);
         tree[sti] = tree[2*sti+1]+tree[2*sti+2];
        return tree[sti];
    }

    public static int getSumUtil(int i,int qi,int qj,int si,int sj){
        if(qj <= si || sj <= qi){
            return 0;
        }else if(qi <= si && sj <= qj){
            return tree[si];
        }else{
            int mid = (si+sj)/2;
            return getSumUtil(2*i+1,qi,qj,si,mid)+getSumUtil(2*i+2,qi,qj,mid+1,sj);
        }

    }

    public static int getSum(int arr[],int qi,int qj){
        int n = arr.length;
        return getSumUtil(0,qi,qj,0,n-1);
        
    }

    public static void update(int arr[],int i,int val){

        int n = arr.length;
        int diff = val - arr[i];
        arr[i] = val;
        updateUtil(0,i,0,n-1,diff);

    }
    public static void updateUtil(int i,int val,int si,int sj,int diff){
      if(i >= sj && i <= si){
        return;
      }

      tree[i] += diff;
      if(si != sj){
        int mid = (si+sj)/2;
        updateUtil(2*i+1,val,si,mid,diff);
        updateUtil(2*i+2,val,mid+1,sj,diff);
      } 
      
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        init(n);
        buildST(arr,0,0,n-1);

        for(int i =0;i<tree.length;i++){
            System.out.print(tree[i]+" ");
        }
        System.out.println();

        // getSum(arr,2,5);
        update(arr, 2,2);
        System.out.println(getSum(arr, 2,5));
    }
}