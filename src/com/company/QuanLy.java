package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class QuanLy {
    private HocSinh arrHS[];

    private Comparator<HocSinh> tcSXTenTD = new Comparator<HocSinh>() {
        @Override
        public int compare(HocSinh hs1, HocSinh hs2) {
            return hs1.getTen().compareTo(hs2.getTen());
        }
    };

    private Comparator<HocSinh> tcSXTuoiGD = new Comparator<HocSinh>() {
        @Override
        public int compare(HocSinh hs1, HocSinh hs2) {
            return -(hs1.getTuoi() - hs2.getTuoi());
        }
    };

    private Comparator<HocSinh> tcSXTenTangTuoiGiam = new Comparator<HocSinh>() {
        @Override
        public int compare(HocSinh hs1, HocSinh hs2) {
            int result = tcSXTenTD.compare(hs1, hs2);
            if (result == 0) {
                result = tcSXTuoiGD.compare(hs1, hs2);
            }
            return result;
        }
    };

    public QuanLy() {
        arrHS = new HocSinh[]{
                new HocSinh("Huy", 26),
                new HocSinh("Quang", 12),
                new HocSinh("Duong", 11),
                new HocSinh("Long", 19),
                new HocSinh("Huy", 29)};
    }

    public void sapXepTenTD() {
        Arrays.sort(arrHS, tcSXTenTD);
        System.out.println(Arrays.toString(arrHS));
    }

    public void sapXepTuoiGD() {
        Arrays.sort(arrHS, tcSXTuoiGD);
        System.out.println(Arrays.toString(arrHS));
    }

    public void sxTenTangTuoiGiam() {
        Arrays.sort(arrHS, tcSXTenTangTuoiGiam);
        System.out.println(Arrays.toString(arrHS));
    }

    public HocSinh[] timkiem(String ten) {
        HocSinh dsKQ[] = new HocSinh[arrHS.length];
        int count = 0;
        for (int i = 0; i < arrHS.length; i++) {
            HocSinh hs = arrHS[i];
            if (hs.getTen().equalsIgnoreCase(ten)) {
                dsKQ[count] = hs;
                count++;
            }
        }
        return Arrays.copyOf(dsKQ, count);
    }


}
