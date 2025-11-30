package exercice2;

import java.util.*;

public class MainFile {
    public static void main(String[] args) {
        List<Integer> nums = FileUtil.readNumbers("file.in");
        List<Integer> nums2 = FileUtil.readNumbers("number.in");
        
        System.out.println("Nombres lus : " + nums);
        System.out.println("Nombres lus : " + nums2);
    }
}