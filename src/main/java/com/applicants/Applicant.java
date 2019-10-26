package com.applicants;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Applicant {

    private String name;
    private Integer salary;
    private boolean hasJobOffer; //false
}
