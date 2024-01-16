package com.wjadczak.groomerWebApp.service;

import com.wjadczak.groomerWebApp.dto.AppointmentDto;
import com.wjadczak.groomerWebApp.dto.AppointmentSearchRequestDto;
import com.wjadczak.groomerWebApp.dto.AppointmentSaveRequestDto;

import java.util.List;


public interface AppointmentService {

    List<AppointmentDto> findAppointment(AppointmentSearchRequestDto appointmentSearchRequestDto);
    void saveAppointment(AppointmentSaveRequestDto appointmentSaveRequestDto);
}
