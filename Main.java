/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GD_NHA_DAT;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int choice;
        Transaction_managed ql = new Transaction_managed();
        do {
            System.out.println("|=========================menu=========================|");
            System.out.println("|1. Nhập thông tin                                     |");
            System.out.println("|2. Xuất thông tin                                     |");
            System.out.println("|3. Tổng số lượng cho từng loại                        |");
            System.out.println("|4. Trung bình thành tiền giao dịch đất                |");
            System.out.println("|5. Xuất giao dịch tháng 9/2023                        |");
            System.out.println("|6. Thoát                                              |");
            System.out.println("|=========================menu=========================|");
          choice = Input1.inputInt("Nhập lựa chọn: ");
    switch (choice) {
                case 1:
             ql.add();
                    break;
                     case 2:
                  ql.show();
                    break;
                     case 3:
        
                    break;
                     case 4:
           
                    break;
                     case 5:
                   
                    break;
                     case 6:
                         System.out.println("see you again !!!");
                  // System.exit(0);
                         
                default:
                    System.out.println("Nhập chức năng theo số từ 1-6");
            }
            
        } while (choice != 6);

    }
}
