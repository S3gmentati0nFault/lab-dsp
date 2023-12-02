package server;

import data.StudentOuterClass;

import java.io.IOException;
import java.net.Socket;

/**
 *  The class associated with the Thread that is used inside the server.
 */
public class Worker extends Thread{
    private Socket commSocket;

    /**
     *  Constructor for the worker class.
     *
     *  @param commSocket The socket used to communicate with the server through the Thread.
     */
    public Worker(Socket commSocket){
        this.commSocket = commSocket;
    }

    /**
     *  Override of the run method, the only thing that this method does is computing the GPA for
     *  the student that has been passed through the socketing system and print it to screen.
     */
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

    /**
     *  Private method that handles the computation of the GPA.
     *
     *  @param student The object associated with a student, its structure is defined inside the
     *  .proto file.
     *  @see Student.proto
     *  @see StudentOuterClass
     */
    private float avgCalculator(StudentOuterClass.Student student) {
        float avg = 0f;

        for(int i = 0; i < student.getExamsCount(); ++i){
            avg = avg + student.getExams(i).getMark();
        }
        avg = avg / student.getExamsCount();

        return avg;
    }
}
