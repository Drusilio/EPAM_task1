package entity;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FinalArray {
        private int[] array;

        public FinalArray() {
        }
        public FinalArray(int[] array) {
            this.array = array;
        }

    public int[] getArray() {
        return this.array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
