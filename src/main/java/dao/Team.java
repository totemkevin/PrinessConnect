package dao;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Team {
	@Id
	private long id;
	private String type;
	private String note;
	private Date createDtae;
	private Date modifyDtae;
}
