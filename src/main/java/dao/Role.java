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
public class Role {
	@Id
	private long id;
	private String name;
	private String img;
	private Date createDtae;
	private Date modifyDtae;
}
