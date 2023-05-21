package org.example.Custom;

import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTargetAdapter;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class AnimatedPasswordField extends JPasswordField {

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
        repaint();
    }

    public boolean isEnableUnderline() {
        return enableUnderline;
    }

    public void setEnableUnderline(boolean enableUnderline) {
        this.enableUnderline = enableUnderline;
        repaint();
    }

    public Color getHintColor() {
        return hintColor;
    }

    public void setHintColor(Color hintColor) {
        this.hintColor = hintColor;
    }

    public boolean isShow() {
        return show;
    }

    public void setShow(boolean show) {
        this.show = show;
    }

    public Color getUnderlineColor() {
        return underlineColor;
    }

    public void setUnderlineColor(Color underlineColor) {
        this.underlineColor = underlineColor;
    }

    public int getUnderlineAlpha() {
        return underlineAlpha;
    }

    public void setUnderlineAlpha(int underlineAlpha) {
        if (underlineAlpha > 255) {
            underlineAlpha = 255;
        } else if (underlineAlpha < 0) {
            underlineAlpha = 0;
        }
        this.underlineAlpha = underlineAlpha;
    }

    private String hint = "";
    private Color hintColor = new Color(232, 232, 232);
    private final Animator animator;
    private float animate;
    private boolean show = true;
    private boolean enableUnderline = true;
    private Color underlineColor = new Color(0, 0, 0);
    private int underlineAlpha = 100;

    public AnimatedPasswordField() {
        setOpaque(false);
        setBorder(new EmptyBorder(9, 1, 9, 1));
        setBackground(new Color(0, 0, 0, 0));
        setForeground(new Color(255, 255, 255));
        setSelectionColor(new Color(200, 200, 200, 100));
        animator = new Animator(350, new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                if (show) {
                    animate = fraction;
                } else {
                    animate = 1f - fraction;
                }
                repaint();
            }

            @Override
            public void end() {
                show = !show;
                repaint();
            }

        });
        animator.setResolution(0);
        animator.setAcceleration(.5f);
        animator.setDeceleration(.5f);
        getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if (!getText().equals("")) {
                    if (show) {
                        if (animator.isRunning() == false) {
                            stop();
                            animator.start();
                        }
                    } else if (animator.isRunning()) {
                        stop();
                        animator.start();
                    }
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if (getText().equals("")) {
                    stop();
                    animator.start();
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });

    }

    private void stop() {
        if (animator.isRunning()) {
            float f = animator.getTimingFraction();
            animator.stop();
            animator.setStartFraction(1f - f);
        } else {
            animator.setStartFraction(0f);
        }
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        if (enableUnderline) {
            g2.setColor(new Color(underlineColor.getRed(), underlineColor.getGreen(), underlineColor.getBlue(), underlineAlpha));
            g2.drawLine(0, getHeight() - 3, getWidth(), getHeight() - 3);
        }
        if (!hint.equals("")) {
            int h = getHeight();
            Insets ins = getInsets();
            FontMetrics fm = g.getFontMetrics();
            g2.setColor(hintColor);
            g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f - animate));
            g2.drawString(hint, ins.left + (animate * 30), h / 2 + fm.getAscent() / 2 - 1);
        }
        g2.dispose();
        super.paint(g);
    }
}
