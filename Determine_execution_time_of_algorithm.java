package exercise;

public class Determine_execution_time_of_algorithm {

    public static void main(String[] args) {

        StopwatchP n1 = new StopwatchP();

        int[] numbers = new int[100000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100000);
        }

        n1.start();


        selectionSort(numbers);


        n1.stop();


 System.out.println("The time executed is about " + n1.gettimeof() + " milliseconds");
    }


    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

  for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}

class StopwatchP {

    private long startTime;
    private long endTime;

    public StopwatchP() {
        this.startTime = System.currentTimeMillis();
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long gettimeof() {
        return this.endTime - this.startTime;
    }
}
