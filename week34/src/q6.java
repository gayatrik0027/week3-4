class q6 {

    static void floorCeiling(int arr[], int target) {

        int floor = -1;
        int ceil = -1;

        int low = 0, high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                floor = ceil = arr[mid];
                break;
            }

            if (arr[mid] < target) {
                floor = arr[mid];
                low = mid + 1;
            } else {
                ceil = arr[mid];
                high = mid - 1;
            }
        }

        System.out.println("Floor=" + floor);
        System.out.println("Ceiling=" + ceil);
    }

    static void linearSearch(int arr[], int target) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                System.out.println("Found at index " + i);
                return;
            }
        }

        System.out.println("Not Found");
    }

    public static void main(String[] args) {

        int risks[] = {10, 25, 50, 100};

        linearSearch(risks, 30);

        floorCeiling(risks, 30);
    }
}