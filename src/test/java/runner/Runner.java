package runner;

import Execution.Tesbo;

import java.nio.file.Paths;

public class Runner {
    public static void main(String[] args) {

        System.out.println(System.getProperty("user.dir"));
        System.out.println(Paths.get("").toAbsolutePath().toString());
        Tesbo tests = new Tesbo();
        tests.run(args);
    }
}

