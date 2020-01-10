package com.example.companyspring.Model.Response;

import com.example.companyspring.Model.Constatnt.MaritalStatus;
import com.example.companyspring.Model.Constatnt.Status;
import com.example.companyspring.Model.Entity.RecuitmentEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RecuitmentResponse {

    private Long id;
    private String surname;
    private String firstName;
    private String middleName;
    private String sex;
    private String age;
    private String maritalStatus;
    private String phoneNumber;
    private String level;
    private String status;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String uniqueKey;
    private String email;
    private String department;
    private String entitleNumberOfDays;

//    public static RecuitmentResponse fromStaffUpdate(RecuitmentEntity entity){
//        return RecuitmentResponse.builder()
//                .age(entity.getAge())
//                .email(entity.getEmail())
//                .uniqueKey(entity.getUniqueKey())
//                .status(String.valueOf(entity.getStatus()))
//                .firstName(entity.getFirstName())
//                .middleName(entity.getMiddleName())
//                .surname(entity.getSurname())
//                .sex(entity.getSex())
//                .maritalStatus(String.valueOf(entity.getMaritalStatus()))
//                .phoneNumber(entity.getPhoneNumber())
//                .level(entity.getLevel())
//                .department(entity.getDepartment())
//                .entitleNumberOfDays(entity.getEntitleNumberOfDays())
//                //.createdAt(Timestamp.getIsoTime(entity.getCreatedAt())
////                .updatedAt(TimeUtil.getIsoTime(entity.getUpdatedAt()))
//                .build();
//    }

//    public static List<RecuitmentResponse> fromStaff(List<RecuitmentEntity> staffs) {
//        return staffs.stream().map(staff -> {
//            return fromStaffUpdate(staff);
//        }).collect(
//                Collectors.toList());
//    }
}
