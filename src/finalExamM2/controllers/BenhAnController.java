package finalExamM2.controllers;

import finalExamM2.services.DichVuBenhAnThuongImpl;
import finalExamM2.services.DichVuBenhAnVipImpl;
import finalExamM2.utils.NotFoundMedicalRecordException;

import java.util.Scanner;

public class BenhAnController {
    static DichVuBenhAnThuongImpl dichVuBenhAnThuong = new DichVuBenhAnThuongImpl();
    static DichVuBenhAnVipImpl dichVuBenhAnVip = new DichVuBenhAnVipImpl();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
      mainMenu();
    }

    public static void mainMenu() {

        int choose = 4;
        do {
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ BỆNH ÁN--");
            System.out.println("Chọn chức năng theo số (để tiếp tục)");
            System.out.println("1. Thêm mới");
            System.out.println("2. Xóa");
            System.out.println("3. Xem danh sách bệnh án");
            System.out.println("4. Thoát");
            System.out.println("Chọn chức năng");

            try {
                choose = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai kiểu dữ liệu");
            }

            switch (choose) {
                case 1:
                    if (chooseSubMenu() == 1) {
                        dichVuBenhAnThuong.addNew();
                    } else {
                        dichVuBenhAnVip.addNew();
                    }
                    mainMenu();
                    break;

                case 2:
                    if (chooseSubMenu() == 1) {
                        try {
                            dichVuBenhAnThuong.delete();
                        } catch (NotFoundMedicalRecordException e) {
                            e.printStackTrace();
                        }
                    } else {
                        try {
                            dichVuBenhAnVip.delete();
                        } catch (NotFoundMedicalRecordException e) {
                            e.printStackTrace();
                        }
                    }
                    mainMenu();
                    break;

                case 3:
                    if (chooseSubMenu() == 1) {
                        dichVuBenhAnThuong.displayList();
                    } else {
                        dichVuBenhAnVip.displayList();
                    }
                    mainMenu();
                    break;

                case 4:
                    System.exit(4);

                default:
                    System.out.println("Mời chọn lại");
            }
        } while (choose != 6);
    }

    public static int chooseSubMenu() {
        System.out.println("Chọn loại bệnh án");
        System.out.println("1. Bệnh án thường");
        System.out.println("2. Bệnh án VIP");

        int choose = 0;

        try{
            choose = Integer.parseInt(input.nextLine());
            if(choose<1 || choose>2) {
                do{
                    System.out.println("Mời nhập lại");
                    choose = Integer.parseInt(input.nextLine());
                }while (choose<1 || choose>2);
            }
        }catch (Exception e) {
            System.out.println("Mời nhập lại");
        }
        return choose;
    }
}
