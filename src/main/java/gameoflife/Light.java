package gameoflife;

import java.awt.Color;

import javax.swing.JButton;

public class Light extends JButton{

	private static final long serialVersionUID = 1L;

	/**
	 * coordonates of the light according to the GridLayout
	 */
	private int xPositionInGrid;

	/**
	 * coordonates of the light according to the GridLayout
	 */
	private int yPositionInGrid;

	/**
	 * define if the light is lit or not
	 */
	private boolean lit;

	/**
	 * construct a light
	 * @param abs the abscissa of the light
	 * @param ord the ordered of the light
	 */
	public Light( final int abs, final int ord ) {
		super();
		this.xPositionInGrid = abs;
		this.yPositionInGrid = ord;
		// Default color
		setBackground(Color.gray);
		this.lit = false;
	}

	public boolean getLit() {
		return this.lit;
	}

	public int getXPositionInGrid() {
		return this.xPositionInGrid;
	}

	public int getYPositionInGrid() {
		return this.yPositionInGrid;
	}

	/**
	 * turn on the light
	 */
	public void setOn() {
		setBackground( Color.green );
		this.lit = true;
	}

	/**
	 * turn off the light
	 */
	public void setOff() {
		setBackground( Color.gray );
		this.lit = false;
	}

	public void changeState() {
		if( this.lit ) {
			setOff();
		}
		else{
			setOn();
		}
	}
}