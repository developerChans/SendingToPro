package com.example.SendingToPro.src.Student.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class PostMailFormReq {
    private int lecId;
    private int studId;
    private String emailForm;
}
