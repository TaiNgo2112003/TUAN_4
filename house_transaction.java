/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GD_NHA_DAT;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class house_transaction extends transaction {

    private String typeHouse;
    private String address;

    public String getTypeHouse() {
        return typeHouse;
    }

    public void setTypeHouse(String typeHouse) {
        this.typeHouse = typeHouse;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public house_transaction(int id, Date date_ofTransaction, double unit_price, double acreage, String typeHouse, String address) {
        super(id, date_ofTransaction, unit_price, acreage);
        this.typeHouse = typeHouse;
        this.address = address;
    }

    public double totalMoney() {
        if (typeHouse.equals("cao cap") || typeHouse.equals("thuong")) {
            return getAcreage() * getUnit_price();
        }
        return getAcreage() * getUnit_price() * 0.9;
    }
//
    @Override
    public void xuatTT() {
        super.xuatTT();
        System.out.println("Loại nhà                   : " + getTypeHouse());
        System.out.println("Địa chỉ nhà                   : " + getAddress());
        System.out.println("Thành tiền:           " + totalMoney());
    }
   public static house_transaction add() {
        int id = Input1.inputInt("Nhập mã giao dịch: ");
        Date date = new Date(Input1.inputDate());
        double unit_price = Input1.inputDouble("Nhập đơn giá");
        double acreage = Input1.inputDouble("Nhập diện tích: ");
         String typeHouse= Input1.inputSting("Nhập loại nhà: ");
                 String address = Input1.inputSting("Nhập địa chỉ: ");
       
        return new house_transaction(id, date, unit_price, acreage, typeHouse,address);

    }
}
