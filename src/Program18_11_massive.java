// Find Prime number
import java.io.PrintStream;
import java.util.*;

public class Program18_11_massive {
	
	public static void main(String[] args) {
        PrintStream out = System.out;
        out.print("������, ����������� ���������� �������");
        int maxRange = 100;
        // ���������� � �������� �������
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random() * (maxRange + 1));
            out.print("\t" + a[i]);
        }
        System.out.println();
        // ����� ������������ � ������������� ��������
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
        out.println("����������� �������� " + min + " � �������� � �������� " + imin);
        out.println("������������ �������� " + max + " � �������� � �������� " + imax);
    }
}