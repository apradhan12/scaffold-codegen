package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.Note;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NoteWrapper   {
  
  private Note note;

  public NoteWrapper () {

  }

  public NoteWrapper (Note note) {
    this.note = note;
  }

    
  @JsonProperty("note")
  public Note getNote() {
    return note;
  }
  public void setNote(Note note) {
    this.note = note;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NoteWrapper noteWrapper = (NoteWrapper) o;
    return Objects.equals(note, noteWrapper.note);
  }

  @Override
  public int hashCode() {
    return Objects.hash(note);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NoteWrapper {\n");
    
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
