package com.ak.ticketdto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ak.ticket.model.TicketBook;

public class TicketBookDto {

	public int addTicketBook(TicketBook book) {
		int result=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String Url="jdbc:mysql://localhost:3306/akash";
			String username="root";
			String password="root";
			Connection connection = DriverManager.getConnection(Url,username,password);
			String query="insert into ticketbooking(coustmername,departure,arrival,age,gender,trainclass,bearth)values(?,?,?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, book.getCoustmername());
			statement.setString(2, book.getDeparture());
			statement.setString(3, book.getArrival());
			statement.setString(4, book.getAge());
			statement.setString(5, book.getGender());
			statement.setString(6, book.getTrainclass());
			statement.setString(7, book.getBearth());
			result=statement.executeUpdate();
			System.out.println(result+"Successfully updated");
			statement.close();
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return result;
	}
}
