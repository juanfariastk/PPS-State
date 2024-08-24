package model;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private PlayerState state;
    private List<String> playlist = new ArrayList<>();
    private int currentTrack = 0;
    private boolean isPlaying = false;

    public Player() {
        this.state = new ReadyState();
        for (int i = 1; i <= 12; i++) {
            playlist.add("Música " + i);
        }
    }

    public void setState(PlayerState state) {
        this.state = state;
    }

    public void setPlaying(boolean isPlaying) {
        this.isPlaying = isPlaying;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void startPlayback() {
        isPlaying = true;
        System.out.println("Reproduzindo: " + playlist.get(currentTrack));
    }

    public void nextTrack() {
        currentTrack = (currentTrack + 1) % playlist.size();
        System.out.println("Avançando para: " + playlist.get(currentTrack));
    }

    public void previousTrack() {
        currentTrack = (currentTrack - 1 + playlist.size()) % playlist.size();
        System.out.println("Voltando para: " + playlist.get(currentTrack));
    }

    public void play() {
        state.play(this);
    }

    public void stop() {
        state.stop(this);
    }

    public void next() {
        state.next(this);
    }

    public void prev() {
        state.prev(this);
    }
}