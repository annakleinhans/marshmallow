public class Runner {
    //your main containing tests and output
    public static void main(String[] args) {


        System.out.println(sleepIn(true, true));

        System.out.println(stringTimes("hey", 4));

        System.out.println(helloName("Albinson"));

        System.out.println(starOut("*a"));

        System.out.println(countYZ("fez day"));
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(fix23(arr));

        System.out.println(bigDiff(arr));

        System.out.println(canBalance(arr));

        System.out.println(caughtSpeeding(77, true));

        System.out.println(loneSum(1, 2, 3));
    }


    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }

    //stringTimes
    public static String stringTimes(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + str;
        }
        return result;
    }

    //helloName
    public static String helloName(String name) {

        return "Hello " + name + "!";
    }

    //starOut
    public static String starOut(String str) {
        String word = "";

        for (int i = 1; i < str.length() - 2; i++) {
            if (str.substring(i, i + 1) != "*" && str.substring(i - 1, i) != "*" && str.substring(i + 1, i + 2) != "*") {
                word = word + str.substring(i, i + 1);
            }
        }
        return word;
    }


    //countYZ
    public static int countYZ(String str) {
        int count = 0;
        str = str.toLowerCase() + " ";
        for (int i = 0; i < str.length() - 1; i++)
            if ((str.charAt(i) == 'y' || str.charAt(i) == 'z')
                    && !Character.isLetter(str.charAt(i + 1)))
                count++;
        return count;
    }


    //fix23
    public static int[] fix23(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3) {
                nums[i + 1] = 0;
            }
        }
        return nums;
    }

    //bigDiff
    public static int bigDiff(int[] nums) {
        int minimum = nums[0];
        int maximami = nums[0];

        for (int i = 0; i < nums.length; i++) {
            minimum = Math.min(minimum, nums[i]);
            maximami = Math.max(maximami, nums[i]);
        }
        return maximami - minimum;
    }

    //canBalance
    public static boolean canBalance(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++) sum += nums[j];
            for (int j = i; j < nums.length; j++) sum -= nums[j];
            if (sum == 0) return true;
        }
        return false;
    }

    //caughtSpeeding
    public static int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday == true) {
            if (speed <= 65) {
                return 0;
            }
            if (speed >= 66 && speed <= 85) {
                return 1;
            }
            if (speed >= 86) {
                return 2;
            }
        }
        if (isBirthday == false) {
            if (speed <= 60) {
                return 0;
            }
            if (speed >= 61 && speed <= 80) {
                return 1;
            }
            if (speed >= 81) {
                return 2;
            } else {
                return 0;
            }
        }
        return 0;
    }

    //loneSum
    public static int loneSum(int a, int b, int c) {
        if (a == b && b == c) {
            return 0;
        }
        if (a == b) {
            return c;
        }
        if (b == c) {
            return a;
        }
        if (a == c) {
            return b;
        } else {
            return a + b + c;
        }
    }
}