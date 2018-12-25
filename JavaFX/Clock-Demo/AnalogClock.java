import javafx.animation.*;
import javafx.beans.property.DoubleProperty;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.DateFormat;
import java.util.Calendar;

/**
 * Date: Saturday, December 8, 2018 
 * Class: CS 111B-Programming Fundamentals: Java-551
 * Assignment: CCSF Intro to Java Final Project
 * 
 * @author Kelly Hong and Vee McClure
 * @version 1
 */


/**
 * Displays an animated AnalogClock face. Time is the system time for the local
 * time zone.
 */

public class AnalogClock extends Group {
	final int HOUR_HAND_LENGTH = 50;
	final int MINUTE_HAND_LENGTH = 75;
	final int SECOND_HAND_LENGTH = 88;
	final int SECOND_HAND_OFFSET = 15;
	final Label dateTimeLabel = new Label("date");

	AnalogClock(double clockRadius) {
		setId("AnalogClock");

		// construct the AnalogClock pieces
		final Circle face = createClockFace(clockRadius);
		String strDate = dateToString();
		final Label date = createDateLabel(face, strDate);
		final Line hourHand = createHand("hourHand", clockRadius, 0, percentOf(HOUR_HAND_LENGTH, clockRadius));
		final Line minuteHand = createHand("minuteHand", clockRadius, 0, percentOf(MINUTE_HAND_LENGTH, clockRadius));
		final Line secondHand = createHand("secondHand", clockRadius, percentOf(SECOND_HAND_OFFSET, clockRadius),
				percentOf(SECOND_HAND_LENGTH, clockRadius));

		// animate the hands with the time
		bindClockHandsToTime(hourHand, minuteHand, secondHand);

		getChildren().addAll(face,
		date, createTicks(clockRadius), createSpindle(clockRadius), hourHand, minuteHand, secondHand);

		// dynamically update date time stamp
		updateDateTimeLabel();

	}

	/** 
	 * creates tick marks in clock face with clockRadius creating the radius of the clock face
	 * radial ticks move around the clock center 
	 * */
	private Group createTicks(double clockRadius) {
		final double TICK_START_OFFSET = percentOf(83, clockRadius);
		final double TICK_END_OFFSET = percentOf(93, clockRadius);

		final Group ticks = new Group();
		for (int i = 0; i < 12; i++) {
			Line tick = new Line(0, -TICK_START_OFFSET, 0, -TICK_END_OFFSET);
			tick.getStyleClass().add("tick");
			tick.setLayoutX(clockRadius);
			tick.setLayoutY(clockRadius);
			tick.getTransforms().add(new Rotate(i * (360 / 12)));
			ticks.getChildren().add(tick);
		}
		return ticks;
	}

	/** 
	 * creates spindle / center where all hands originate from and rotate on the axis of
	 * @return a rendered spindle around which the clockwork rotates 
	 */
	private Circle createSpindle(double clockRadius) {
		final Circle spindle = new Circle(clockRadius, clockRadius, 5);
		spindle.setId("spindle");
		return spindle;
	}

	/** 
	 * creates clock face
	 * @return rendered clock face 
	 */
	private Circle createClockFace(double clockRadius) {
		final Circle face = new Circle(clockRadius, clockRadius, clockRadius);
		face.setFill(Color.WHITE);
		face.setId("face");
		return face;
	}

	/** 
	 * creates clock's secondHand
	 * handOffsetLength dictates how much to offset the hand length
	 * handLength length of the clock hand
	 * 
	 * @return clock's secondHand 
	 */
	private Line createHand(String handId, double clockRadius, double handOffsetLength, double handLength) {
		final Line secondHand = new Line(0, handOffsetLength, 0, -handLength);
		secondHand.setLayoutX(clockRadius);
		secondHand.setLayoutY(clockRadius);
		secondHand.setId(handId);
		return secondHand;
	}

	/** 
	 * creates clock's date time label
	 * @param face clock face
	 * @param strDate date time in a string object format 
	 * 
	 * @return clock's secondHand 
	 */
	private Label createDateLabel(Circle face, String strDate) {
		dateTimeLabel.setText(strDate);
		dateTimeLabel.setId("date");
		dateTimeLabel.layoutXProperty().bind(face.centerXProperty().subtract(dateTimeLabel.widthProperty().divide(2)));
		dateTimeLabel.layoutYProperty().bind(face.centerYProperty().add(face.radiusProperty().divide(2)));
		return dateTimeLabel;
	}

	/** 
	 * gets current date time and turns it into a string object 
	 * 
	 * @return current date time and turns it into a string object 
	 */
	private String dateToString() {
		Date currentDate = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("EEE, MMM d yyyy hh:mm aaa");

		String strDate = dateFormat.format(currentDate);
		return strDate;
	}

	/** 
	 * sets clock hands to correct hour, min, second
	 * @param hourHand clock's hour hand
	 * @param minuteHand clock's minute hand
	 * @param secondHand clock's second hand
	 */
	private void bindClockHandsToTime(final Line hourHand, final Line minuteHand, final Line secondHand) {
		// determine initial rotation for the clock hands.
		Calendar time = Calendar.getInstance();
		final double initialHourhandDegrees = calculateHourHandDegrees(time);
		final double initialMinuteHandDegrees = calculateMinuteHandDegrees(time);
		final double initialSecondHandDegrees = calculateSecondHandDegrees(time);

		// animate the clock movements using timelines.
		createRotationTimeline( // the hour hand rotates twice a day.
				createRotate(hourHand, initialHourhandDegrees).angleProperty(), Duration.hours(12),
				initialHourhandDegrees);
		createRotationTimeline( // the minute hand rotates once an hour.
				createRotate(minuteHand, initialMinuteHandDegrees).angleProperty(), Duration.minutes(60),
				initialMinuteHandDegrees);
		createRotationTimeline( // move second hand rotates once a minute.
				createRotate(secondHand, initialSecondHandDegrees).angleProperty(), Duration.seconds(60),
				initialSecondHandDegrees);
	}

	 /**
	 * handles rotation of hour hand
	 * @param hand clock's hour hand
	 * @param initialHandDegrees hour hand's degrees
	 * @return degree of rotation for hour hand
	 */
	private Rotate createRotate(Line hand, double initialHandDegrees) {
		final Rotate hourRotate = new Rotate(initialHandDegrees);
		hand.getTransforms().add(hourRotate);
		return hourRotate;
	}

	/**
	 * Performs a 360 degree rotation of the angleProperty once in every duration.
	 * rotation starts from initialRotation degrees.
	 */
	private void createRotationTimeline(DoubleProperty angleProperty, Duration duration, double initialRotation) {
		Timeline timeline = new Timeline(
				new KeyFrame(duration, new KeyValue(angleProperty, 360 + initialRotation, Interpolator.LINEAR)));
		timeline.setCycleCount(Animation.INDEFINITE);
		timeline.play();
	}

	 /**
	 * dynamically updates date time stamp every second, Minute, hour, etc.
	 */
	public void updateDateTimeLabel() {
		Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE, MMM d yyyy HH:mm:ss");
			dateTimeLabel.setText(LocalDateTime.now().format(formatter));
		}), new KeyFrame(Duration.seconds(1)));
		clock.setCycleCount(Animation.INDEFINITE);
		clock.play();
	}

	 /**
	 * calculates the increments of seconds for the clock's seconds hand
	 * @param time current time
	 * @return degree of seconds hand 
		 */
	private int calculateSecondHandDegrees(Calendar time) {
		return time.get(Calendar.SECOND) * (360 / 60);
	}

	 /**
	 * calculates the increments of Minute for the clock's Minutes hand
	 * @param time current time
	 * @return degree of Minutes hand 
		 */
	private double calculateMinuteHandDegrees(Calendar time) {
		return (time.get(Calendar.MINUTE) + calculateSecondHandDegrees(time) / 360.0) * (360 / 60);
	}

	 /**
	 * calculates the increments of hour for the clock's hour hand
	 * @param time current time
	 * @return degree of hour hand 
		 */
	private double calculateHourHandDegrees(Calendar time) {
		return (time.get(Calendar.HOUR) + calculateMinuteHandDegrees(time) / 360.0) * (360 / 12);
	}

	 /**
	 * calculates the increments of seconds for the clock's seconds hand
	 * @param time current time
	 * @return double of seconds hand 
		 */
	private double percentOf(double percent, double clockRadius) {
		return percent / 100 * clockRadius;
	}

}
