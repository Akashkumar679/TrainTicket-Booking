package com.ak.ticketcontroller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ak.ticket.model.TicketBook;
import com.ak.ticketdto.TicketBookDto;
@WebServlet("/TicketBooking")
public class TicketBooking extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		String coustmername=req.getParameter("coustmername");
		String departure=req.getParameter("departure");
		String arrival=req.getParameter("arrival");
		String age=req.getParameter("age");
		String gender=req.getParameter("gender");
		String trainclass=req.getParameter("trainclass");
		String bearth=req.getParameter("bearth");
		
		
		TicketBook ticketBook = new TicketBook();
		ticketBook.setCoustmername(coustmername);
		ticketBook.setDeparture(departure);
		ticketBook.setArrival(arrival);
		ticketBook.setAge(age);
		ticketBook.setGender(gender);
		ticketBook.setTrainclass(trainclass);
		ticketBook.setBearth(bearth);
		
		TicketBookDto bookDto = new TicketBookDto();
		bookDto.addTicketBook(ticketBook);
		out.println("Succesfully booked");
		
	}
}
