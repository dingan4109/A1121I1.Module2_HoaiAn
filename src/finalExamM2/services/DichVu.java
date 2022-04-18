package finalExamM2.services;

import finalExamM2.utils.NotFoundMedicalRecordException;

public interface DichVu {
    void addNew();
    void delete() throws NotFoundMedicalRecordException;
    void displayList();

}
