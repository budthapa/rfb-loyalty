package pro.budthapa.service.mapper;

import pro.budthapa.domain.*;
import pro.budthapa.service.dto.RfbEventAttendanceDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity RfbEventAttendance and its DTO RfbEventAttendanceDTO.
 */
@Mapper(componentModel = "spring", uses = {RfbEventMapper.class, RfbUserMapper.class})
public interface RfbEventAttendanceMapper extends EntityMapper<RfbEventAttendanceDTO, RfbEventAttendance> {

    @Mapping(source = "rfbEvent.id", target = "rfbEventId")
    @Mapping(source = "user.id", target = "userId")
    RfbEventAttendanceDTO toDto(RfbEventAttendance rfbEventAttendance); 

    @Mapping(source = "rfbEventId", target = "rfbEvent")
    @Mapping(source = "userId", target = "user")
    RfbEventAttendance toEntity(RfbEventAttendanceDTO rfbEventAttendanceDTO);

    default RfbEventAttendance fromId(Long id) {
        if (id == null) {
            return null;
        }
        RfbEventAttendance rfbEventAttendance = new RfbEventAttendance();
        rfbEventAttendance.setId(id);
        return rfbEventAttendance;
    }
}
