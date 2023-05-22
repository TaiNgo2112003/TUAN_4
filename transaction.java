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
public class transaction {

    private int id;
    private Date date_ofTransaction;
    private double unit_price;
    private double acreage;



    public  transaction() {
    }

    public transaction(int id, Date date_ofTransaction, double unit_price, double acreage) {
        this.id = id;
        this.date_ofTransaction = date_ofTransaction;
        this.unit_price = unit_price;
        this.acreage = acreage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate_ofTransaction() {
        return date_ofTransaction;
    }

    public void setDate_ofTransaction(Date date_ofTransaction) {
        this.date_ofTransaction = date_ofTransaction;
    }

    public double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(double unit_price) {
        this.unit_price = unit_price;
    }

    public double getAcreage() {
        return acreage;
    }

    public void setAcreage(double acreage) {
        this.acreage = acreage;
    }

    public void xuatTT() {
        System.out.println("Mã giao dịch                : " + getId());
        System.out.println("Ngày giao dịch              : " + getDate_ofTransaction());
        System.out.println("Đơn giá                     : " + getUnit_price());
        System.out.println("Diện tích                   : " + getAcreage());

    }
}
