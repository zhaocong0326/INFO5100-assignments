public class Questions4And5 {
    // Q4
    public int[][] multiply(int[][] A, int[][] B) {

        int[][] C = new int[A.length][B[0].length];

        for(int i=0; i<C.length; i++){
            for(int j=0; j<A[0].length; j++){
                if(A[i][j]!=0){
                    for(int k=0; k<C[0].length; k++){
                        C[i][k] += A[i][j]*B[j][k];
                    }
                }
            }
        }

        return C;
    }

    //Q5
    public int[] diStringMatch(String S) {
        int n = S.length(), left = 0, right = n;
        int[] result = new int[n + 1];
        for (int i = 0; i < n; ++i) {
            if (S.charAt(i) == 'I') {
                result[i] = left;
                left++;
            } else {
                result[i] = right;
                right--;
            }
        }
        result[n] = left;
        return result;
    }
}
