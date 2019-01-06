package protoctol.response;

import lombok.Data;
import protoctol.Packet;

import static protoctol.command.Command.LOGIN_RESPONSE;

@Data
public class LoginResponsePacket extends Packet {

    private String userId;

    private String userName;

    private boolean success;

    private String reason;

    @Override
    public Byte getCommand() {
        return LOGIN_RESPONSE;
    }
}
