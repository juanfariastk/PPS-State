package model;

public class LockedState implements PlayerState {
    @Override
    public void play(Player player) {
        player.setState(new ReadyState());
    }

    @Override
    public void stop(Player player) {
        if (player.isPlaying()) {
            player.setState(new ReadyState());
            player.setPlaying(false);
        } else {
            System.out.println("Player está travado.");
        }
    }

    @Override
    public void next(Player player) {

    }

    @Override
    public void prev(Player player) {

    }
}