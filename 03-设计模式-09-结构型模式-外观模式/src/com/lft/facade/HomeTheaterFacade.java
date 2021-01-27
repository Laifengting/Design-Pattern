package com.lft.facade;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-13 9:31
 * <p>
 * Class Name:      HomeTheaterFacade
 * Package Name:    com.lft.facade
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class HomeTheaterFacade {
	/**
	 * 定义各个子系统对象
	 */
	private DVDPlayer dvdPlayer;
	private Popcorn popcorn;
	private Projector projector;
	private Screen screen;
	private Stereo stereo;
	private TheaterLight theaterLight;
	
	/**
	 * 构造器
	 * @param dvdPlayer
	 * @param popcorn
	 * @param projector
	 * @param screen
	 * @param stereo
	 * @param theaterLight
	 */
	public HomeTheaterFacade() {
		this.dvdPlayer = DVDPlayer.getInstance();
		this.popcorn = Popcorn.getInstance();
		this.projector = Projector.getInstance();
		this.screen = Screen.getInstance();
		this.stereo = Stereo.getInstance();
		this.theaterLight = TheaterLight.getInstance();
	}
	
	/**
	 * 操作分成4步
	 */
	public void ready() {
		popcorn.on();
		popcorn.pop();
		screen.down();
		projector.on();
		stereo.on();
		dvdPlayer.on();
		theaterLight.dim();
	}
	
	public void play() {
		dvdPlayer.play();
	}
	
	public void pause() {
		dvdPlayer.pause();
	}
	
	public void end() {
		theaterLight.bright();
		dvdPlayer.off();
		stereo.off();
		projector.off();
		screen.up();
		popcorn.off();
	}
}
