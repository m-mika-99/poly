package org.example.viecle;

import org.example.engine.CabEngine;

public class Car {
    private CabEngine engine = new CabEngine();
    private boolean isKeyOn = false;

    /**
     * KeyをONにする
     */
    public void keyOn() {
        this.isKeyOn = true;
    }


    /**
     * エンジンを始動する
     */
    public void startEngine() {
        if (this.isKeyOn) {
            this.engine.chokeOn();
            this.engine.moveStarterCellMotor();
            this.engine.chokeOff();
            System.out.println("エンジン始動完了");
        } else {
            System.out.println("Keyが入ってません");
        }
    }

    /**
     * アクセルペダルを踏む
     */
    public void kickAccelPedal() {
        if (this.engine.isStarted()) {
            System.out.println("ブーン");
        } else {
            System.out.println("エンジンがかかっていません");
        }
    }
}
