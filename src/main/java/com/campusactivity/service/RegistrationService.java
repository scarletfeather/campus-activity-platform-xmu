package com.campusactivity.service;

import com.campusactivity.entity.Registration;
import java.util.List;

public interface RegistrationService {
    List<Registration> getAllRegistrations();
    Registration getRegistrationById(Long id);
    Registration createRegistration(Registration registration);
    Registration updateRegistration(Long id, Registration registration);
    void deleteRegistration(Long id);
}