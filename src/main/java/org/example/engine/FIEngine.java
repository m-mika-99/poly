package org.example.engine;

public class FIEngine {
    private boolean isStarted = false;

    public boolean isStarted() {
        return this.isStarted;
    }

    /**
     * セルモータを回す
     */
    public void moveStarterCellMotor() {
        if (this.isStarted) {
            System.out.println("すでにかかってます");
        } else {
            System.out.println("FIかかりました");
            this.isStarted = true;
        }
    }


}
