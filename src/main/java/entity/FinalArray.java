package entity;

import entity.impl.FinalArrayInterface;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FinalArray implements FinalArrayInterface {
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
