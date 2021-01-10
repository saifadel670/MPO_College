package classproject;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class DepartmentHeadFXMLController {

    @FXML
    private BorderPane departmentHeadBorderPane;


    void initialize() {

    }

    @FXML
    private void addTeacherButtonOnclick(ActionEvent event) throws IOException {
        Parent sceneAddTeacher = FXMLLoader.load(getClass().getResource("AddTeacher.fxml"));
        departmentHeadBorderPane.setCenter(sceneAddTeacher);
    }

    @FXML
    private void teacherAttandanceButtonOnclick(ActionEvent event) throws IOException {
        Parent sceneTeacherAttandance = FXMLLoader.load(getClass().getResource("TeacherAttendance.fxml"));
        departmentHeadBorderPane.setCenter(sceneTeacherAttandance);
    }

    @FXML
    private void selfAttaandanceButtonOnclick(ActionEvent event) throws IOException {
        Parent sceneSelfAttandance = FXMLLoader.load(getClass().getResource("SelfAttandance.fxml"));
        departmentHeadBorderPane.setCenter(sceneSelfAttandance);
    }

    @FXML
    private void courseResultButtonOnclick(ActionEvent event) throws IOException {
        Parent sceneCourseResult = FXMLLoader.load(getClass().getResource("CourseResultChart.fxml"));
        departmentHeadBorderPane.setCenter(sceneCourseResult);
    }

    @FXML
    private void otherDepartmentReportButtonOnclick(ActionEvent event) throws IOException {
        Parent sceneOtherDepartmentReport = FXMLLoader.load(getClass().getResource("OtherDepartmentReport.fxml"));
        departmentHeadBorderPane.setCenter(sceneOtherDepartmentReport);
    }

    @FXML
    private void giveNoticeButtonOnclick(ActionEvent event) throws IOException {
        Parent sceneGiveNotice = FXMLLoader.load(getClass().getResource("GiveNotice.fxml"));
        departmentHeadBorderPane.setCenter(sceneGiveNotice);
    }

    @FXML
    private void takeNoticeButtonOnclick(ActionEvent event) throws IOException {
        Parent sceneNotice = FXMLLoader.load(getClass().getResource("Notice.fxml"));
        departmentHeadBorderPane.setCenter(sceneNotice);
    }

    @FXML
    private void salaryButtonOnclick(ActionEvent event) throws IOException {
        Parent sceneSalary = FXMLLoader.load(getClass().getResource("Salary.fxml"));
        departmentHeadBorderPane.setCenter(sceneSalary);
    }

    @FXML
    private void changePasswordButtonOnclick(ActionEvent event) {
    }

    @FXML
    private void logoutButtonOnclick(ActionEvent event) {
    }
}
