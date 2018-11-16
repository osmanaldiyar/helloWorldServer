# helloWorldClient
Hello world client on Angular 7.

Before you begin you should have installed PostgreSql on your computer.

Instructions

1.First download serverside of this project. To download server-side of this project use:
git clone https://github.com/osmanaldiyar/helloWorldServer.git
2. Go to PostgreSql and create "homework" database and execute this query:

CREATE TABLE messages(
	id SERIAL,
	message VARCHAR(50)
);

INSERT INTO messages2("message") VALUES('Hello World!')

3.Open project and open application.properties and change username and password like in your postgresql


4. Now you should download client: git clone https://github.com/osmanaldiyar/helloWorldClient.git

5. Before you begin, make sure your development environment includes Node.js and an npm package manager.Angular requires Node.js version 8.x or 10.x. To check your version, run node -v in a terminal/console window.To check that you have the npm client installed, run npm -v in a terminal/console window.

6. Install the angular cli: npm install -g @angular/cli

7.Launch the DomashneezadanieApplication from server-side
8. Wait until server launches then, Go to the client folder "project1": cd project1, then start angular server(port 4200): ng serve --open

9. In your browser go to localhost:4200.





