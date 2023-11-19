package com.example.saspsapi.dto;

import com.example.saspsapi.model.Symbol;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OperationDto {

  @NonNull
  List<Number> numbers;
  Symbol symbol;
}
