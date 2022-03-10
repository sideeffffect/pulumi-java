// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.aws.ec2.outputs.GetVpcPeeringConnectionCidrBlockSet;
import io.pulumi.aws.ec2.outputs.GetVpcPeeringConnectionFilter;
import io.pulumi.aws.ec2.outputs.GetVpcPeeringConnectionPeerCidrBlockSet;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetVpcPeeringConnectionResult {
    /**
     * A configuration block that describes [VPC Peering Connection]
     * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options set for the accepter VPC.
     * 
     */
    private final Map<String,Boolean> accepter;
    /**
     * A CIDR block associated to the VPC of the specific VPC Peering Connection.
     * 
     */
    private final String cidrBlock;
    /**
     * List of objects with CIDR blocks of the requester VPC.
     * 
     */
    private final List<GetVpcPeeringConnectionCidrBlockSet> cidrBlockSets;
    private final @Nullable List<GetVpcPeeringConnectionFilter> filters;
    private final String id;
    private final String ownerId;
    private final String peerCidrBlock;
    /**
     * List of objects with CIDR blocks of the accepter VPC.
     * 
     */
    private final List<GetVpcPeeringConnectionPeerCidrBlockSet> peerCidrBlockSets;
    private final String peerOwnerId;
    private final String peerRegion;
    private final String peerVpcId;
    private final String region;
    /**
     * A configuration block that describes [VPC Peering Connection]
     * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options set for the requester VPC.
     * 
     */
    private final Map<String,Boolean> requester;
    private final String status;
    private final Map<String,String> tags;
    private final String vpcId;

    @OutputCustomType.Constructor
    private GetVpcPeeringConnectionResult(
        @OutputCustomType.Parameter("accepter") Map<String,Boolean> accepter,
        @OutputCustomType.Parameter("cidrBlock") String cidrBlock,
        @OutputCustomType.Parameter("cidrBlockSets") List<GetVpcPeeringConnectionCidrBlockSet> cidrBlockSets,
        @OutputCustomType.Parameter("filters") @Nullable List<GetVpcPeeringConnectionFilter> filters,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("ownerId") String ownerId,
        @OutputCustomType.Parameter("peerCidrBlock") String peerCidrBlock,
        @OutputCustomType.Parameter("peerCidrBlockSets") List<GetVpcPeeringConnectionPeerCidrBlockSet> peerCidrBlockSets,
        @OutputCustomType.Parameter("peerOwnerId") String peerOwnerId,
        @OutputCustomType.Parameter("peerRegion") String peerRegion,
        @OutputCustomType.Parameter("peerVpcId") String peerVpcId,
        @OutputCustomType.Parameter("region") String region,
        @OutputCustomType.Parameter("requester") Map<String,Boolean> requester,
        @OutputCustomType.Parameter("status") String status,
        @OutputCustomType.Parameter("tags") Map<String,String> tags,
        @OutputCustomType.Parameter("vpcId") String vpcId) {
        this.accepter = accepter;
        this.cidrBlock = cidrBlock;
        this.cidrBlockSets = cidrBlockSets;
        this.filters = filters;
        this.id = id;
        this.ownerId = ownerId;
        this.peerCidrBlock = peerCidrBlock;
        this.peerCidrBlockSets = peerCidrBlockSets;
        this.peerOwnerId = peerOwnerId;
        this.peerRegion = peerRegion;
        this.peerVpcId = peerVpcId;
        this.region = region;
        this.requester = requester;
        this.status = status;
        this.tags = tags;
        this.vpcId = vpcId;
    }

    /**
     * A configuration block that describes [VPC Peering Connection]
     * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options set for the accepter VPC.
     * 
    */
    public Map<String,Boolean> getAccepter() {
        return this.accepter;
    }
    /**
     * A CIDR block associated to the VPC of the specific VPC Peering Connection.
     * 
    */
    public String getCidrBlock() {
        return this.cidrBlock;
    }
    /**
     * List of objects with CIDR blocks of the requester VPC.
     * 
    */
    public List<GetVpcPeeringConnectionCidrBlockSet> getCidrBlockSets() {
        return this.cidrBlockSets;
    }
    public List<GetVpcPeeringConnectionFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }
    public String getId() {
        return this.id;
    }
    public String getOwnerId() {
        return this.ownerId;
    }
    public String getPeerCidrBlock() {
        return this.peerCidrBlock;
    }
    /**
     * List of objects with CIDR blocks of the accepter VPC.
     * 
    */
    public List<GetVpcPeeringConnectionPeerCidrBlockSet> getPeerCidrBlockSets() {
        return this.peerCidrBlockSets;
    }
    public String getPeerOwnerId() {
        return this.peerOwnerId;
    }
    public String getPeerRegion() {
        return this.peerRegion;
    }
    public String getPeerVpcId() {
        return this.peerVpcId;
    }
    public String getRegion() {
        return this.region;
    }
    /**
     * A configuration block that describes [VPC Peering Connection]
     * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options set for the requester VPC.
     * 
    */
    public Map<String,Boolean> getRequester() {
        return this.requester;
    }
    public String getStatus() {
        return this.status;
    }
    public Map<String,String> getTags() {
        return this.tags;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpcPeeringConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,Boolean> accepter;
        private String cidrBlock;
        private List<GetVpcPeeringConnectionCidrBlockSet> cidrBlockSets;
        private @Nullable List<GetVpcPeeringConnectionFilter> filters;
        private String id;
        private String ownerId;
        private String peerCidrBlock;
        private List<GetVpcPeeringConnectionPeerCidrBlockSet> peerCidrBlockSets;
        private String peerOwnerId;
        private String peerRegion;
        private String peerVpcId;
        private String region;
        private Map<String,Boolean> requester;
        private String status;
        private Map<String,String> tags;
        private String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVpcPeeringConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accepter = defaults.accepter;
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.cidrBlockSets = defaults.cidrBlockSets;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.ownerId = defaults.ownerId;
    	      this.peerCidrBlock = defaults.peerCidrBlock;
    	      this.peerCidrBlockSets = defaults.peerCidrBlockSets;
    	      this.peerOwnerId = defaults.peerOwnerId;
    	      this.peerRegion = defaults.peerRegion;
    	      this.peerVpcId = defaults.peerVpcId;
    	      this.region = defaults.region;
    	      this.requester = defaults.requester;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder accepter(Map<String,Boolean> accepter) {
            this.accepter = Objects.requireNonNull(accepter);
            return this;
        }

        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = Objects.requireNonNull(cidrBlock);
            return this;
        }

        public Builder cidrBlockSets(List<GetVpcPeeringConnectionCidrBlockSet> cidrBlockSets) {
            this.cidrBlockSets = Objects.requireNonNull(cidrBlockSets);
            return this;
        }

        public Builder filters(@Nullable List<GetVpcPeeringConnectionFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder ownerId(String ownerId) {
            this.ownerId = Objects.requireNonNull(ownerId);
            return this;
        }

        public Builder peerCidrBlock(String peerCidrBlock) {
            this.peerCidrBlock = Objects.requireNonNull(peerCidrBlock);
            return this;
        }

        public Builder peerCidrBlockSets(List<GetVpcPeeringConnectionPeerCidrBlockSet> peerCidrBlockSets) {
            this.peerCidrBlockSets = Objects.requireNonNull(peerCidrBlockSets);
            return this;
        }

        public Builder peerOwnerId(String peerOwnerId) {
            this.peerOwnerId = Objects.requireNonNull(peerOwnerId);
            return this;
        }

        public Builder peerRegion(String peerRegion) {
            this.peerRegion = Objects.requireNonNull(peerRegion);
            return this;
        }

        public Builder peerVpcId(String peerVpcId) {
            this.peerVpcId = Objects.requireNonNull(peerVpcId);
            return this;
        }

        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder requester(Map<String,Boolean> requester) {
            this.requester = Objects.requireNonNull(requester);
            return this;
        }

        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public GetVpcPeeringConnectionResult build() {
            return new GetVpcPeeringConnectionResult(accepter, cidrBlock, cidrBlockSets, filters, id, ownerId, peerCidrBlock, peerCidrBlockSets, peerOwnerId, peerRegion, peerVpcId, region, requester, status, tags, vpcId);
        }
    }
}
