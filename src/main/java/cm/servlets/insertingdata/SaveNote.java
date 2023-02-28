package cm.servlets.insertingdata;

import java.io.IOException;
import java.util.Date;

import entities.tables.Note;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SaveNote extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		Date createdDate = new Date();

		Note noteOne = new Note();
		noteOne.setNoteTitle(title);
		noteOne.setNoteContent(content);
		noteOne.setCreatedDate(createdDate);

		response.getWriter().println("title: " + noteOne.getNoteTitle() + " Content: " + noteOne.getNoteContent() + " Created At: "
				+ noteOne.getCreatedDate());
	}
}
