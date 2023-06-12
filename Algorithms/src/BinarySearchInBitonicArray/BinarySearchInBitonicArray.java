package BinarySearchInBitonicArray;

public class BinarySearchInBitonicArray {


    public static int search(int[] bitonicArr, int numberWanted) {
        int maxIndex = findMaxElement (bitonicArr);
        int numberWantedIndex = binarySearch (bitonicArr, 0, maxIndex, numberWanted);

        if (numberWantedIndex != -1) {
            return numberWantedIndex;
        } else {
            return binarySearch (bitonicArr, maxIndex + 1, bitonicArr.length - 1, numberWanted);
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

                //else if ((a[start] < a[end] && target < a[mid]) || (a[start] > a[end] && target > a[mid]))
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

