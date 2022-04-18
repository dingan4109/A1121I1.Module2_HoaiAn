package finalExamM2.models;

public class BenhAnThuong extends BenhAn{
    private int phiNamVien;

    public BenhAnThuong() {}

    public BenhAnThuong(int phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    public BenhAnThuong(int soThuTu, String maBenhAn, String maBenhNhan, String tenBenhNhan, String ngayNhapVien,
                        String ngayRaVien, String lyDoNhapVien, int phiNamVien) {
        super(soThuTu, maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.phiNamVien = phiNamVien;
    }

    public int getPhiNamVien() {
        return phiNamVien;
    }

    public void setPhiNamVien(int phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", phiNamVien=" + phiNamVien +
                '}';
    }

    public String[] toStringArray() {
        String[] line = new String[8];
        line[0] = getSoThuTu()+"";
        line[1] = getMaBenhAn();
        line[2] = getMaBenhNhan();
        line[3] = getTenBenhNhan();
        line[4] = getNgayNhapVien();
        line[5] = getNgayRaVien();
        line[6] = getLyDoNhapVien();
        line[7] = getPhiNamVien()+"";

        return line;
    }
}
