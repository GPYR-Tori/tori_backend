package com.server.tori.entity;

import com.server.tori.dto.MyPageEditRequestDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "userinfo")
@Entity
@Getter
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "user_id")
  public Long id;

  public String email;

  public String password;

  public String gender;

  public String nation;

  public String language;

  public String nickname;

  public User(Long id, String email, String password) {
  }

  public User(String password, String language, String nickname) {
  }


  public void patch(MyPageEditRequestDto myPageEditRequestDto) {
    if (myPageEditRequestDto.getPassword() != null) {
      this.password = myPageEditRequestDto.getPassword();
    }
    if (myPageEditRequestDto.getLanguage() != null) {
      this.language = myPageEditRequestDto.getLanguage();
    }
    if (myPageEditRequestDto.getNickname() != null) {
      this.nickname = myPageEditRequestDto.getNickname();
    }
  }

}
