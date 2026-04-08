class q5 {

    static int linearSearch(String arr[], String target) {

        int comparisons = 0;

        for (int i = 0; i < arr.length; i++) {
            comparisons++;

            if (arr[i].equals(target)) {
                System.out.println("Found at index " + i);
                System.out.println("Comparisons=" + comparisons);
                return i;
            }
        }

        return -1;
    }

    static int binarySearch(String arr[], String target) {

        int low = 0, high = arr.length - 1;
        int comparisons = 0;

        while (low <= high) {

            comparisons++;

            int mid = (low + high) / 2;

            if (arr[mid].equals(target)) {
                System.out.println("Binary Found at index " + mid);
                System.out.println("Comparisons=" + comparisons);
                return mid;
            }

            if (arr[mid].compareTo(target) < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        String logs[] = {"accA", "accB", "accB", "accC"};

        linearSearch(logs, "accB");
        binarySearch(logs, "accB");
    }
}