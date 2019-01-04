package pl.lr.apps.fstats.mappers;

import pl.lr.apps.fstats.entities.MatchV;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class MatchVFieldSetMapper implements FieldSetMapper<MatchV> {

    @Override
    public MatchV mapFieldSet(FieldSet fs) throws BindException {
        MatchV matchV = new MatchV();
        if (fs == null) {
            return null;
        }
        //matchV.setDiv(fs.readString(0));
        //matchV.setDate(fs.readString(1));
        //matchV.setDate((Timestamp) fs.readDate(1, "dd/MM/yy"));
        matchV.setHome_team(fs.readString(1));
        //matchV.setAway_team(fs.readString(3));
        //matchV.setHg(fs.readInt(4));
        //matchV.setAg(fs.readInt(5));
        return matchV;
    }
}
