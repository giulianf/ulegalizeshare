package com.ulegalize.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvatarDTO {

  private Long userId;
  private Integer avatarVersion;
  private String avatarUrl;
  private String initiales;
}
