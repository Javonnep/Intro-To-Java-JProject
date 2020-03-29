package game;

import city.cs.engine.SoundClip;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AudioController {
    private JPanel mainPanel;
    private JLabel volumeLevel;
    private JSlider volumeSlider;
    private JButton muteButton;
    private JButton unmuteButton;


    public AudioController(){

        muteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Sounds.getBgm1().setVolume(0.0001);
                Sounds.getBgm2().setVolume(0.0001);
                Sounds.getBgm3().setVolume(0.0001);
                Sounds.getCoinSound().setVolume(0.0001);
                Sounds.getDeathSound().setVolume(0.0001);
                Sounds.getSpitSound().setVolume(0.0001);


//                int i = 0;
//                while(i < Sounds.getSounds().size()-1){
//                    Sounds.getSounds().get(i).setVolume(0.0001);
//                }

            }
        });
        volumeSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
//                float volume = scale(volumeSlider.getValue(), 1f, 10.0f, 0.0001f, 2.0f);
                float volume = scale( (float) volumeSlider.getValue(), 1.0f, 10.0f, 0.0001f, 2.0f);

                Sounds.getBgm1().setVolume(volume);
                Sounds.getBgm2().setVolume(volume);
                Sounds.getBgm3().setVolume(volume);
                Sounds.getCoinSound().setVolume(volume);
                Sounds.getDeathSound().setVolume(volume);
                Sounds.getSpitSound().setVolume(volume);
            }
        });
        unmuteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Sounds.getBgm2().setVolume(1);
                Sounds.getBgm3().setVolume(1);
                Sounds.getCoinSound().setVolume(1);
                Sounds.getDeathSound().setVolume(1);
                Sounds.getSpitSound().setVolume(1);
            }
        });
    }

    public JPanel getMainPanel(){
        return mainPanel;
    }

    private float scale(float value, float minInput, float maxInput, float minRange, float maxRange){
        return ((maxRange - minRange) * (value - minInput)) /
                ((maxInput - minInput) + minRange);
    }
}
