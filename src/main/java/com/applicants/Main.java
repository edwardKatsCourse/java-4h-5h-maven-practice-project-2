package com.applicants;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import java.io.File;


public class Main {

    @SneakyThrows
    public static void main(String[] args) {

        Applicant applicant = Applicant.builder()
                .name("John Doe")
                .hasJobOffer(false)
                .salary(10000)
                .build();

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("applicant.json"), applicant);


        //new Applicant(null, null, false);

        //new UglyClass(
        // (short) 15, Short.valueOf("15"), null, false, true,
        // (short) 100, Short.valueOf("15"), null, false, true,
        // (byte) 15, Long.valueOf("21"), null, false, true,
        // (short) 15, Short.valueOf("15"), null, false, true,
        // );
    }
}
