// Find Prime number
import java.io.PrintStream;
import java.util.*;

public class Program18_11_massive {
	
	public static void main(String[] args) {
        PrintStream out = System.out;
        out.print("Массив, заполненный случайными числами");
        int maxRange = 100;
        // Объявление и создание массива
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random() * (maxRange + 1));
            out.print("\t" + a[i]);
        }
        System.out.println();
        // Поиск минимального и максимального значений
        int min = a[0], max = a[0];
        int imin = 0, imax = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
                imin = i;
            } else if (a[i] > max) {
                max = a[i];
                imax = i;
            }
        }
        out.println("Минимальное значение " + min + " у элемента с индексом " + imin);
        out.println("Максимальное значение " + max + " у элемента с индексом " + imax);
    }
}