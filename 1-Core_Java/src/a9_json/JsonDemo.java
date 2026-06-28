package a9_json;

// downloaded the JAR from https://mvnrepository.com/artifact/org.json/json and added it to classpath.

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonDemo {

    public static void main(String[] args) {

        // JSONObject stores data as (unordered) key-value pairs.
        // Keys are always Strings, whereas values can be String, Number, Boolean, JSONObject, JSONArray or null.
        JSONObject student = new JSONObject();

        student.put("name", "Dipesh");
        student.put("age", 21);
        student.put("college", "VESIT");

        // JSONArray stores an ordered collection of values.
        JSONArray skills = new JSONArray();

        skills.put("Java");
        skills.put("SQL");
        skills.put("Machine Learning");

        // Adding the JSONArray to the JSONObject.
        student.put("skills", skills);

        // toString(4) formats the JSON using an indentation of 4 spaces.
        System.out.println("Generated JSON:");
        System.out.println(student.toString(4));

        System.out.println();

        // Text Block (""") is used to write multi-line Strings without using \n or string concatenation.
        // The JSON String must be in valid JSON format, otherwise JSONObject throws an exception while parsing.
        String jsonStr = """
                {
                    "name": "Samarth",
                    "age": 22,
                    "interests": ["Web Development", "DSA", "Cricket"]
                }
                """;

        // Converts the JSON String into a JSONObject.
        JSONObject parsedStudent = new JSONObject(jsonStr);

        System.out.println("Parsed JSON:");

        // Use the appropriate get method according to the value's data type.
        System.out.println("Name : " + parsedStudent.getString("name"));
        System.out.println("Age : " + parsedStudent.getInt("age"));


        System.out.println("Interests:");
        for (int i = 0; i < parsedStudent.getJSONArray("interests").length(); i++) {
            System.out.println(parsedStudent.getJSONArray("interests").getString(i));
        }

    }

}