package finalExamM2.services;

import finalExamM2.controllers.BenhAnController;
import finalExamM2.models.BenhAnVip;
import finalExamM2.utils.NotFoundMedicalRecordException;
import finalExamM2.utils.ReadAndWriteFile;
import finalExamM2.utils.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DichVuBenhAnVipImpl implements DichVuBenhAnVip {
    Scanner input = new Scanner(System.in);
    List<BenhAnVip> listBenhAnVip = null;

    public BenhAnVip inputBenhAnVip() {
        //String soThuTu, String maBenhAn, String tenBenhAn, String tenBenhNhan, String ngayNhapVien, String
        // ngayRaVien, String lyDoNhapVien, String loaiVip, String thoiHanVip

        try{
            loadDataFromFile();
            int soThuTu;
            if(listBenhAnVip.isEmpty()) {
                soThuTu = 1;
            }else {
                soThuTu = listBenhAnVip.get(listBenhAnVip.size()-1).getSoThuTu() +1;
            }

            System.out.println("Nhập mã bệnh án ");
            String maBenhAn = input.nextLine();
            while(!Regex.maBenhAnValidte(maBenhAn)) {
                System.out.println("Nhập lại");
                maBenhAn = input.nextLine();
            }

            System.out.println("Nhập mã bệnh nhân ");
            String maBenhNhan = input.nextLine();
            while(!Regex.maBenhNhanValidte(maBenhNhan)) {
                System.out.println("Nhập lại");
                maBenhNhan = input.nextLine();
            }

            System.out.println("Nhập tên bệnh nhân ");
            String tenBenhNhan = input.nextLine();


            System.out.println("Nhập ngày nhập viện ");
            String ngayNhapVien = input.nextLine();
            while(!Regex.dateValidate(ngayNhapVien)) {
                System.out.println("Nhập lại");
                ngayNhapVien = input.nextLine();
            }

            System.out.println("Nhập ngày ra viện");
            String ngayRaVien = input.nextLine();
            while(!Regex.dateValidate(ngayRaVien)) {
                System.out.println("Nhập lại");
                ngayRaVien = input.nextLine();
            }

            System.out.println("Nhập lý do nhập viện ");
            String lyDoNhapVien = input.nextLine();

            System.out.println("Nhập loại Vip ");
            System.out.println(" 1. Gói VIP I \n 2. Gói VIP II \n 3. Gói VIP III");
            String loaiVip = "";
            try{
                int choose = Integer.parseInt(input.nextLine());
                if(choose<=0 || choose > 3) {
                    do{
                        System.out.println("Mời nhập lại");
                        choose = Integer.parseInt(input.nextLine());
                    }while (choose<=0 || choose > 3);
                }

                switch (choose) {
                    case 1:
                        loaiVip = "Gói VIP I";
                        break;
                    case 2:
                        loaiVip = "Gói VIP II";
                        break;
                    case 3:
                        loaiVip = "Gói VIP III";
                        break;
                }
            }catch (Exception e) {
                System.out.println("Nhập sai kiểu dữ liệu");
            }

            System.out.println("Nhập thời hạn Vip ");
            String thoiHanVip = input.nextLine();
            while(!Regex.dateValidate(thoiHanVip)) {
                System.out.println("Nhập lại");
                thoiHanVip = input.nextLine();
            }

            return new BenhAnVip(soThuTu,maBenhAn,maBenhNhan, tenBenhNhan,ngayNhapVien,ngayRaVien,
                    lyDoNhapVien,loaiVip,thoiHanVip);
        }catch (Exception e) {
            System.out.println("Nhập sai kiểu dữ liệu");
        }
        return null;
    }

    public void loadDataFromFile() {
        List<String[]> listToRead = ReadAndWriteFile.read("E:\\A1121I1\\Module2\\A1121I1" +
                ".Module2_HoaiAn\\src\\FinalExamM2\\data\\medical_recordsVip.csv");
        listBenhAnVip = new ArrayList<>();

        for(String[] line : listToRead) {
            int soThuTu = Integer.parseInt(line[0]);
            String maBenhAn = line[1];
            String maBenhNhan = line[2];
            String tenBenhNhan = line[3];
            String ngayNhapVien = line[4];
            String ngayRaVien = line[5];
            String lyDoNhapVien = line[6];
            String loaiVip = line[7];
            String thoiHanVip = line[8];

            BenhAnVip benhAnVip= new BenhAnVip(soThuTu,maBenhAn,maBenhNhan, tenBenhNhan,ngayNhapVien,ngayRaVien,
                    lyDoNhapVien,loaiVip,thoiHanVip);
            listBenhAnVip.add(benhAnVip);
        }
    }

    public void saveDataToFile() {
        List<String[]> listToWrite = new ArrayList<>();
        for (BenhAnVip benhAnVip : listBenhAnVip) {
            listToWrite.add(benhAnVip.toStringArray());
        }
        ReadAndWriteFile.write("E:\\A1121I1\\Module2\\A1121I1" +
                ".Module2_HoaiAn\\src\\FinalExamM2\\data\\medical_recordsVip.csv",listToWrite);
    }

    @Override
    public void addNew() {
        loadDataFromFile();
        BenhAnVip benhAnVip = inputBenhAnVip();
        listBenhAnVip.add(benhAnVip);
        System.out.println("Thêm mới thành công");

        saveDataToFile();
    }

    @Override
    public void delete() throws NotFoundMedicalRecordException {
        displayList();
        System.out.println("Nhập mã bệnh án cần xóa");
        String nhapMaBenhAn = input.nextLine();
        if(!Regex.maBenhAnValidte(nhapMaBenhAn)) {
            throw new NotFoundMedicalRecordException("Bệnh án không tồn tại");
        }
        while(!Regex.maBenhAnValidte(nhapMaBenhAn)) {
            System.out.println("Nhập lại");
            nhapMaBenhAn = input.nextLine();
        }

        boolean isFound = false;
        for(int i = 0;i<listBenhAnVip.size();i++) {
            if (listBenhAnVip.get(i).getMaBenhAn().equals(nhapMaBenhAn)) {
                isFound = true;

                int choose;
                System.out.println("Bạn có chắc muốn xóa bệnh án?");
                System.out.println("1. Có");
                System.out.println("2. Không");

                try {
                    choose = Integer.parseInt(input.nextLine());

                    switch (choose) {
                        case 1:
                            int stt = i;
                            listBenhAnVip.remove(i);
                            for (int j = stt; j < listBenhAnVip.size(); j++) {
                                listBenhAnVip.get(j).setSoThuTu(j + 1);
                            }
                            System.out.println("Xóa thành công");
                            break;
                        case 2:
                            BenhAnController.mainMenu();
                            break;
                    }
                } catch (Exception e) {
                    System.out.println("Nhập sai kiểu dữ liệu");
                }
            }
        }
        if(!isFound) {
            System.out.println("Không có bệnh án trong danh sách");
        }
        saveDataToFile();
        }


    @Override
    public void displayList() {
        loadDataFromFile();

        if(listBenhAnVip.isEmpty()) {
            System.out.println("Không có dữ liệu");
        }else {
            for(BenhAnVip benhAnVip : listBenhAnVip) {
                System.out.println(benhAnVip.toString());
            }
        }
    }
}
