// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The VPC Peering configuration is used to create VPC peering between Datastream and the consumer&#39;s VPC.
 * 
 */
public final class VpcPeeringConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final VpcPeeringConfigResponse Empty = new VpcPeeringConfigResponse();

    /**
     * A free subnet for peering. (CIDR of /29) TODO(b/172995841) add validators.
     * 
     */
    @Import(name="subnet", required=true)
    private String subnet;

    public String subnet() {
        return this.subnet;
    }

    /**
     * Fully qualified name of the VPC that Datastream will peer to. Format: `projects/{project}/global/{networks}/{name}`
     * 
     */
    @Import(name="vpc", required=true)
    private String vpc;

    public String vpc() {
        return this.vpc;
    }

    private VpcPeeringConfigResponse() {}

    private VpcPeeringConfigResponse(VpcPeeringConfigResponse $) {
        this.subnet = $.subnet;
        this.vpc = $.vpc;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpcPeeringConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpcPeeringConfigResponse $;

        public Builder() {
            $ = new VpcPeeringConfigResponse();
        }

        public Builder(VpcPeeringConfigResponse defaults) {
            $ = new VpcPeeringConfigResponse(Objects.requireNonNull(defaults));
        }

        public Builder subnet(String subnet) {
            $.subnet = subnet;
            return this;
        }

        public Builder vpc(String vpc) {
            $.vpc = vpc;
            return this;
        }

        public VpcPeeringConfigResponse build() {
            $.subnet = Objects.requireNonNull($.subnet, "expected parameter 'subnet' to be non-null");
            $.vpc = Objects.requireNonNull($.vpc, "expected parameter 'vpc' to be non-null");
            return $;
        }
    }

}
