package model;

public class PlayingState implements PlayerState {
    @Override
    public void play(Player player) {
        player.setState(new ReadyState());
        player.setPlaying(false);
    }

    @Override
    public void stop(Player player) {
        player.setState(new LockedState());
        player.setPlaying(false);
    }

    @Override
    public void next(Player player) {
        player.nextTrack();
    }

    @Override
    public void prev(Player player) {
        player.previousTrack();
    }
}

