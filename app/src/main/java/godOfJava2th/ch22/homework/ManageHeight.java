package godOfJava2th.ch22.homework;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ManageHeight {

    ArrayList<ArrayList<Integer>> gradeHeights;

    public static void main(String[] args) {
        ManageHeight manageHeight = new ManageHeight();
        manageHeight.gradeHeights = manageHeight.setData();
//        manageHeight.printHeight(5);
        manageHeight.printAverage(5);
    }

    public void printHeight(int classNo){
        for (int i=0; i<classNo; i++){
            System.out.println("Class No. : " + (i+1));
            for (Integer height : gradeHeights.get(i)){
                System.out.println(height);
            }
        }
    }

    public void printAverage(int classNo){
        for (int i=0; i<classNo; i++){
            double averageOfClass = 0L;
            double sum = 0L;
            System.out.println("Class No. : " + (i+1));
            for (Integer height : gradeHeights.get(i)){
                sum += height;
            }
            averageOfClass = sum / gradeHeights.get(i).size();
            System.out.println(averageOfClass);
        }
    }

    public ArrayList<ArrayList<Integer>> setData(){

        ArrayList<ArrayList<Integer>> gradeHeights = new ArrayList<>();

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        ArrayList<Integer> arrayList4 = new ArrayList<>();
        ArrayList<Integer> arrayList5 = new ArrayList<>();

        arrayList1.add(170);
        arrayList1.add(180);
        arrayList1.add(173);
        arrayList1.add(175);
        arrayList1.add(177);

        arrayList2.add(160);
        arrayList2.add(165);
        arrayList2.add(167);
        arrayList2.add(186);

        arrayList3.add(158);
        arrayList3.add(177);
        arrayList3.add(187);
        arrayList3.add(176);

        arrayList4.add(173);
        arrayList4.add(182);
        arrayList4.add(181);

        arrayList5.add(170);
        arrayList5.add(180);
        arrayList5.add(165);
        arrayList5.add(177);
        arrayList5.add(172);

        gradeHeights.add(arrayList1);
        gradeHeights.add(arrayList2);
        gradeHeights.add(arrayList3);
        gradeHeights.add(arrayList4);
        gradeHeights.add(arrayList5);

        return gradeHeights;
    }

}

