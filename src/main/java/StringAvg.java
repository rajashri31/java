public class StringAvg {

    public String FindAvg(String[] strArray) {
        String avgStr=null;

        if(strArray.length == 0 )
            return "NA";

        int[] numArray = new int[strArray.length];
        for(int i =0; i< strArray.length;i++)
        {
            numArray[i] = convertToNumber(strArray[i]);
            if(numArray[i] == 100)
                return "NA";

        }

        int sum=0;
        for(int i=0;i< numArray.length;i++)
        {
            sum = sum + numArray[i];
        }
        int avg = sum / numArray.length;
        return convertToString(avg);

    }

    int convertToNumber(String str) {
        int number = 0;
        switch (str) {
            case "zero":
                number = 0;
                break;
            case "one":
                number = 1;
                break;
            case "two":
                number = 2;
                break;
            case "three":
                number = 3;
                break;
            case "four":
                number = 4;
                break;
            case "five":
                number = 5;
                break;
            case "six":
                number = 6;
                break;
            case "seven":
                number = 7;
                break;
            case "eight":
                number = 8;
                break;
            case "nine":
                number = 9;
                break;
            default:
                number = 100;
        }
        return number;
    }

    String convertToString(int number) {
        String str ="";
        switch (number) {
            case 0:
                str = "zero";
                break;
            case 1:
                str = "one";
                break;
            case 2:
                str = "two";
                break;
            case 3:
                str = "three";
                break;
            case 4:
                str = "four";
                break;
            case 5:
                str = "five";
                break;
            case 6:
                str = "six";
                break;
            case 7:
                str = "seven";
                break;
            case 8:
                str = "eight";
                break;
            case 9:
                str = "nine";
                break;

        }
        return str;
    }
}
