import java.util.*;

class q4 {

    static void merge(double arr[], int l, int m, int r) {

        int n1 = m - l + 1;
        int n2 = r - m;

        double L[] = new double[n1];
        double R[] = new double[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[l + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {

            if (L[i] <= R[j])
                arr[k++] = L[i++];
            else
                arr[k++] = R[j++];
        }

        while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];
    }

    static void mergeSort(double arr[], int l, int r) {

        if (l < r) {

            int m = (l + r) / 2;

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    static int partition(double arr[], int low, int high) {

        double pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] > pivot) {

                i++;

                double temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        double temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    static void quickSort(double arr[], int low, int high) {

        if (low < high) {

            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {

        double returns[] = {12, 8, 15};

        mergeSort(returns, 0, returns.length - 1);

        System.out.println("Merge Sort:");
        System.out.println(Arrays.toString(returns));

        quickSort(returns, 0, returns.length - 1);

        System.out.println("Quick Sort Desc:");
        System.out.println(Arrays.toString(returns));
    }
}