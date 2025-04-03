package org.example.sof3061_sof3061_01.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.sof3061_sof3061_01.entity.Diem;
import org.example.sof3061_sof3061_01.exception.ResourceNotFoundException;
import org.example.sof3061_sof3061_01.repository.DiemRepository;
import org.example.sof3061_sof3061_01.service.DiemService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DiemServiceImpl implements DiemService {

    private final DiemRepository diemRepository;

    @Override
    public List<Diem> getDiems() {

        return diemRepository.findAll();
    }

    @Override
    public Diem getDiem(long id) {

        return  diemRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Diem not found with id " + id));
    }

    @Override
    public Diem updateDiem(Diem diem, long id) {

        Diem exitstingDiem = diemRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Diem not found with id " + id));

        exitstingDiem.setDiemSo(diem.getDiemSo());

        return diemRepository.save(exitstingDiem);

    }

    @Override
    public void deleteDiem(long id) {

        Diem exitstingDiem = diemRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Diem not found with id " + id));

        diemRepository.delete(exitstingDiem);
    }

}
