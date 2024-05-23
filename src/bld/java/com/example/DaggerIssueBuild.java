package com.example;

import rife.bld.Project;

import java.util.List;

import static rife.bld.dependencies.Repository.*;
import static rife.bld.dependencies.Scope.*;

public class DaggerIssueBuild extends Project {
    public DaggerIssueBuild() {
        pkg = "com.example";
        name = "Daggerissue";
        version = version(0, 1, 0);

        downloadSources = true;
        repositories = List.of(MAVEN_CENTRAL, RIFE2_RELEASES);

        scope(compile)
                .include(dependency("com.google.dagger:dagger:2.51.1"));
        scope(test)
                .include(dependency("org.junit.jupiter", "junit-jupiter", version(5, 10, 2)))
                .include(dependency("org.junit.platform", "junit-platform-console-standalone", version(1, 10, 2)));
    }

    public static void main(String[] args) {
        new DaggerIssueBuild().start(args);
    }
}
