/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GD_NHA_DAT;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class Transaction_managed {
    private ArrayList<dat_tansaction> listDAT = new ArrayList<>();
    private ArrayList<house_transaction>listHouse = new ArrayList<>();
    
    private void addDAT (dat_tansaction dat ){
        listDAT.add(dat);
    }
    private void  addHouse(house_transaction house){
        listHouse.add(house);
    }
    
 
   public void add(){
       System.out.println("Nhập 1 để thêm giao dịch nhà");
       System.out.println("Nhập 2 để thêm giao dịch đất");
       int choice =Input1.inputInt("Nhập lựa chọn");
       if(choice ==1){
           System.out.println("Nhập thông tin  giao dịch nhà: ");
           //(int id, Date date_ofTransaction, double unit_price, double acreage, String typeHouse, String address)
           
         //  listHouse.add(new house_transaction(Input1.inputInt("Nhập mã giao dịch: "),Date.from(Instant.MIN) ,Input1.inputDouble("Nhập đơn giá"), Input1.inputDouble("Nhập diện tích: "), Input1.inputSting("Nhập loại nhà"),Input1.inputSting("Nhập địa chỉ: ")));
     
        dat_tansaction dat =dat_tansaction.add();
           addDAT(dat);
       }
       if(choice ==2 ){
                      System.out.println("Nhập thông tin  giao dịch đất: ");
                      //( int id, Date date_ofTransaction, double unit_price, double acreage ,String loaiDAT)
                      //listDAT.add(new dat_tansaction(Input1.inputInt("Nhập mã giao dịch: "),Date.from(Instant.MIN) ,Input1.inputDouble("Nhập đơn giá"), Input1.inputDouble("Nhập diện tích: "),Input1.inputSting("Nhập loại đất: ") ));
                      house_transaction house =house_transaction.add();
                      addHouse(house);
       }
   }
     public void show() {
//        if (listDAT.isEmpty()) {
//            System.out.println("Danh sách đất rỗng !!!");
//        } else {
        
            int count = 1;
            for (dat_tansaction dat : listDAT) {
                System.out.println("Danh sách gd đất  " + count);
                dat.xuatTT();
                count++;
            }
                for (house_transaction house : listHouse) {
                  System.out.println("Danh sách gd nhà  " + count);
                house.xuatTT();
                count++;
           // }
        }        
    }
   
}
