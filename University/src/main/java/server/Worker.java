package server;

import data.StudentOuterClass;

import java.io.IOException;
import java.net.Socket;

public class Worker extends Thread{
    private Socket commSocket;

    public Worker(Socket commSocket){
        this.commSocket = commSocket;
    }

    @Override
    public void run() {
        try {
            StudentOuterClass.Student student = StudentOuterClass.Student.parseFrom(commSocket.getInputStream());
            float avg = avgCalculator(student);
            extra.Logger.notice("Lo studente ha media: " + avg);
            extra.Logger.notice("e ha sostenuto: " + student.getExamsCount() + " esami");
            commSocket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private float avgCalculator(StudentOuterClass.Student student) {
        float avg = 0f;

        for(int i = 0; i < student.getExamsCount(); ++i){
            avg = avg + student.getExams(i).getMark();
        }
        avg = avg / student.getExamsCount();

        return avg;
    }
}
