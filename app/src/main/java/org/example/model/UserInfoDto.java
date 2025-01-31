package org.example.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import org.example.entities.UserInfo;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown=true)
public class UserInfoDto extends UserInfo {
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
    @NonNull
    private Long phoneNumber;
    @NonNull
    private String email;
}
