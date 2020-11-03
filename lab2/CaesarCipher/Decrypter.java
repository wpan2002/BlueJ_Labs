class Decrypter {
    static char[] decrypt(char[] characters, int offset) {
        char[] result = characters.clone();
        // Calling clone() on an array creates a "shallow copy" of the array.
        // result is now exactly the same as characters.
        // Add code here to decrypt a Caesar cipher using the specified offset.
        // You can assume the cipher will only contain capital letters.
        // Check your work by decoding the following messages:
        // DSZQUPHSBQIZ JT GVO, offset = 1
        // NEZE QEHI QI VMGL ERH JEQSYW, offset = 4
        // KAG'DQ M IULMDP TMDDK, offset = 12
        return result;
    }
}
