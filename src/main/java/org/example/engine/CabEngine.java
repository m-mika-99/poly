package org.example.engine;

/**
 * キャブレターエンジンクラス
 */
public class CabEngine implements Engine {
    private boolean isChokeOn = false;
    private boolean isStarted = false;

    @Override
    public boolean isStarted() {
        return this.isStarted;
    }

    /**
     * チョークをONにする
     */
    private void chokeOn() {
        this.isChokeOn = true;
    }

    /**
     * チョークをOFFにする
     */
    private void chokeOff() {
        this.isChokeOn = false;
    }

    /**
     * セルモータをまわす。
     * チョークが引かれていればエンジンがかかる
     */
    private void moveStarterCellMotor() {
        if (this.isStarted) {
            System.out.println("すでにかかってます");
        } else if (!this.isChokeOn) {
            System.out.println("かかりませんでした");
        } else {
            System.out.println("かかりました");
            this.isStarted = true;
        }
    }

    /**
     * エンジン始動する
     * 1. チョーク引いて
     * 2. セル回して
     * 3. チョーク戻す
     */
    @Override
    public void start () {
        // チョーク引いて
        this.chokeOn();
        // セル回して
        this.moveStarterCellMotor();
        // チョーク戻す
        this.chokeOff();
    }
}
