package com.company;

public class HocSinh implements Comparable<HocSinh> {
    private String ten;
    private int tuoi;

    public HocSinh(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    @Override
    public String toString() {
        return "HocSinh{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                '}';
    }

    @Override
    public int compareTo(HocSinh hs2) {
        //return this.getTen().compareTo(hs2.getTen());
        int kq = ten.compareTo(hs2.ten);
        if(kq == 0) {
            kq = -(tuoi = hs2.tuoi);
        }
        return kq;
    }
}
