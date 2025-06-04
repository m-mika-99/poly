package org.example.engine;

public class FIEngine implements Engine{
    private boolean isStarted = false;

    @Override
    public boolean isStarted() {
        return this.isStarted;
    }

    /**
     * エンジンを始動する
     */
    @Override
    public void start () {
        this.moveStarterCellMotor();
    }

    /**
     * セルモータを回す
     */
    private void moveStarterCellMotor() {
        if (this.isStarted) {
            System.out.println("すでにかかってます");
        } else {
            System.out.println("FIかかりました");
            this.isStarted = true;
        }
    }


}
