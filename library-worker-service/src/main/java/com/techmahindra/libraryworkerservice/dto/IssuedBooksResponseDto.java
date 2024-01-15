package com.techmahindra.libraryworkerservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IssuedBooksResponseDto {
    String message;
    String issuedBookName;
    LocalDate issuedDate;
    LocalDate returnDate;
    Double totalOutStanding;
}
