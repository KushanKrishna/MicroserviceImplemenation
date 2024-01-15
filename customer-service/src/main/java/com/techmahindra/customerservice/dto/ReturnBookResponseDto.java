package com.techmahindra.customerservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReturnBookResponseDto {
    String message;
    String bookName;
    String bookConditionCheck;
    Double totalOutstanding;
    Double lateFee;
}
