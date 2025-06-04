package org.example.viecle;

import org.example.engine.Engine;
import org.example.engine.FIEngine;

public class Car {
    private Engine engine = new FIEngine();
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
            this.engine.start();
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
