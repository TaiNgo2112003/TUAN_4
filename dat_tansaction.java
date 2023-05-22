/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GD_NHA_DAT;

import java.util.Date;

public class dat_tansaction extends transaction {

    private String loaiDAT;

    public String getLoaiDAT() {
        return loaiDAT;
    }

    public void setLoaiDAT(String loaiDAT) {
        this.loaiDAT = loaiDAT;
    }

    public dat_tansaction(int id, Date date_ofTransaction, double unit_price, double acreage, String loaiDAT) {
        super(id, date_ofTransaction, unit_price, acreage);
        this.loaiDAT = loaiDAT;
    }

    public double totalMoney() {
        if (loaiDAT.equals("B") || loaiDAT.equals("C")) {
            return getAcreage() * getUnit_price();

        }
        return getAcreage() * getUnit_price() * 1.5;
    }

    @Override
    public void xuatTT() {
        super.xuatTT();
        System.out.println("Loại đất                   : " + getLoaiDAT());
        System.out.println("Thành tiền:           " + totalMoney());
    }

    public static dat_tansaction add() {
        int id = Input1.inputInt("Nhập mã giao dịch: ");
        Date date = new Date(Input1.inputDate());
        double unit_price = Input1.inputDouble("Nhập đơn giá");
        double acreage = Input1.inputDouble("Nhập diện tích: ");

        String loaiDAT = Input1.inputSting("Nhập loại đất");
        return new dat_tansaction(id, date, unit_price, acreage, loaiDAT);

    }

    @Override
    public String toString() {
        return "dat_tansaction{" + "loaiDAT=" + loaiDAT + "tổng tiền: " + totalMoney() + '}';
    }

}
