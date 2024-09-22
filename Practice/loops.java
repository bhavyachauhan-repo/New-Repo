package Practice;

public class loops {

    static void reverseNo(int n,int k){
        
        for(int i=n;i>=k;i--)
        System.out.print(i);
    }

    static void square(int n){
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print('#');
            }
            System.out.println();

        }
    }
    

    static void rightFcaedTri(int n){
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print('#');
            }
            System.out.println();
    
            }

    }

    static void rightFcaedTri(int n){
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print('#');
            }
            System.out.println();
    
            }

    }

    static void rightFcaedTri(int n){
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print('#');
            }
            System.out.println();
    
            }

    }

    static void leftFcaedTri(int n){
        for (int i=0;i<=n;i++){
            for(int k=0;k<=n-i;k++){
                System.out.print( ' ');
            }
            for(int j=1;j<=i;j++){
                System.out.print('#');
            }
            System.out.println();
    
            }

    }   

    

    public static void main(String[] args) {
        int n=5;
        int k=0;

        square(n);
        rightFcaedTri(n);
        leftFcaedTri(n);
        reverseNo(n,k);
    }

}