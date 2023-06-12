package BitonicSearchInTwoThreads;

public class BitonicSearchInTwoThreads {


    public static void search(int[] bitonicArr, int numberWanted, int thread) {
        int maxIndex = findMaxElement (bitonicArr);
        int numberWantedIndex = -1;
        if (thread == 1) {
            numberWantedIndex = binarySearch (bitonicArr, 0, maxIndex, numberWanted);
        } else if (thread == 2) {
            numberWantedIndex = binarySearch (bitonicArr, maxIndex + 1, bitonicArr.length - 1, numberWanted);
        }

        if (numberWantedIndex != -1) {
            System.out.println ("Number found at index: " + numberWantedIndex);
        }
    }


    public static int findMaxElement(int[] bitonicArr) {
        int maxElIndex = -1;
        int maxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < bitonicArr.length; i++) {

            if (bitonicArr[i] > maxNumber) {
                maxNumber = bitonicArr[i];
                maxElIndex = i;
            }
            if (i != 0 && bitonicArr[i] < bitonicArr[i - 1]) {
                break;
            }
        }

        return maxElIndex;
    }

    public static int binarySearch(int[] numbersArr, int leftIndex, int rightIndex, int numberWanted) {
        if (rightIndex >= leftIndex && leftIndex <= numbersArr.length - 1) {
            int mid = leftIndex + (rightIndex - leftIndex) / 2;
            if (numbersArr[mid] == numberWanted) {
                return mid;
            } else if (numbersArr[leftIndex] < numbersArr[rightIndex] && numberWanted < numbersArr[mid] ||
                    numbersArr[leftIndex] > numbersArr[rightIndex] && numberWanted > numbersArr[mid]) {
                return binarySearch (numbersArr, leftIndex, mid - 1, numberWanted);
            } else {
                return binarySearch (numbersArr, mid + 1, rightIndex, numberWanted);
            }
        }

        return -1;

    }
}
