import com.github.zengfr.easymodbus4j.app.client.UdpClientHandler;

public class CustomUdpClientHandler extends UdpClientHandler {

	@Override
	protected void channelRead0(String uuid, String deviceId, String ip, Integer port, String version,
			Integer functionCode, Integer address, String value, int success) throws Exception {
		 
	}

}