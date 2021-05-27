package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //        List<HocSinh> listStudents = new ArrayList<>();
//        // add students to list
//        listStudents.add(new HocSinh("Duong", 19));
//        listStudents.add(new HocSinh("Quang", 22));
//        listStudents.add(new HocSinh("Huy", 11));
//        listStudents.add(new HocSinh("Ha", 28));
//
//        Collections.sort(listStudents);
//
//        for (HocSinh hs : listStudents) {
//            System.out.println(hs.toString());
//        }

        QuanLy ql = new QuanLy();
        ql.sapXepTenTD();
        ql.sapXepTuoiGD();
        ql.sxTenTangTuoiGiam();
        HocSinh kq[] = ql.timkiem("Huy");
        System.out.println(Arrays.toString(kq));
    }
}
