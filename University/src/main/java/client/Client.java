package client;

import data.StudentOuterClass;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

// A client class using Sockets and ProtocolBuffers to define a student for tests
public class Client {
    public static void main(String[] args) throws IOException {
        StudentOuterClass.Student student =
                StudentOuterClass.Student.newBuilder()
                        .setName("Alessandro")
                        .setSurname("Biagiotti")
                        .setYeadOfBirth(2000)
                        .setResidence(
                                StudentOuterClass.Student.Residence.newBuilder()
                                        .setStreet("Via dei Missaglia")
                                        .setBuildingNumber(29)
                        )
                        .addExams(
                                StudentOuterClass.Student.Exam.newBuilder()
                                        .setName("Algoritmi e complessitá")
                                        .setMark(28)
                        )
                        .addExams(
                                StudentOuterClass.Student.Exam.newBuilder()
                                        .setName("Videogame design and programming")
                                        .setMark(27)
                        )
                        .addExams(
                                StudentOuterClass.Student.Exam.newBuilder()
                                        .setName("Artificial intelligence")
                                        .setMark(30)
                        )
                        .addExams(
                                StudentOuterClass.Student.Exam.newBuilder()
                                        .setName("Heuristic algorithms")
                                        .setMark(26)
                        )
                        .build();
        Socket serverSocket = new Socket("localhost", 6789);
        student.writeTo(serverSocket.getOutputStream());
    }
}
