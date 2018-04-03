package com.simsbackend;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing

public class SimsbackendapiApplication   extends Application {

	private ConfigurableApplicationContext springContext;
	private Parent root;

	@Override
	public void init() throws Exception {
		springContext = SpringApplication.run(SimsbackendapiApplication.class);
		//FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/resources/mainpage.fxml"));

		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getClassLoader().getResource("mainpage.fxml"));

		fxmlLoader.setControllerFactory(springContext::getBean);
		root = fxmlLoader.load();
	}


	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Hello World");
		Scene scene = new Scene(root, 800, 600);
		primaryStage.setScene(scene);
		primaryStage.show();
	}


	@Override
	public void stop() throws Exception {
		springContext.stop();
	}


	public static void main(String[] args) {
		launch(SimsbackendapiApplication.class, args);
	}


	//public static void main(String[] args) {
	//	SpringApplication.run(SimsbackendapiApplication.class, args);
	}




