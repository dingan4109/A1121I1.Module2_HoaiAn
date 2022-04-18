package finalExamM2.services;

import finalExamM2.controllers.BenhAnController;
import finalExamM2.models.BenhAnThuong;
import finalExamM2.utils.NotFoundMedicalRecordException;
import finalExamM2.utils.ReadAndWriteFile;
import finalExamM2.utils.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DichVuBenhAnThuongImpl implements DichVuBenhAnThuong{
    Scanner input = new Scanner(System.in);
    List<BenhAnThuong> listBenhAnThuong = null;

    public BenhAnThuong inputBenhAnThuong() {
        //String soThuTu, String maBenhAn, String tenBenhAn, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, int phiNamVien
        loadDataFromFile();
        int soThuTu;
        if(listBenhAnThuong.isEmpty()) {
            soThuTu = 1;
        }else {
            soThuTu = listBenhAnThuong.get(listBenhAnThuong.size()-1).getSoThuTu() +1;
        }

        try{
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

            while(Regex.compareDate(ngayNhapVien,ngayRaVien) == -1) {
                System.out.println("Ngày nhập viện phải trước hoặc trùng ngày ra viện");


                System.out.println("Nhập lại ngày nhập viện ");
                ngayNhapVien = input.nextLine();
                while (!Regex.dateValidate(ngayNhapVien)) {
                    System.out.println("Nhập lại");
                    ngayNhapVien = input.nextLine();
                }

                System.out.println("Nhập lại ngày ra viện");
                ngayRaVien = input.nextLine();
                while (!Regex.dateValidate(ngayRaVien)) {
                    System.out.println("Nhập lại");
                    ngayRaVien = input.nextLine();
                }
            }

            System.out.println("Nhập lý do nhập viện ");
            String lyDoNhapVien = input.nextLine();

            System.out.println("Nhập phí nằm viện ");
            int phiNamVien = Integer.parseInt(input.nextLine());

            return new BenhAnThuong(soThuTu,maBenhAn,maBenhNhan, tenBenhNhan,ngayNhapVien,ngayRaVien,
                    lyDoNhapVien,phiNamVien);
        }catch (Exception e) {
            System.out.println("Nhập sai kiểu dữ liệu");
        }
        return null;
    }

    public void loadDataFromFile() {
        List<String[]> listToRead = ReadAndWriteFile.read("E:\\A1121I1\\Module2\\A1121I1" +
                ".Module2_HoaiAn\\src\\FinalExamM2\\data\\medical_records.csv");
        listBenhAnThuong = new ArrayList<>();

        for(String[] line : listToRead) {
            int soThuTu = Integer.parseInt(line[0]);
            String maBenhAn = line[1];
            String tenBenhAn = line[2];
            String tenBenhNhan = line[3];
            String ngayNhapVien = line[4];
            String ngayRaVien = line[5];
            String lyDoNhapVien = line[6];
            int phiNamVien = Integer.parseInt(line[7]);

            BenhAnThuong benhAnThuong= new BenhAnThuong(soThuTu,maBenhAn,tenBenhAn, tenBenhNhan,ngayNhapVien,ngayRaVien,
                    lyDoNhapVien,phiNamVien);
            listBenhAnThuong.add(benhAnThuong);
        }
    }

    public void saveDataToFile() {
        List<String[]> listToWrite = new ArrayList<>();
        for (BenhAnThuong benhAnThuong : listBenhAnThuong) {
            listToWrite.add(benhAnThuong.toStringArray());
        }
        ReadAndWriteFile.write("E:\\A1121I1\\Module2\\A1121I1" +
                ".Module2_HoaiAn\\src\\FinalExamM2\\data\\medical_records.csv",listToWrite);
    }

    @Override
    public void addNew() {
        loadDataFromFile();
        BenhAnThuong benhAnThuong = inputBenhAnThuong();
        listBenhAnThuong.add(benhAnThuong);
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

        for(int i = 0;i<listBenhAnThuong.size();i++) {
            if (listBenhAnThuong.get(i).getMaBenhAn().equals(nhapMaBenhAn)) {
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
                            listBenhAnThuong.remove(i);
                            for (int j = stt; j < listBenhAnThuong.size(); j++) {
                                listBenhAnThuong.get(j).setSoThuTu(j + 1);
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

        if(listBenhAnThuong.isEmpty()) {
            System.out.println("Không có dữ liệu");
        }else {
            for(BenhAnThuong benhAnThuong : listBenhAnThuong) {
                System.out.println(benhAnThuong.toString());
            }
        }
    }
}
