private static class RoundedBorder implements Border {

    private int radius;


    RoundedBorder(int radius) {
        this.radius = radius;
    }


    public Insets getBorderInsets(Component c) {
        return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
    }


    public boolean isBorderOpaque() {
        return true;
    }


    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawRoundRect(x, y, width-1, height-1, radius, radius);
    }
}
/*
frame.add(button_panel);
button_panel.setLayout(new GridLayout(3,3));

for(int i=0;i<9; i++)
    {
      buttons[i]= new JButton();
      button_panel.add(button[i]);
      buttons[i].setFont(new Font("Comic Sans",Font.BOLD,120));
      buttons[i].setFocusable(false);
      buttons[i].addActionListener(this);
    }
 */
