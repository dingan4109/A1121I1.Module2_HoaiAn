package finalExamM2.models;

public class BenhAnVip extends BenhAn {
    private String loaiVip;
    private String thoiHanVip;

    public final String VIP_1 = "Vip I";
    public final String VIP_2 = "Vip II";
    public final String VIP_3 = "Vip III";

    public BenhAnVip() {}


    public BenhAnVip(int soThuTu, String maBenhAn, String maBenhNhan, String tenBenhNhan, String ngayNhapVien,
                     String ngayRaVien, String lyDoNhapVien, String loaiVip,String thoiHanVip) {
        super(soThuTu, maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.loaiVip = loaiVip;
        this.thoiHanVip = thoiHanVip;
    }


    public String getLoaiVip() {
        return loaiVip;
    }

    public void setLoaiVip(String loaiVip) {
        this.loaiVip = loaiVip;
    }

    public String getThoiHanVip() {
        return thoiHanVip;
    }

    public void setThoiHanVip(String thoiHanVip) {
        this.thoiHanVip = thoiHanVip;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", loaiVip='" + loaiVip + '\'' +
                ", thoiHanVip='" + thoiHanVip + '\'';
    }

    public String[] toStringArray() {
        String[] line = new String[9];
        line[0] = getSoThuTu()+"";
        line[1] = getMaBenhAn();
        line[2] = getMaBenhNhan();
        line[3] = getTenBenhNhan();
        line[4] = getNgayNhapVien();
        line[5] = getNgayRaVien();
        line[6] = getLyDoNhapVien();
        line[7] = getLoaiVip();
        line[8] = getThoiHanVip();

        return line;
    }
}
