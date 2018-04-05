package main.client.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Panel to display color for the graph plot representing effects in form of boxes. And display the time difference
 * between data received for the graph points.
 * @author Shaunak Shah
 * @version 1.0
 */
public class MetricsValuePanel extends JPanel {
    private ColorBox interest;
    private ColorBox engagement;
    private ColorBox stress;
    private ColorBox relaxation;
    private ColorBox excitement;
    private ColorBox focus;
    private JTextPane displayLength;
    private JButton setLength;
    private Color colors[] = new Color[] {Color.RED, Color.GREEN, Color.YELLOW, Color.BLUE, Color.PINK, Color.ORANGE};

    public MetricsValuePanel(){
        this.setLayout(null);

        interest = new ColorBox();
        interest.setBoxColor(0);
        interest.setEmotionName("Interest");
        interest.setBounds(35,15,150,150);
        interest.getDropdown().addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        if(e.getStateChange() == ItemEvent.SELECTED){
                            interest.getDropdown().setBackground(colors[interest.getDropdown().getSelectedIndex()]);
                            interest.setBackground(colors[interest.getDropdown().getSelectedIndex()]);
                        }
                    }
                }
        );

        this.add(interest);

        engagement = new ColorBox();
        engagement.setEmotionName("Engagement");
        engagement.setBoxColor(1);
        engagement.setBounds(190,15,150,150);
        engagement.getDropdown().addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        if(e.getStateChange() == ItemEvent.SELECTED){
                            engagement.getDropdown().setBackground(colors[engagement.getDropdown().getSelectedIndex()]);
                            engagement.setBackground(colors[engagement.getDropdown().getSelectedIndex()]);
                        }
                    }
                }
        );
        this.add(engagement);

        stress = new ColorBox();
        stress.setEmotionName("Stress");
        stress.setBoxColor(2);
        stress.setBounds(35,170,150,150);
        stress.getDropdown().addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        if(e.getStateChange() == ItemEvent.SELECTED){
                            stress.getDropdown().setBackground(colors[stress.getDropdown().getSelectedIndex()]);
                            stress.setBackground(colors[stress.getDropdown().getSelectedIndex()]);
                        }
                    }
                }
        );
        this.add(stress);

        relaxation = new ColorBox();
        relaxation.setEmotionName("Relaxation");
        relaxation.setBoxColor(3);
        relaxation.setBounds(190,170,150,150);
        relaxation.getDropdown().addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        if(e.getStateChange() == ItemEvent.SELECTED){
                            relaxation.getDropdown().setBackground(colors[relaxation.getDropdown().getSelectedIndex()]);
                            relaxation.setBackground(colors[relaxation.getDropdown().getSelectedIndex()]);
                        }
                    }
                }
        );
        this.add(relaxation);

        excitement = new ColorBox();
        excitement.setEmotionName("Excitement");
        excitement.setBoxColor(4);
        excitement.setBounds(35,325,150,150);
        excitement.getDropdown().addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        if(e.getStateChange() == ItemEvent.SELECTED){
                            excitement.getDropdown().setBackground(colors[excitement.getDropdown().getSelectedIndex()]);
                            excitement.setBackground(colors[excitement.getDropdown().getSelectedIndex()]);
                        }
                    }
                }
        );
        this.add(excitement);


        focus = new ColorBox();
        focus.setEmotionName("Focus");
        focus.setBoxColor(5);
        focus.setBounds(190,325,150,150);
        focus.getDropdown().addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        if(e.getStateChange() == ItemEvent.SELECTED){
                            focus.getDropdown().setBackground(colors[focus.getDropdown().getSelectedIndex()]);
                            focus.setBackground(colors[focus.getDropdown().getSelectedIndex()]);
                        }
                    }
                }
        );
        this.add(focus);

        JLabel title = new JLabel();
        title.setText("Display Length:");
        title.setBounds(50,495,140,30);
        this.add(title);

        displayLength = new JTextPane();
        displayLength.setText("1");
        displayLength.setOpaque(true);
        displayLength.setBackground(Color.GRAY);
        displayLength.setBounds(145,495,50,30);
        this.add(displayLength);

        setLength = new JButton();
        setLength.setText("Seconds");
        setLength.setOpaque(true);
        setLength.setBackground(Color.GRAY);
        setLength.setBounds(210,495,100,30);
        setLength.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

            }
        });
        this.add(setLength);
    }

    /**
     * Public method to return the color selected by user for interest plot.
     */
    public Color getInterstColor(){
        return interest.getBoxColor();
    }

    /**
     * Public method to return the color selected by user for engagement plot.
     */
    public Color getEngagementColor(){
        return engagement.getBoxColor();
    }

    /**
     * Public method to return the color selected by user for stress plot.
     */
    public Color getStressColor(){
        return stress.getBoxColor();
    }

    /**
     * Public method to return the color selected by user for relaxation plot.
     */
    public Color getRelaxationColor(){
        return relaxation.getBoxColor();
    }

    /**
     * Public method to return the color selected by user for excitement plot.
     */
    public Color getExcitemetColor(){
        return excitement.getBoxColor();
    }

    /**
     * Public method to return the color selected by user for focus plot.
     */
    public Color getFocusColor(){
        return focus.getBoxColor();
    }

    /**
     * Public method to get the display length as per data entered by the user. Default is set to 1.
     */
    public String getDisplayLength(){
        return displayLength.getText();
    }
}