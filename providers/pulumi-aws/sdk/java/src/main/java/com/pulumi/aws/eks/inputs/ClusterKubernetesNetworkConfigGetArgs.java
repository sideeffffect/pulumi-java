// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.eks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterKubernetesNetworkConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterKubernetesNetworkConfigGetArgs Empty = new ClusterKubernetesNetworkConfigGetArgs();

    /**
     * The IP family used to assign Kubernetes pod and service addresses. Valid values are `ipv4` (default) and `ipv6`. You can only specify an IP family when you create a cluster, changing this value will force a new cluster to be created.
     * 
     */
    @Import(name="ipFamily")
    private @Nullable Output<String> ipFamily;

    public Optional<Output<String>> ipFamily() {
        return Optional.ofNullable(this.ipFamily);
    }

    /**
     * The CIDR block to assign Kubernetes service IP addresses from. If you don&#39;t specify a block, Kubernetes assigns addresses from either the 10.100.0.0/16 or 172.20.0.0/16 CIDR blocks. We recommend that you specify a block that does not overlap with resources in other networks that are peered or connected to your VPC. You can only specify a custom CIDR block when you create a cluster, changing this value will force a new cluster to be created. The block must meet the following requirements:
     * 
     */
    @Import(name="serviceIpv4Cidr")
    private @Nullable Output<String> serviceIpv4Cidr;

    public Optional<Output<String>> serviceIpv4Cidr() {
        return Optional.ofNullable(this.serviceIpv4Cidr);
    }

    private ClusterKubernetesNetworkConfigGetArgs() {}

    private ClusterKubernetesNetworkConfigGetArgs(ClusterKubernetesNetworkConfigGetArgs $) {
        this.ipFamily = $.ipFamily;
        this.serviceIpv4Cidr = $.serviceIpv4Cidr;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterKubernetesNetworkConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterKubernetesNetworkConfigGetArgs $;

        public Builder() {
            $ = new ClusterKubernetesNetworkConfigGetArgs();
        }

        public Builder(ClusterKubernetesNetworkConfigGetArgs defaults) {
            $ = new ClusterKubernetesNetworkConfigGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder ipFamily(@Nullable Output<String> ipFamily) {
            $.ipFamily = ipFamily;
            return this;
        }

        public Builder ipFamily(String ipFamily) {
            return ipFamily(Output.of(ipFamily));
        }

        public Builder serviceIpv4Cidr(@Nullable Output<String> serviceIpv4Cidr) {
            $.serviceIpv4Cidr = serviceIpv4Cidr;
            return this;
        }

        public Builder serviceIpv4Cidr(String serviceIpv4Cidr) {
            return serviceIpv4Cidr(Output.of(serviceIpv4Cidr));
        }

        public ClusterKubernetesNetworkConfigGetArgs build() {
            return $;
        }
    }

}
