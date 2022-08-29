package problemSolving;

public class MirroringArrayMain {

    public static boolean mirroringArray(int[] arr) {

        int size = arr.length;

        if (size % 2 == 0) {
            return false;
        } else {
            for (int i = 0; i < ((size - 1) / 2); i++) {
                if (arr[i] != arr[size-1 - i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[] array = {7,1,2, 3, 5, 0, 5, 3, 2,1,7};
        System.out.println(mirroringArray(array));

    }
}
