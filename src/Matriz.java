public class Matriz {



    public static void main(String[] args) {
        int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Diagonal principal");
        for(int k=0;k<3;k++) {
            System.out.print(mat[k][k]+" ");
        }
    }
}
