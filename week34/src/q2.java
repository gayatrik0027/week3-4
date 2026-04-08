class q2 {

    static class Client {
        String name;
        int riskScore;
        int balance;

        Client(String name, int riskScore, int balance) {
            this.name = name;
            this.riskScore = riskScore;
            this.balance = balance;
        }

        public String toString() {
            return name + ":" + riskScore;
        }
    }

    static void bubbleSort(Client[] arr) {
        int swaps = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j].riskScore > arr[j + 1].riskScore) {

                    Client temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
        }

        System.out.println("Bubble Ascending:");
        for (Client c : arr)
            System.out.print(c + " ");
        System.out.println("\nSwaps=" + swaps);
    }

    static void insertionSort(Client[] arr) {

        for (int i = 1; i < arr.length; i++) {

            Client key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].riskScore < key.riskScore) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        System.out.println("Insertion Desc:");
        for (Client c : arr)
            System.out.print(c + " ");
    }

    static void topRisk(Client[] arr) {
        System.out.println("\nTop Risks:");
        for (int i = 0; i < Math.min(10, arr.length); i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        Client[] clients = {
                new Client("clientC", 80, 5000),
                new Client("clientA", 20, 8000),
                new Client("clientB", 50, 6000)
        };

        bubbleSort(clients);
        insertionSort(clients);
        topRisk(clients);
    }
}