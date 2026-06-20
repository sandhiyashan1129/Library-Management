package com.example.student.service;

import com.example.student.dto.StudentRequest;
import com.example.student.entity.Student;
import com.example.student.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class StudentServiceTest {

    @Mock
    private StudentRepository studentRepository;

    @InjectMocks
    private StudentService studentService;

    @Test
    void createStudent_shouldThrowException_whenEmailAlreadyExists() {
        // Arrange
        StudentRequest request = new StudentRequest();
        request.setEmail("test@example.com");
        when(studentRepository.findByEmail("test@example.com")).thenReturn(Optional.of(new Student()));

        // Act & Assert
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> studentService.createStudent(request));
        assertEquals("Email already exists", exception.getMessage());
        verify(studentRepository, times(1)).findByEmail("test@example.com");
    }
}