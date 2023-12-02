package client;

import data.StudentOuterClass;

import java.net.Socket;

/**
 *  ClientBicocca is simply another example to test the program.
 */
public class ClientBicocca {
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
