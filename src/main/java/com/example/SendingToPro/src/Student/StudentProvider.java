package com.example.SendingToPro.src.Student;

import com.example.SendingToPro.config.BaseException;
import com.example.SendingToPro.config.BaseResponse;
import com.example.SendingToPro.src.Student.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.SendingToPro.config.BaseResponseStatus.*;

@Service
public class StudentProvider {
    private final StudentDao studentDao;

    @Autowired
    public StudentProvider(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public List<GetStudentLectureRes> getStudentLectureList(int studentIndex) throws BaseException {
        try {
            List<GetStudentLectureRes> getStudentLectureRes = studentDao.getStudentLectureList(studentIndex);
            return getStudentLectureRes;
        } catch (Exception exception) {
            throw new BaseException(DATABASE_ERROR);
        }
    }

    public GetMailFormRes getMailForm(GetMailFormReq getMailFormReq) throws BaseException {
        try {
            GetMailFormRes getMailFormRes = studentDao.getMailForm(getMailFormReq);
            return getMailFormRes;
        } catch(Exception exception) {
            throw new BaseException(DATABASE_ERROR);
        }
    }

}
