import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    static double printResult(File file) throws FileNotFoundException {
        double result = 0;
        Scanner myReader = new Scanner(file);
/*        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            String[] strArr = data.split(" ");
            Integer[] intArr = new Integer[strArr.length];
            int j = 0;
            for(String str : strArr){
                intArr[j] = Integer.parseInt(str.trim());
                j++;
            }
            double sum = 0;
            for (Integer integer : intArr) {
                sum += integer;
            }
            result = sum / intArr.length);
        }*/
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            result = Arrays.stream(data.split(" ")).mapToInt(Integer::parseInt).average().getAsDouble();
        }
        myReader.close();
        return result;
    }

    static double printSumResult(File file) throws FileNotFoundException {
        double result = 0;
        Scanner myReader = new Scanner(file);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            result = Arrays.stream(data.split(" ")).mapToDouble(Double::parseDouble).sum();
        }
        myReader.close();
        return result;
    }


    public static void main(String[] args) {
        try {
            File file = new File("filename.txt");
            File file1 = new File("file1.txt");
            File file2 = new File("file2.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
            if (file1.createNewFile()) {
                System.out.println("File1 created: " + file.getName());
            } else {
                System.out.println("File1 already exists.");
            }
            if (file2.createNewFile()) {
                System.out.println("File2 created: " + file.getName());
            } else {
                System.out.println("File2 already exists.");
            }
            Random rd = new Random(100); //для повторяемости используем один и тотже сид
            int[] intArr = new int[1000];
            for(int i = 0; i < intArr.length; i++){
                intArr[i] = rd.nextInt(100);
            }
            String temp=Arrays.toString(intArr);
            String[] arr =temp.substring(1,temp.length()-1).split(", ");
            String input = String.join(" ", arr);
            FileWriter myWriter = new FileWriter(file1);
            myWriter.write(input);
            myWriter.close();
            Scanner myReader = new Scanner(file1);
            String data="";
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
            }
            myReader.close();
            int[] array = Arrays.stream(data.split(" ")).mapToInt(Integer::parseInt).toArray();
            StringBuilder strBuffer = new StringBuilder("");
            for (int k = 1; k < array.length/20;k++){
                int n = 20*k;
                double sum = 0;
                for (int i = 0;i < 20;i++){
                    sum += array[n+i];
                }
                double avg = sum / 20;
                String str = Double.toString(avg);
                strBuffer.append(" ").append(str);
            }
            String inp = strBuffer.toString().trim();
            FileWriter myWriter2 = new FileWriter(file2);
            myWriter2.write(inp);
            myWriter2.close();
            double a = printResult(file);
            System.out.println(a);
            System.out.printf("%.2f", a);
            System.out.println();
            double b = printSumResult(file2);
            System.out.printf("%.0f", b);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
