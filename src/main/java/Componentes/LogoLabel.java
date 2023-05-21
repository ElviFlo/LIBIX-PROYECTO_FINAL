package org.example.Custom;

import java.awt.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

public class LogoLabel extends JLabel {

    public Icon getImage() {
        return image;
    }

    public void setImage(Icon image) {
        this.image = image;
        repaint();
    }

    public boolean isEnableHeigth() {
        return enableHeigth;
    }

    public void setEnableHeigth(boolean enableHeigth) {
        this.enableHeigth = enableHeigth;
        repaint();
    }

    private Icon image;
    private boolean enableHeigth = true;
    private RenderingHints rh;

    public LogoLabel() {
        rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        rh.put(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        rh.put(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
        rh.put(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
        rh.put(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2d = (Graphics2D) grphcs;
        g2d.setRenderingHints(rh);

        setBorder(new EmptyBorder(0, 0, 0, 0));
        if (image != null) {
            if (enableHeigth) {
                double newHeigth = ((double) image.getIconHeight() * (double) getWidth()) / (double) image.getIconWidth();
                g2d.drawImage(((ImageIcon) image).getImage(), 0, 0, getWidth(), (int) newHeigth, null);
            } else {
                double newWidth = ((double) image.getIconWidth() * (double) getHeight()) / (double) image.getIconHeight();
                g2d.drawImage(((ImageIcon) image).getImage(), 0, 0, (int) newWidth, getHeight(), null);
            }
        }
        super.paintComponent(grphcs);
    }

}
