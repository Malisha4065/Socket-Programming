package org.example.threeUrlClassInJava;

import java.net.MalformedURLException;
import java.net.URL;

// Java Program to demonstrate working of URL
public class UrlTest {
    public static void main(String[] args) throws MalformedURLException {
        // Creating a URL with string representation
        URL url1 = new URL(
                "https://www.google.co.in/?gfe_rd=cr&ei=ptYq"
                        + "WK26I4fT8gfth6CACg#q=geeks+for+geeks+java"
        );

        // Creating a URL with a protocol, hostname and path
        URL url2 = new URL("http", "www.geeksforgeeks.org",
                "/jvm-works-jvm-architecture/");

        URL url3 = new URL(
                "https://www.google.co.in/search?"
                + "q=gnu&rlz=1C1CHZL_enIN71"
                + "4IN715&oq=gnu&aqs=chrome..69i57j6"
                        + "9i60l5.653j0j7&sourceid=chrome&ie=UTF"
                        + "-8#q=geeks+for+geeks+java");

        // Printing the string representatoin of the URL
        System.out.println(url1.toString());
        System.out.println(url2.toString());
        System.out.println();
        System.out.println(
                "Different components of the URL3-"
        );

        // Retrieving the protocol for the URL
        System.out.println("Protocol: "
                            + url3.getProtocol());

        // Retrieving the hostname of the URL
        System.out.println("Hostname: "
                            + url3.getHost());

        // Retrieving the default port
        System.out.println("Default port: "
                            + url3.getDefaultPort());

        // Retrieving the query part of URL
        System.out.println("Query: " + url3.getQuery());

        // Retrieving the path of URL
        System.out.println("Path: " + url3.getPath());

        // Retrieving the file name
        System.out.println("File: " + url3.getFile());

        // Retrieving the reference
        System.out.println("Reference: " + url3.getRef());
    }
}
