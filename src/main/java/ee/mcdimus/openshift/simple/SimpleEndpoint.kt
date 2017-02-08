package ee.mcdimus.openshift.simple

import java.net.InetAddress
import javax.ws.rs.GET
import javax.ws.rs.Path

/**
 * @author Dmitri Maksimov
 */
@Path("status")
open class SimpleEndpoint {

  @GET
  open fun getStatus(): String {
    val ip = InetAddress.getLocalHost()
    return "Running (v2) on $ip (${ip.hostName})"
  }

}
