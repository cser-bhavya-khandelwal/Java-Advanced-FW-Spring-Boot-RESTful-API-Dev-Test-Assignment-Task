package com.capgemini.serialization.filehandler;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class FileHandler {

    private static final String PATH = "src/main/resources/Student.json";
    private static final File FILE = new File(PATH);
    private static final ObjectMapper MAPPER = new ObjectMapper();

    public void createFile() throws IOException {
        if (FILE.createNewFile()) {
            System.out.println("JSON File Created Successfully!");
        } else {
            System.out.println("JSON File Already Exists!");
        }
    }

    public void write(Object obj) throws IOException {
        MAPPER.writeValue(FILE, obj);
        System.out.println("Serialization Done Successfully!");
    }

    public <T> T read(Class<T> clazz) throws IOException {
        T obj = MAPPER.readValue(FILE, clazz);
        System.out.println(obj);
        System.out.println("Deserialization Done Successfully!");
        return obj;
    }

    public void deleteTheFile() {
        if (FILE.delete()) {
            System.out.println("JSON File Deleted Successfully!");
        } else {
            System.out.println("JSON File Doesn't Exist!");
        }
    }
}