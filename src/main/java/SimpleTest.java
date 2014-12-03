import PBFT.PBFTCohort;
import com.google.common.base.Optional;
import config.NetworkedGroupMember;

import java.net.InetSocketAddress;
import java.security.PrivateKey;

/**
 * Created by andrew on 12/3/14.
 */
public class SimpleTest {
    public static void main(String args[]) throws Exception {
        System.out.println("Starting to ping");
        PrivateKey pk = null;
        NetworkedGroupMember<PBFTCohort.Client> clientNetworkedGroupMember = new NetworkedGroupMember<PBFTCohort.Client>("server1", 1, new InetSocketAddress("corn01", 9001), PBFTCohort.Client.class, null, Optional.fromNullable(pk));

        PBFTCohort.Client thriftConnection = clientNetworkedGroupMember.getThriftConnection();

        thriftConnection.ping();
        System.out.println("Successfully pinged!");
    }}
