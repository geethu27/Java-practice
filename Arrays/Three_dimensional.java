public class Three_dimensional {
    public static void main(String[] args) {
        // initializing and declaring 3D array
        int[][][] arr = new int[2][2][2];
        
        // Three dimensioanl array
        int n = arr.length;
        int m = arr[0].length;
        int o = arr[0][0].length;

        int it = 1;

        // Assingning values to array
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                for(int k=0; k<o; k++){
                    arr[i][j][k] = it;
                    it++;
                }
            }
        }
        // print the array
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                for(int k=0; k<o; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
