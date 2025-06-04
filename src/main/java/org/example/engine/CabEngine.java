package org.example.engine;

/**
 * キャブレターエンジンクラス
 */
public class CabEngine {
    private boolean isChokeOn = false;
    private boolean isStarted = false;

    public boolean isStarted() {
        return this.isStarted;
    }

    /**
     * チョークをONにする
     */
    public void chokeOn() {
        this.isChokeOn = true;
    }

    /**
     * チョークをOFFにする
     */
    public void chokeOff() {
        this.isChokeOn = false;
    }

    /**
     * セルモータをまわす。
     * チョークが引かれていればエンジンがかかる
     */
    public void moveStarterCellMotor() {
        if (this.isStarted) {
            System.out.println("すでにかかってます");
        } else if (!this.isChokeOn) {
            System.out.println("かかりませんでした");
        } else {
            System.out.println("かかりました");
            this.isStarted = true;
        }
    }
}
