import java.util.ArrayList;

public class No4 {
    public static void main(String[] args) {
        double arr[] = { 9, 5, 9, 5, 8 };
        AscendSortFreq asc = new AscendSortFreq(arr);
        asc.printArray(arr);
        arr = asc.AscendSort(asc.A);
        asc.printArray(arr);
        asc.printStuctureUnique(arr);
        asc.printStuctureFreq(arr);
    }
}

class AscendSortFreq {
    double[] A;

    public void print() {
        for (double d : A) {
            System.out.println(d);
        }
    }

    AscendSortFreq(double[] A) {
        this.A = new double[A.length];
        for (int i = 0; i < A.length; i++) {
            this.A[i] = A[i];
        }
    }

    public double[] AscendSort(double[] A) {
        double[] tempArr = new double[A.length];

        // copy arr to tempArr
        for (int i = 0; i < tempArr.length; i++) {
            tempArr[i] = A[i];
        }
        // sort
        for (int i = 0; i < tempArr.length; i++) {
            for (int j = 0; j < tempArr.length - i - 1; j++) {
                if (tempArr[j] > tempArr[j + 1]) {
                    double temp = tempArr[j];
                    tempArr[j] = tempArr[j + 1];
                    tempArr[j + 1] = temp;
                }
            }
        }
        return tempArr;
    }

    public void printArray(double[] arr) {
        for (double d : arr) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    public void printStuctureUnique(double[] arr) {
        System.out.print("unique number:\t ");
        double[] uniqueArray = getUnique(arr);
        printArray(uniqueArray);
    }

    public void printStuctureFreq(double[] arr) {
        System.out.print("Frequency:\t");
        double[] FredArr = SortCommuFreq(arr);
        printArray(FredArr);
    }

    public double[] getUnique(double[] C) {
        ArrayList<Double> al = new ArrayList<>();
        al.add(C[0]);
        for (int i = 0; i < C.length; i++) {
            boolean notFound = true;
            for (int j = 0; j < al.size(); j++) {
                if (C[i] == al.get(j)) {
                    notFound = false;
                }
            }
            if (notFound) {
                al.add(C[i]);
            }
        }
        double[] out = new double[al.size()];
        for (int i = 0; i < out.length; i++) {
            out[i] = al.get(i);
        }
        return out;
    }

    public double[] SortCommuFreq(double[] B) {
        double[] tempArr = this.AscendSort(B);
        double[] sortedunique = this.getUnique(tempArr);
        double[] freq = new double[sortedunique.length];
        for (int i = 0; i < sortedunique.length; i++) {
            for (int j = 0; j < tempArr.length; j++) {
                if (sortedunique[i] == tempArr[j]) {
                    freq[i]++;
                }
            }
        }
        return freq;
    }
}
