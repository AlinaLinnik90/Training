package demo;

public class binnarySearch {
    public static void main(String[] args) {
        int[] data = {3, 6, 7, 10, 34, 56, 60};
        int numberToFind = 26;
        int begin = 0;
        int last = data.length - 1;
        int mid = 0;
        int i;
        mid = (begin + last) / 2;
        if (data[mid] == numberToFind) {
            System.out.println(mid);
        }
        while (begin < last) {
            mid = (begin + last) / 2;
            if (data[mid] > numberToFind & (data[mid] != numberToFind)) {
                last = mid - 1;
                for (i = begin; i <= last; i++)
                    if (data[i] == numberToFind) {
                        System.out.println(i);
                    }
                break;
            } else if (data[mid] < numberToFind & data[mid] != numberToFind) {
                begin = mid + 1;
                for (i = begin; i <= last; i++)
                    if (data[i] == numberToFind) {
                        System.out.println(i);
                    }
                break;
            }
        }
    }
}


