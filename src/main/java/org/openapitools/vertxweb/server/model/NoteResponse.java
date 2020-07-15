package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.BaseResponse;
import org.openapitools.vertxweb.server.model.NoteRecord;
import org.openapitools.vertxweb.server.model.Status;

/**
 * A response that contains exactly one note.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NoteResponse extends BaseResponse  {
  
  private NoteRecord note;

  public NoteResponse () {

  }

  public NoteResponse (NoteRecord note) {
    this.note = note;
  }

    
  @JsonProperty("note")
  public NoteRecord getNote() {
    return note;
  }
  public void setNote(NoteRecord note) {
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
    NoteResponse noteResponse = (NoteResponse) o;
    return Objects.equals(note, noteResponse.note);
  }

  @Override
  public int hashCode() {
    return Objects.hash(note);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NoteResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
