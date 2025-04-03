package org.example.sof3061_sof3061_01.service;

import org.example.sof3061_sof3061_01.entity.Diem;

import java.util.List;

public interface DiemService {

    List<Diem> getDiems();

    Diem getDiem(long id);

    Diem updateDiem(Diem diem, long id);

    void deleteDiem(long id);
}
