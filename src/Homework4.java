import java.util.Arrays;
import java.util.Scanner;

public class Homework4 {


        public static void main(String[] args) {
            System.out.println("Введите номер задания от  1 до 8  ");
            Scanner numTas = new Scanner(System.in);
            int numTask = numTas.nextInt();
            switch (numTask) {
                case 1:
                    // Создайте массив целых чисел. Напишете программу, которая выводит
                    // сообщение о том, входит ли заданное число в массив или нет.
                    //   Пусть число для поиска задается с консоли (класс Scanner).
                    System.out.println("Введите число для поиска в массиве");
                    Scanner numFin = new Scanner(System.in);
                    int numFind = numFin.nextInt();
                    int[] massiw = {1, 2, 3, 56, 77, 88, 19};
                    for (int i = 0; i < massiw.length; i++) {
                        if (numFind == massiw[i]) {
                            System.out.println("Ваше число входит в массив");
                            break;
                        }
                        if (i == massiw.length - 1) {
                            System.out.println("Ваше число  не входит в массив");

                        }
                    }
                    break;
                case 2:
                    //Создайте массив целых чисел. Удалите все вхождения заданного
                    //числа из массива.
                    //Пусть число задается с консоли (класс Scanner). Если такого числа нет -
                    // выведите сообщения об этом.
                    //В результате должен быть новый массив без указанного числа.
                    System.out.println("Введите число для удаления из массива");
                    Scanner numDel = new Scanner(System.in);
                    int numDelete = numDel.nextInt();
                    int[] massiw2 = {1,2, 3, 3,2,56, 77, 88, 19,1,2,2};
                    int licz = 0;
                    for (int i = 0; i < massiw2.length; i++) {
                        if (numDelete == massiw2[i]) {
                            licz++;
                            //for (int j=0;j<i;j++){
                            //newMassiw2[j]=massiw2[j];
                            //}
                            // for(int index=i;index<massiw2.length-1;index++){
                            //  newMassiw2[index]=massiw2[index+1];
                            //}
                            //break;
                        }
                    }
                    System.out.println(licz);
                    int[] newMassiw2 = new int [massiw2.length-licz];
                    System.out.println(Arrays.toString(newMassiw2));
                    for (int i = 0,j=0; i < massiw2.length;){
                        if (numDelete == massiw2[i]){i++;}
                        else {newMassiw2[j]=massiw2[i];
                            j++;
                            i++;}
                    }
                    //System.out.println(licz);
                    System.out.println(Arrays.toString(newMassiw2));
                    break;
                case 3:
                    // Создайте и заполните массив случайным числами и выведете
                    //максимальное, минимальное и среднее значение.
                    //  Для генерации случайного числа используйте метод Math.random().
                    //Пусть будет возможность создавать массив произвольного размера.
                    //Пусть размер массива вводится с консоли.
                    System.out.println("Введите размер одномерного массива");
                    Scanner ilosc = new Scanner(System.in);
                    int ilos = ilosc.nextInt();
                    double [] arr = new double[ilos];
                    for (int i=0;i<arr.length;i++){
                        arr[i]=Math.random();
                    }
                    System.out.println(Arrays.toString(arr));
                    double max=0,min=arr[0],sr=0,srarifm;
                    for (int i=0;i<arr.length-1;i++){
                        if (max<arr[i]){
                            max=arr[i];
                        }
                        //else {max=arr[i];}
                        //System.out.println(max);
                    }
                    System.out.println(max);
                    for (int i=0;i<arr.length-1;i++){
                        if (min<arr[i+1]){

                        }
                        else {min=arr[i+1];}
                        System.out.println(min);
                    }
                    System.out.println(min);
                    for(int i=0;i<arr.length;i++)
                    {sr+=arr[i];}
                    srarifm=sr/arr.length;
                    System.out.println(sr);
                    System.out.println(srarifm);

                    break;
                case 4:
                    //Создайте 2 массива из 5 чисел.
                    // Выведите массивы на консоль в двух отдельных строках.
                    // Посчитайте среднее арифметическое элементов каждого массива и
                    // сообщите, для какого из массивов это значение оказалось больше (либо
                    //   сообщите, что их средние арифметические равны).
                    int [] arr1 = {2,4,54,78,54};
                    int [] arr2 = {4,4,2,56,45,24};
                    int sr1=0,sr2=0,srarifm1,srarifm2;
                    for(int i=0;i<arr1.length;i++)
                    {sr1+=arr1[i];}
                    srarifm1=sr1/arr1.length;
                    System.out.println(sr1);
                    System.out.println(srarifm1);
                    for(int i=0;i<arr2.length;i++)
                    {sr2+=arr2[i];}
                    srarifm2=sr2/arr2.length;
                    System.out.println(sr2);
                    System.out.println(srarifm2);
                    if(srarifm1>srarifm2){
                        System.out.println("Среднее арифметич 1 массива больше чем 2 массива");
                    } else if (srarifm1==srarifm2) {
                        System.out.println("Среднее арифметич 1 массива равно среднему  2 массива");
                    }else {
                        System.out.println("Среднее арифметич 1 массива меньше чем 2 массива");
                    }


                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;


            }
        }
    }



