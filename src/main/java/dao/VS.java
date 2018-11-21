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
public class VS {
	@Id
	private long id;
	private long myTeam;
	private long enemyTeam;
	private Integer win;
	private Integer lose;
	private Date createDtae;
	private Date modifyDtae;
}
