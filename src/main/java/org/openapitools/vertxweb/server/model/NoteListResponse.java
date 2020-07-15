package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.vertxweb.server.model.BaseResponse;
import org.openapitools.vertxweb.server.model.NoteRecord;
import org.openapitools.vertxweb.server.model.Status;

/**
 * A response that contains an arbitrary number of notes.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NoteListResponse extends BaseResponse  {
  
  private List<NoteRecord> notes = new ArrayList<>();

  public NoteListResponse () {

  }

  public NoteListResponse (List<NoteRecord> notes) {
    this.notes = notes;
  }

    
  @JsonProperty("notes")
  public List<NoteRecord> getNotes() {
    return notes;
  }
  public void setNotes(List<NoteRecord> notes) {
    this.notes = notes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NoteListResponse noteListResponse = (NoteListResponse) o;
    return Objects.equals(notes, noteListResponse.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NoteListResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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
