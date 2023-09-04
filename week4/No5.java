import java.util.Scanner;

public class No5 {
    public static void main(String[] args) {

    }
}

class Matrix {
    double matrix[][];
    int m, n;

    public Matrix(int m, int n) {
        this.m = m;
        this.n = n;
        matrix = new double[m][n];
    }

    public Matrix mulWith(Matrix incoming) {
        Matrix result = new Matrix(m, incoming.n);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < incoming.n; j++) {
                double sum = 0.0;
                for (int k = 0; k < n; k++) {
                    sum += matrix[i][k] * incoming.matrix[k][j];
                }
                result.matrix[i][j] = sum;
            }
        }

        return result;
    }
}