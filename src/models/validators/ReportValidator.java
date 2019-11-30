package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Report;

public class ReportValidator {
    public static List<String> validate(Report r) {
        List<String> errors = new ArrayList<String>();

        String title_error = _validateTitle(r.getTitle());
        if(!title_error.equals("")) {
            errors.add(title_error);
        }

        String content_error = _validateContent(r.getContent());
        if(!content_error.equals("")) {
            errors.add(content_error);
        }

        String attendance_time_error = _validateAttendance_time(r.getAttendance_time());
        if(!attendance_time_error.equals("")) {
            errors.add(attendance_time_error);
        }

        String work_time_error = _validateWork_time(r.getWork_time());
        if(!work_time_error.equals("")) {
            errors.add(work_time_error);
        }

        return errors;
    }

    private static String _validateTitle(String title) {
        if(title == null || title.equals("")) {
            return "タイトルを入力してください。";
        }

        return "";
        }

    private static String _validateContent(String content) {
        if(content == null || content.equals("")) {
            return "内容を入力してください。";
        }

        return "";
        }

    private static String _validateAttendance_time(String attendance_time) {
        if(attendance_time == null || attendance_time.equals("")) {
            return "出勤時刻を入力してください";
        }

        return "";
        }

    private static String _validateWork_time(String work_time) {
        if(work_time == null || work_time.equals("")) {
            return "退勤時刻を入力してください";
        }

        return "";
    }
}
