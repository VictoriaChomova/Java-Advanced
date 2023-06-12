package BinarySearchRecursive;

public class BinarySearch {

    public int binarySearch(int numbersArr[], int leftIndex, int rightIndex, int numberWanted) {
        if (rightIndex >= leftIndex && leftIndex <= numbersArr.length - 1) {
            int mid = leftIndex + (rightIndex - leftIndex) / 2;
            if (numbersArr[mid] == numberWanted) {
                return mid;
            } else if (numbersArr[mid] > numberWanted) {
                return binarySearch (numbersArr, leftIndex, mid - 1, numberWanted);
            } else {
                return binarySearch (numbersArr, mid + 1, rightIndex, numberWanted);
            }
        }

        return -1;

    }
}
