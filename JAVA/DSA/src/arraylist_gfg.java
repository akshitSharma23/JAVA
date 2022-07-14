import java.util.*;

public class arraylist_gfg {
/*
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner in=new Scanner(System.in);
        for (int i = 0; i < 6; i++)
            arr[i] = in.nextInt();
        for(int i=0;i<6;i++)
            System.out.print(arr[i]+" ");
        ArrayList<Integer> al=new ArrayList<Integer>(4);
        for(int i=0;i<6;i++){
            al.add(in.nextInt());
        }
        System.out.println(al);
    }*/
/*
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<Integer>();
        System.out.println("enter the size of arraylist");
        int n=in.nextInt();
        for(int i=0;i<n;i++)
            arr.add(in.nextInt());
        for(int i=0;i<n;i++)
            System.out.print(arr.get(i)+" ");
    }
}*/
/*
    public static int search(int[] arr ,int n ,int a){
        for(int i=0;i<n;i++)
            if(a==arr[i])
                return(i);
        return -1;
    }

    public static void main(String[] args){
        int[] arr={10,20,30,40,50};
        System.out.println(search(arr,arr.length,40));
    }*/
/*
    public static void insert(int[] arr, int n, int x, int pos){
        if(pos>n){
            System.out.println("can't insert ");
            return;}
        for(int i=n-1;i>pos-1;i--)
            arr[i]=arr[i-1];
        arr[pos-1]=x;
    }

    public static void main(String[] args){
        int[] arr=new int[10];
        arr[0]=10;
        arr[1]=10;
        arr[2]=10;
        arr[3]=10;
        arr[4]=10;
        arr[5]=10;
        for(int i=0;i<10;i++)
            System.out.print(arr[i]+" ");
        insert(arr,arr.length,30,10);
        System.out.println();
        for(int i=0;i<10;i++)
            System.out.print(arr[i]+" ");
    }*/
/*
    public static void del(
            int[] arr, int n, int x){
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                for(int j=i;j<n-1;j++){
                    arr[j]=arr[j+1];
                    i=j;
                }
                arr[n-1]=0;
                return;};
        }
    }

    public static void main(String[] args){
        int[] arr={10,20,30,40,50};
        del(arr,arr.length,10);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }*/
/*
    public static int largest(int[] arr)
    {
        int x=0;
        for(int i=1;i<arr.length;i++)
            if(arr[x]<arr[i])
                x=i;
        return x;
    }

    public static void main(String[] args){
        int[] arr={10,20,90,40,50};
        System.out.println(arr[largest(arr)]);
    }
 */
/*
    public static int slarge(int[] arr) {
        int l = 0;
        int s = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[l] < arr[i])
                l = i;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=arr[l])
                if(s==-1)
                    s = i;
                else if(arr[s]<arr[i])
                    s=i;
            }
        return s;
        }
*/
    /*
    public static int slarge(int[] arr) {
        int l = 0;
        int s = -1;
        int pos=l;
        for (int i = 1; i < arr.length; i++) {
            if (arr[l] < arr[i]){
                s=l;
                l=i;
            }
            if(arr[i]!=arr[l])
                if(s==-1)
                    s=i;
                else if(arr[i]>arr[s])
                    s=i;
        }
        return s;
    }


    public static void main(String[] args){
        int[] arr={20,10,20,18,12};
        System.out.println(slarge(arr));
    }
     */
/*
    public static int s_large(int[] arr){
        int l=0;
        int s=-1;
        for (int i=1;i<arr.length;i++){
            if(arr[i]>arr[l]){
                s=l;
                l=i;}
            if(arr[i]!=arr[l])
                if(s==-1 || arr[s]<arr[i])
                    s=i;
        }
        return s;
    }

    public static void main(String[] args){
        int[] arr={5,20,12,20,8};
        System.out.println(s_large(arr));
    }*/
/*
    public static boolean issorted(int[] arr){
        for(int i=1;i<arr.length;i++)
            if(arr[i-1]>arr[i])
                return false;
        return true;
    }

    public static void main(String[] args){
        int[] arr={100,20,200};
        System.out.println(issorted(arr));
    }*/
/*
    public static void rev(int[] arr){
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            int a=arr[n-1-i];
            arr[n-1-i]=arr[i];
            arr[i]=a;
            }
    }

    public static void main(String[] args){
        int[] arr={30,20,5};
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]+" ");
        System.out.println();
        rev(arr);
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]+" ");
    }*/
/*
    public static int dup(int[] arr){
        int a=0;
        for(int i=1;i<arr.length;i++){
            if(arr[a]==arr[i]){
                continue;
            }
            else{
                a++;
                arr[a]=arr[i];
            }
        }
        return a;
    }

    public static void main(String[] args){
        int[] arr={10,10,10,10,10,10};
        int a=dup(arr);
        for(int i=0;i<=a;i++)
            System.out.println(arr[i]+" ");
    }*/
/*
    public static void zero(int [] arr){
        int a=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0 && a==-1) {
                a = i;
            }
//            if(arr[i]==0 && a!=-1){
//                continue;
//            }
            else if(arr[i]!=0 && a!=-1){
                arr[a]=arr[i];
                arr[i]=0;
                a++;
            }
        }
    }

    public static void main(String[] args){
        int [] arr={0,0,8,0,5,0,0,10,0,20};
        zero(arr);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }*/
/*
    public static void c_clock(int[] arr){
        int a=arr[0];
        int n=arr.length-1;
        for(int i=0;i<n;i++){
            arr[i]=arr[i+1];
        }
        arr[n]=a;
    }

    public static void main(String[] args){
        int[] arr={12,13,14,15,16,17};
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
        c_clock(arr);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
*/
/*
    public static void d(int[] arr, int x){
        int n=arr.length;
        rev(arr,0,x-1);
        rev(arr,x,n-1);
        rev(arr,0,n-1);
    }
    public static void rev(int arr[],int low,int high){
        while(low<high){
            int k=arr[low];
            arr[low]=arr[high];
            arr[high]=k;
            low++;
            high--;
        }
    }

    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
        d(arr,2);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
*/
/*
    public static void leder(int[] arr){
        int n=arr.length;
        int k=arr[n-1];
        System.out.println(k);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>k){
                System.out.println(arr[i]);
                k=arr[i];
            }
        }
    }

    public static void main(String[] args){
        int [] arr={7,10,4,3,6,5,2};
        leder(arr);
    }
*/
/*
    public static int max_dis(int [] arr){
        int n=arr.length;
        int d=arr[1]-arr[0];
        int mim=arr[0];
        for(int j=1;j<n;j++){
            d=Math.max(arr[j]-mim,d);
            mim=Math.min(mim,arr[j]);
        }
        return d;
    }

    public static void main(String[] args){
        int [] arr={30,10,8,2};
        System.out.println(max_dis(arr));
    }*/
/*
    public static void freq(int[] arr){
        int n=arr.length;
        int h=0;
        int c=1;
        for(int i=1;i<n;i++){
            if(arr[h]==arr[i] && n-1!=i){
                c++;
            }
            else{
                System.out.println(arr[i-1]+" --> "+c);
                h=i;
                c=1;
            }
        }
        if(n>0)
            System.out.println(arr[n-1]+" --> "+c);
        else
            System.out.println(0);
    }

    public static void main(String[] args){
        int [] arr={10,10,10,30,30,40,40,40,40,40};
        freq(arr);
//        ArrayList<Integer> array=new ArrayList<Integer>();
//        Scanner in=new Scanner(System.in);
//        while(true){
//            int k=in.nextInt();
//            if(k==-1)
//                break;
//            else
//                array.add(k);
//            }
//        for(int i=0;i< array.size();i++)
//            System.out.print(array.get(i)+" ");*
    }*/
/*
    public static int BOS(ArrayList<Integer> arr){
        int n=arr.size();
        int k=0; //profit
        int f=0; //storing current data in array
        int flag=0; //stock buy ni kia when 0
        for(int i=0;i<n-1;i++){
            if(arr.get(i)> arr.get(i + 1) && flag==0){
                continue;
            }
            else if(arr.get(i)<arr.get(i+1) && flag==0){
                flag=1;
                f=arr.get(i);
                System.out.println("buy "+f);
            }
            else if(arr.get(i)>arr.get(i+1) && flag==1){
                k=k+arr.get(i)-f;
                flag=0;
                System.out.println("sell "+arr.get(i));
            }
            else if(arr.get(i)<arr.get(i+1) && flag==1){
                continue;
            }
        }
        if(flag==1){
            k=k+arr.get(n-1)-f;
            flag=0;
            System.out.println("sell "+(arr.get(n-1)));
        }
        return k;
    }

    public static int bos(ArrayList<Integer> arr){
        int p=0,n=arr.size();
        for(int i=0;i<n-1;i++){
            if(arr.get(i)<arr.get(i+1))
                p+=arr.get(i+1)-arr.get(i);
        }
        return p;
    }
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(1);
        arr.add(5);
        arr.add(3);
        arr.add(8);
        arr.add(12);
        System.out.println(BOS(arr));
        System.out.println("\n");
        System.out.println(bos(arr));

    }*/
/*
    public static int water(int[] arr){
        int n=arr.length;
        int profit=0;
        int [] lmax=new int[n];
        int [] rmax=new int[n];
        lmax[0]=arr[0];
        for(int i=1;i<n;i++)
            lmax[i]=Math.max(arr[i],lmax[i-1]);
        rmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--)
            rmax[i]=Math.max(arr[i],rmax[i+1]);
        for(int i=1;i<n-1;i++)
            profit+=Math.min(lmax[i],rmax[i])-arr[i];
        return profit;
    }

    public static void main(String[] args){
        int[] arr={3,2,1};
        System.out.println(water(arr));
    }
*/
/*
    public static int count1(int[] arr){
        int n=arr.length,k=0,c=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0)
                c=0;
            if(arr[i]==1){
                c+=1;
                k=Math.max(k,c);
            }
        }
        return k;
    }

    public static void main(String[] args){
        int[] arr={1,0,1,1,1,1,0,1,1};
        System.out.println(count1(arr));
    }*/
/*
    public static int water(int[] arr){
        int n=arr.length;
        int h=0;
        for(int i=1;i<n-1;i++){
            int lmax=arr[i];
            for(int l=0;l<i;l++){
                lmax=Math.max(lmax,arr[l]);
            }
            int rmax=arr[i];
            for(int r=i+1;r<n;r++){
                rmax=Math.max(rmax,arr[r]);
            }
            h+=Math.min(lmax,rmax)-arr[i];
        }
        return h;
    }
*/
/*
    public static int water(int [] arr){
        int n=arr.length;
        int [] lmax=new int[n];
        int [] rmax=new int[n];
        lmax[0]=arr[0];
        for(int i=1;i<n;i++){
            lmax[i]=Math.max(lmax[i-1],arr[i]);
        }
        rmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rmax[i]=Math.max(rmax[i+1],arr[i]);
        }
        int h=0;
        for(int i=1;i<n-1;i++){
            h+=Math.min(lmax[i],rmax[i])-arr[i];
        }
        return h;
    }

    public static void main(String[] args){
        int[] arr={3,0,6,2,5};
        System.out.println(water(arr));
    }*/
/*
    public static int cons(int[] arr){
        int sum=0,n=arr.length,g=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0)
                sum=0;
            if(arr[i]==1)
                sum+=1;
            g=Math.max(g,sum);
        }
        return g;
    }

    public static void main(String[] args){
        int[] arr={1,0,0,1,1,1,1,1,1,0,1,0,1,1,1,1,1};
        System.out.println(cons(arr));
    }
*/
/*
    public static int subarray(ArrayList<Integer> arr){
        int n=arr.size();
        int curr=arr.get(0);
        int sum=arr.get(0);
        for(int i=1;i<n;i++){
            curr+=arr.get(i);
            curr=Math.max(curr,arr.get(i));
            sum=Math.max(sum,curr);
        }
        return sum;
    }

    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(-5);
        arr.add(1);
        arr.add(-2);
        arr.add(3);
        arr.add(-1);
        arr.add(2);
        arr.add(-2);
        System.out.println(subarray(arr));
    }*/
/*
    public static int maxlen(int [] arr){
        int n=arr.length,count=1,res=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]%2==0 && arr[i+1]%2!=0 || arr[i]%2!=0 && arr[i+1]%2==0){
                count+=1;
                res=Math.max(res,count);}
            else
                count=1;
        }
        return res;
    }

    public static void main(String[] args){
        int [] arr={5,10,20,6,3,8};
        System.out.println(maxlen(arr));
    }*/
/*
    public static int circ(int [] arr){
        int n=arr.length;
        int k=0,sum=arr[0];
        for (int i = 0;i < n; i++) {
            k += arr[i%n];
            k = Math.max(k, arr[i%n]);
            sum = Math.max(sum, k);
        }
        k=0;
        for (int i = n/2; i <n+(n/2); i++) {
            k += arr[i%n];
            k = Math.max(k, arr[i%n]);
            sum = Math.max(sum, k);
        }
        return sum;
    }

    public static int max(int[] arr){
        int n=arr.length;
        int k=0,sum=arr[0];
        for(int i=0;i<n;i++){
            k+=arr[i];
            k=Math.max(k,arr[i]);
            sum=Math.max(sum,k);
        }
        return sum;
    }
    public static int circle(int[] arr){
        int m=max(arr);
        int k=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            k+=arr[i];
            arr[i]=-arr[i];
        }
        int f=k+max(arr);
        return Math.max(m,f);
    }

    public static void main(String[] args){
        int[] arr={5,-3,-2,6,-1,4};
        System.out.println(circ(arr));
        System.out.println(circle(arr));
    }*/
/*
    public static int majority(int[] arr){
        int n=arr.length;
        int count=1,res=0;
        for(int i=0;i<n;i++){
            if(arr[res]==arr[i])
                count++;
            else
                count--;
            if(count==0){
                res=i;
                count=1;
            }
        }
        count=0;
        for(int i=0;i<n;i++)
            if(arr[res]==arr[i])
                count++;
        if(count<=n/2)
            return -1;
        return res;
    }

    public static void main(String[] args){
        int [] arr={2,2,2,3,3,3,3,3,4,4};
        System.out.println(majority(arr));
    }*/
/*
    public static int flips(int[] arr){
        int n=arr.length;
        int l=0,r=0;
        if (arr[0]==1)
            r=1;
        else
            l=1;
        for(int i=1;i<n;i++){
            if(arr[i-1]==0 && arr[i]==1)
                r++;
            if(arr[i-1]==1 && arr[i]==0)
                l++;
        }
        if(r<l){
            for(int i=0;i<n-1;i++){
                if(arr[i]==0 && arr[i+1]==1)
                    System.out.print("change from "+(i+1)+" to ");
                if(arr[i]==1 && arr[i+1]==0)
                    System.out.println(i);
            }
            if(arr[n-1]==1 && arr[n-2]==0)
                System.out.println("change");
        }
        if(r>l){
            for(int i=0;i<n-1;i++){
                if(arr[i]==1 && arr[i+1]==0)
                    System.out.print("change from "+(i+1)+" to ");
                if(arr[i]==0 && arr[i+1]==1)
                    System.out.println(i);
            }
            if(arr[n-1]==0 && arr[n-2]==1)
                System.out.println("change");
        }
        return Math.min(r,l);
    }

    public static void main(String[] args){
        int[] arr={1,1,1};
        System.out.println(flips(arr));
    }*/

    /*public static void flip(int[] arr){
        int n=arr.length;
        int k=0;
        for(int i=1;i<n;i++){
            if(arr[i-1]!=arr[i])
                if(arr[i]!=arr[0])
                    System.out.print("start from "+i+" to ");
                else
                    System.out.println(i-1);
        }
        if(arr[0]!=arr[n-1])
            System.out.println(n-1);
    }

    public static void main(String[] args){
        int [] arr={1,1,0,0,0,1,1,1,0,0};
        flip(arr);
    }*/
/*
    public static int slide(int [] arr,int k){
        int n=arr.length,sum=arr[0],g;
        for(int i=1;i<k;i++)
            sum+=arr[i];
        g=sum;
        for(int i=k;i<n;i++){
            g=g-arr[i-k]+arr[i];
            sum=Math.max(sum,g);
        }
        return sum;
    }
    public static void main(String[] args){
        int[] arr={1,8,30,-5,20,7};
        System.out.println(slide(arr,3));
    }
*/
/*
    public static boolean Window(int[] arr,int n,int sum){
        int count=0;
        int s=0;
        for(int i=0;i<n;i++){
            if(count<sum)
                count+=arr[i];
            else if(sum<count){
                count=count-arr[s];
                s++;
                i--;
            }
            else
                return true;
        }
        return false;
    }

    public static void main(String[] args){
        int[] arr={4,7,-3,1,2};
        System.out.println(Window(arr,arr.length,9));
    }
*/
/*
    public static void bonacci(int n, int m){
        int [] bon=new int[m];
        int sum=1;
        for(int i=0;i<n-1;i++){
            bon[i]=0;
            System.out.print(bon[i]+" ");
        }
        bon[n-1]=1;
        bon[n]=1;
        System.out.print(bon[n-1]+" ");
        for(int i=n;i<m;i++){
            bon[i]=sum;
            sum=sum-bon[i-n]+bon[i];
            System.out.print(bon[i]+" ");
        }
    }

    public static void main(String[] args){
        bonacci(3,8);
    }*/
/*
    public static void prefix(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++)
            arr[i]=arr[i-1]+arr[i];
    }

    public static void getsum(int[] arr,int l,int r){
        if(l!=0)
            System.out.println(arr[r]-arr[l-1]);
        else
            System.out.println(arr[r]);
    }

    public static void main(String[] args){
        int [] arr={2,8,3,9,6,5,4};
        int n=arr.length;
        prefix(arr);
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
        getsum(arr,0,2);
        getsum(arr,1,3);
        getsum(arr,2,6);
    }*/
/*
    public static int equi(int[] arr){
        int sum=0,n=arr.length;
        for(int i=0;i<n;i++)
            sum+=arr[i];
        int lsum=0;
        for(int i=0;i<n;i++){
            if(lsum==sum-arr[i])
                return arr[i];
            else{
                lsum+=arr[i];
                sum-=arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr={4,-2,2};
        System.out.println(equi(arr));
    }*/
/*
    public static int freq(int[] l,int[]r,int n){
        int[]arr=new int[1000];
        for(int i=0;i<n;i++) {
            arr[l[i]]++;
            arr[r[i]+1]--;
        }
        int k=arr[0];
        for(int i=1;i<1000;i++){
            arr[i]+=arr[i-1];
            k=Math.max(k,arr[i]);
        }
        return k;
    }

    public static void main(String[] args){
        int[] l={1,2,3};
        int[] r={3,5,7};
        int n=l.length;
        System.out.println(freq(l,r,n));
    }*/
/*
    public static boolean diveq(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++)
            sum+=arr[i];
        if(sum%3!=0)
            return false;
        sum=sum/3;
        int rec=0;
        int temp=0;
        for(int i=0;i<arr.length;i++){
            if(temp==0)
                System.out.print("start from index "+i+" to ");
            if(rec==sum){
                i--;
                rec=0;
                System.out.println(i);
                temp=0;
            }
            else{
                rec+=arr[i];
                temp++;
            }
        }
        System.out.println(arr.length-1);
        System.out.println("the sum is "+sum);
        return true;
    }
    public static void main(String[] args){
        int[] arr={6,4,2,3,3};
        System.out.println(diveq(arr));
    }*/

    /*public static int longest(int[] arr){
        int n=arr.length,sum=0,count=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum%7==0)
                count++;
        }
        return count;
    }

    public static void main(String[] args){
        int[] arr={3,4,7,2,-3,1,4,2};
        System.out.println(longest(arr));
    }*/
}