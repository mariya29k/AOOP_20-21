package services;

public interface Cipherable {
    //takes an int and returns a char[]
    char[] getSecretChars (int seed);
}
