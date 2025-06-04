package org.example.engine;

public interface Engine {

    /**
     * エンジン始動状態を取得
     * @return true: 始動 / false: 停止
     */
    public boolean isStarted();

    /**
     * エンジンを始動する
     */
    public void start();
}
