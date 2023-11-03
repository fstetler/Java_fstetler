package org.example.repository;

import org.example.model.AttendancePerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendanceRepository extends JpaRepository<AttendancePerson, Integer> {
}
