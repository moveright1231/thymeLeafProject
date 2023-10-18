package com.ict01.thprj.thymeleafproject.dto;

import lombok.Data;

@Data // Lombok의 @Data 어노테이션: getter, setter, toString, equals, hashCode 메서드를 자동으로 생성
// 어노테이션을 붙여줘야함 롬복이 있어야하니까, 컨스트럭트도 있어야
public class StudentDTO {

  private int id;
  private String name;
  private String email;
  private String address;

  // 객체 생성시 초기화 해줘야함 !
  public StudentDTO(int id, String name, String email, String address) {
    this.id = id; // 초기화
    this.name = name;
    this.email = email;
    this.address = address;
  }
}
