package entities.tables;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "notes")
public class Note {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", length = 10)
	private int noteID;
	@Column(name = "title", length = 50)
	private String noteTitle;
	@Column(name = "content", length = 255)
	private String noteContent;
	@Column(name = "created_at")
	private Date createdDate;
	@Column(name = "updated_at")
	private Date updatedDate;

	public int getNoteID() {
		return noteID;
	}

	public void setNoteID(int noteID) {
		this.noteID = noteID;
	}

	public String getNoteTitle() {
		return noteTitle;
	}

	public void setNoteTitle(String noteTitle) {
		this.noteTitle = noteTitle;
	}

	public String getNoteContent() {
		return noteContent;
	}

	public void setNoteContent(String noteContent) {
		this.noteContent = noteContent;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Note(int noteID, String noteTitle, String noteContent, Date createdDate, Date updatedDate) {
		super();
		this.noteID = noteID;
		this.noteTitle = noteTitle;
		this.noteContent = noteContent;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}

}
