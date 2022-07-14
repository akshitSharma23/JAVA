public class searching {
/*
    public static int binary(int[] arr,int k){
        int n=arr.length;
        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>k)
                high=mid-1;
            else if(arr[mid]<k)
                low=mid+1;
            else
                return mid;
        }
        return -1;
    }

    public static int rec_binary(int[] arr,int low,int high, int k){
       int mid=(low+high)/2;
       if(low<high)
           return -1;
       else{
        if(arr[mid]==k)
            return mid;
        if(arr[mid]>k)
            return rec_binary(arr,low,mid-1,k);
        if(arr[mid]<k)
            return rec_binary(arr,mid+1,high,k);
        }
        return -1;
    }
    public static void main(String[] args){
        int [] arr={10,20,30,40,50,60};
        System.out.println(binary(arr,50));
        System.out.println(rec_binary(arr,0,arr.length,70));
    }
*/
    /*
    public static int first(int[] arr,int k){
        int high=arr.length-1,low=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(k>arr[mid]){
                low=mid+1;
            }
            else if(arr[mid]>k){
                high=mid-1;
            }
            else{
                if(mid==0 || arr[mid]!=arr[mid-1])
                    return mid;
                high=mid-1;
            }
        }
        return -1;
    }

    public static int rec_first(int [] arr,int k,int low,int high){
        int mid=(low+high)/2;
        if(low>high)
            return -1;
        if(arr[mid]<k)
            return rec_first(arr,k,mid+1,high);
        else if(arr[mid]>k)
            return rec_first(arr,k,low,mid-1);
        else{
            if(mid==0 || arr[mid]!=arr[mid-1])
                return mid;
            else
                return rec_first(arr,k,low,mid-1);
        }
    }

    public static void main(String[] args){
        int[] arr={1,10,10,10,20,20,40};
        System.out.println(rec_first(arr,1,0, arr.length));
    }*/

/*
    public static int last(int[] arr,int k){
        int high=arr.length-1,low=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>k)
                high=mid-1;
            else if(arr[mid]<k)
                low=mid+1;
            else
                if(mid==arr.length-1 || arr[mid]!=arr[mid+1])
                    return mid;
                else
                    low=mid+1;
        }
        return -1;
    }

    public static int rec_last(int[] arr,int low,int high,int k,int n){
        if(low>high)
            return -1;
        else {
            int mid = (low + high) / 2;
            if (arr[mid] > k)
                return rec_last(arr, 0, mid - 1, k, n);
            else if (arr[mid] < k)
                return rec_last(arr, mid + 1, high, k, n);
            else if (mid == n - 1 || arr[mid] != arr[mid + 1])
                return mid;
            else
                return rec_last(arr, mid + 1, high, k, n);
        }
    }

    public static void main(String[] args){
        int [] arr={10,15,20,20,40,40};
        int f=1;
        System.out.println(last(arr,f));
        System.out.println(rec_last(arr,0,arr.length-1,f,arr.length));
    }*/
/*
    public static int first(int [] arr, int k){
        int high=arr.length-1,low=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>k)
                high=mid-1;
            else if(arr[mid]<k)
                low=mid+1;
            else{
                if(mid==0 || arr[mid]!=arr[mid-1])
                return mid;
            high=mid-1;
            }
        }
        return -1;
    }

    public static int last(int [] arr, int k) {
        int low = 0, high = arr.length - 1;
        while (low <= high){
            int mid = (low + high) / 2;
            if(arr[mid]>k)
                high=mid-1;
            else if(arr[mid]<k)
                low=mid+1;
            else{
                if(mid==arr.length-1 || arr[mid]!=arr[mid+1])
                return mid;
            low=mid+1;
            }
        }
        return -1;
    }
    public static int count(int[] arr,int k){
        int last=last(arr,k);
        int first=first(arr,k);
        if(first==-1)
            return 0;
        return last-first+1;
    }

    public static void main(String[] args){
        int [] arr={10,10,10,10,10,10};
        int k=10;
        System.out.println(count(arr,k));
  }
*/
/*
    public static int ones(int[] arr, int k){
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==0)
                low=mid+1;
            else{
                if(mid==0 || arr[mid-1]!=arr[mid])
                    return arr.length-mid;
                high=mid-1;
            }
        }
        return 0;
    }

    public static void main(String[] args){
        int[] arr={1,1,1,1};
        System.out.println(ones(arr,1));
    }
*/

/*
    public static int root(int k){
        if(k>2 && k<=4)
            return 2;
        int low=1,high=k;
        while(low<=high){
            int mid=(low+high)/2;
            if(k>=mid*mid && (mid+1)*(mid+1)>k)
                return mid;
            else if(mid*mid>k && (mid+1)*(mid+1)>=k)
                high=mid-1;
            else if(mid*mid<k && (mid+1)*(mid+1)<=k)
                low=mid+1;
        }
        return 0;
    }

    public static int sqroot(int k){
        int low=1,high=k,ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(mid*mid==k)
                return mid;
            else if(mid*mid>k)
                high=mid-1;
            else if(mid*mid<k){
                low=mid+1;
                ans=mid;
            }
        }
        return k;
    }

    public static void main(String[] args){
        System.out.println(root(3));
        System.out.println(sqroot(289));
    }*/
/*
    public static int binary(int[] arr,int l, int h, int k){
        int low=l+1,high=h-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<k)
                low=mid+1;
            else if(arr[mid]>k)
                high=mid-1;
            else
                return mid;
        }
        return -1;
    }

    public static int find(int[] arr,int k){
        int i=1;
        if(arr[0]==k)
            return 0;
        while(arr[i]<k)
            i=i*2;
        if(arr[i]==k)
            return i;
        return binary(arr,i/2,i,k);
    }

    public static void main(String[] args){
        int[] arr={1,1,1,1,1,1,2,2,2,2,2,3,3,3,4,4,4,4,4,4,4,4,5,5,5,5,5,5,6,6,6,6,6,6,6,6,8,8,8,8,8,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9};
        System.out.println(find(arr,5));
    }
*/
/*
    public static int rotated(int[] arr,int k) {
        int n = arr.length, low=0, high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==k)
                return mid;
            if(arr[high]<arr[mid]){
                if(arr[mid]<k && arr[high]>=k)
                    low=mid+1;
                else
                    high=mid-1;
            }
            else
                if(arr[mid]>k && arr[low]<=k)
                    high=mid-1;
                else
                    low=mid+1;
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr={100,500,10,20,30,40,50};
        System.out.println(rotated(arr,100));
    }
*/
/*
    public static int peak(int [] arr){
        int low=1,high=arr.length-1;
        if(high==0 || arr[high]>arr[high-1])
            return arr[high];
        else if (arr[low]>arr[low+1])
            return arr[low];
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] < arr[mid - 1])
                high = mid - 1;
            else if (arr[mid] < arr[mid + 1])
                low = mid+1;
            else
                return arr[mid];
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr={80,70,90};
        System.out.println(peak(arr));
    }*/
/*
    public static boolean closest(int[] arr,int k){
        int low=0,high=arr.length-1;
        while(low<high){
            int mid=(low+high)/2;
            int sum=arr[low]+arr[high];
            if(sum>k)
                high=mid;
            else if(sum<k)
                low=mid;
            else{
                System.out.println(arr[low]+"+"+arr[high]);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] arr={2,4,8,9,11,12,20,30};
        System.out.println(closest(arr,23));
    }*/
/*
    public static int ispair(int [] arr,int low,int high, int k){
        while(low<high){
            int sum=arr[low]+arr[high];
            if(sum==k){
                System.out.print(arr[low]+"+"+arr[high]+"+");
                return k;}
            if(sum>k)
                high--;
            else
                low++;
        }
        return -1;
    }

    public static boolean pair_3(int[] arr, int k){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(k==arr[i]+ispair(arr,i+1,n-1,k-arr[i])){
                System.out.println(arr[i]);
                return true;}
        }
        return false;
    }

    public static void main(String[] args){
        int[] arr={2,3,4,7,9,20,40};
        System.out.println(pair_3(arr,41));
    }
*/
    /*
    public static boolean pair(int[] arr,int k,int low,int high) {
        while(low<high){
            int sum=(arr[low]*arr[low])+(arr[high]*arr[high]);
            if(sum==k)
                return true;
            else if(sum>k)
                high--;
            else
                low++;
        }
        return false;
    }

    public static boolean theorum(int [] arr){
        int n=arr.length;
        for(int i=n-1;i>0;i--){
            boolean res=pair(arr,arr[i]*arr[i],0,i-1);
            if(res==true)
                return true;
        }
        return false;
    }

    public static void main(String[] args){
        int[] arr={2,3,4,4,4,8,9,20,25,40};
        System.out.println(theorum(arr));
    }*/
/*
    public static double median(int[] arr,int[] arr1,int n, int m) {
        int low=0,high=n;
        while(low<=high){
            int i1=(low+high)/2, i2=((n+m)/2)-i1;

            int r1 = (i1 >= n) ? Integer.MAX_VALUE : arr[i1];
            int r2 = (i2 >= m) ? Integer.MAX_VALUE : arr1[i2];
            int l1 = (i1 <= 0) ? Integer.MIN_VALUE : arr[i1 - 1];
            int l2 = (i2 <= 0) ? Integer.MIN_VALUE : arr1[i2-1];

            if(r1>=l2 && r2>=l1){
                if((m+n)%2==0){
                    return (double)(Math.min(r1,r2)+Math.max(l1,l2))/2;}
                else
                    return (float)Math.min(r1,r2);}
            else if(r1<l2){
                low=i1+1;
            }
            else if(r2<l1)
                high=i1-1;
            }
        return -1;
    }

    public static double seq(int[] a1,int [] a2){
        int n=a1.length,m=a2.length;
        return n>m? median(a2,a1,m,n) : median(a1,a2,n,m);
    }

    public static void main(String[] args){
        int a1[] = {1,2,3,4,5,6,7},a2[] = {8,9};
        System.out.println(seq(a1,a2));
    }
*/
/*
    public static int repeat(int [] arr){
        int n=arr.length;
        int[] a1=new int[n-1];
        for(int i=0;i<n;i++){
            if(a1[arr[i]]==1)
                return arr[i];
            else
                a1[arr[i]]=1;
        }
        return -1;
    }

    public static int repeating(int[] arr){
        int low=arr[0]+1,high=arr[0]+1;
        do{
            low=arr[low]+1;
            high=arr[arr[high]+1]+1;
        }while(low!=high);

        low=arr[0]+1;
        while(low!=high){
            low=arr[low]+1;
            high=arr[high]+1;
        }
        return high-1;
    }

    public static void main(String[] args){
        int[] arr={0,2,1,3,5,4,6,2};
        System.out.println(repeat(arr));
        System.out.println(repeating(arr));
    }
*/

    public static boolean check(int[] arr,int n, int k,int mid){
        int sum=0,person=1;
        for(int i=0;i<n;i++){
            if(sum+arr[i]>mid){
                sum=arr[i];
                person++;
            }
            else
                sum+=arr[i];
        }
        return person<=k;

    }

    public static int minimize(int[] arr,int k){
        int n=arr.length,high=0,low=arr[0];
        for(int i=0;i<n;i++) {
            if(low < arr[i])
                low = arr[i];
            high += arr[i];
        }
        int res=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(check(arr,n,k,mid)){
                res=mid;
                high=mid-1;}
            else
                low=mid+1;
        }
        return res;
    }

    public static void main(String[] args){
        int[] arr={10,5,30,1,2,5,10,10};
        int k=3;
        System.out.println(minimize(arr,k));
    }

}