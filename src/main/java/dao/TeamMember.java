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
public class TeamMember {
	@Id
	private long id;
	private long team;
	private long roleId;
	private Integer star;
	private Date createDtae;
	private Date modifyDtae;
}
