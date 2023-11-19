package com.example.saspsapi.controller;

import com.example.saspsapi.dto.OperationDto;
import com.example.saspsapi.dto.PowDto;
import com.example.saspsapi.dto.ResultDto;
import com.example.saspsapi.model.Operation;
import com.example.saspsapi.model.Symbol;
import com.example.saspsapi.service.OperationService;

import lombok.RequiredArgsConstructor;

import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:3000"})
@RequestMapping("/operation")
@RequiredArgsConstructor
public class OperationController {

  private final ModelMapper modelMapper;
  private final OperationService operationService;

  @GetMapping("add")
  public ResponseEntity<?> addOperation(@RequestBody OperationDto operationDto) {
    operationDto.setSymbol(Symbol.ADDITION);
    Operation operation = modelMapper.map(operationDto, Operation.class);

    try {
      ResultDto result = new ResultDto();
      result.setResult(operationService.add(operation.getNumbers()));
      if (result != null) {
        return ResponseEntity.ok(result);
      } else {
        return ResponseEntity.badRequest().body(null);
      }
    } catch (Exception e) {
      return ResponseEntity.badRequest().body(e.getMessage());
    }
  }

  @GetMapping("sub")
  public ResponseEntity<?> subOperation(@RequestBody OperationDto operationDto) {
    operationDto.setSymbol(Symbol.SUBTRACTION);
    Operation operation = modelMapper.map(operationDto, Operation.class);

    try {
      ResultDto result = new ResultDto();
      result.setResult(operationService.subtract(operation.getNumbers()));
      if (result != null) {
        return ResponseEntity.ok(result);
      } else {
        return ResponseEntity.badRequest().body(null);
      }
    } catch (Exception e) {
      return ResponseEntity.badRequest().body(e.getMessage());
    }
  }

  @GetMapping("mul")
  public ResponseEntity<?> mulOperation(@RequestBody OperationDto operationDto) {
    operationDto.setSymbol(Symbol.MULTIPLICATION);
    Operation operation = modelMapper.map(operationDto, Operation.class);

    try {
      ResultDto result = new ResultDto();
      result.setResult(operationService.multiply(operation.getNumbers()));
      if (result != null) {
        return ResponseEntity.ok(result);
      } else {
        return ResponseEntity.badRequest().body(null);
      }
    } catch (Exception e) {
      return ResponseEntity.badRequest().body(e.getMessage());
    }
  }

  @GetMapping("div")
  public ResponseEntity<?> divOperation(@RequestBody OperationDto operationDto) {
    operationDto.setSymbol(Symbol.DIVISION);
    Operation operation = modelMapper.map(operationDto, Operation.class);

    try {
      ResultDto result = new ResultDto();
      result.setResult(operationService.divide(operation.getNumbers()));
      if (result != null) {
        return ResponseEntity.ok(result);
      } else {
        return ResponseEntity.badRequest().body(null);
      }
    } catch (Exception e) {
      return ResponseEntity.badRequest().body(e.getMessage());
    }
  }

  @GetMapping("div")
  public ResponseEntity<?> powOperation(@RequestBody PowDto powDto) {
    try {
      ResultDto result = new ResultDto();
      result.setResult(operationService.power(powDto.getBase(), powDto.getPow()));
      if (result != null) {
        return ResponseEntity.ok(result);
      } else {
        return ResponseEntity.badRequest().body(null);
      }
    } catch (Exception e) {
      return ResponseEntity.badRequest().body(e.getMessage());
    }
  }
}

/*
* @RestController
@CrossOrigin(origins = {"http://localhost:3000"})
@RequestMapping("/locations")
@RequiredArgsConstructor
public class LocationController {

  private final LocationService locationService;
  private final ModelMapper modelMapper;

  @PreAuthorize("hasAuthority('ADMIN')")
  @PostMapping("add")
  public ResponseEntity<?> addLocation(@RequestBody LocationDto locationDto) {
    Location locationRequest = modelMapper.map(locationDto, Location.class);

    try {
      Location savedLocation = locationService.addLocation(locationRequest);
      if (savedLocation != null) {
        LocationDto locationResponse = modelMapper.map(savedLocation, LocationDto.class);
        return ResponseEntity.ok(locationResponse);
      } else {
        return ResponseEntity.badRequest().body(null);
      }
    } catch (Exception e) {
      return ResponseEntity.badRequest().body(e.getMessage());
    }
  }

  @GetMapping("{id}")
  public ResponseEntity<LocationDto> getLocationById(@PathVariable("id") Long locationId) {
    try {
      Location foundLocation = locationService.getLocationById(locationId);
      LocationDto locationResponse = modelMapper.map(foundLocation, LocationDto.class);

      return ResponseEntity.ok(locationResponse);
    } catch (LocationNotFoundException e) {
      return ResponseEntity.notFound().build();
    }
  }
* */
