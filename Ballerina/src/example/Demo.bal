import ballerina/io;

public function main() {
    io:println("Starting..");

    string name = "Akash";
    io:println(name);

    string[] names = ["Deep","singh"];

    foreach var n in names{
        io:println(n);
    }

    string[] names1 = getNames();
    io:print(names1);
}
