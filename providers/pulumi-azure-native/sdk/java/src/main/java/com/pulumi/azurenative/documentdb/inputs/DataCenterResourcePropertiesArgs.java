// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.azurenative.documentdb.enums.ManagedCassandraProvisioningState;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of a managed Cassandra data center.
 * 
 */
public final class DataCenterResourcePropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataCenterResourcePropertiesArgs Empty = new DataCenterResourcePropertiesArgs();

    /**
     * A fragment of a cassandra.yaml configuration file to be included in the cassandra.yaml for all nodes in this data center. The fragment should be Base64 encoded, and only a subset of keys are allowed.
     * 
     */
    @Import(name="base64EncodedCassandraYamlFragment")
    private @Nullable Output<String> base64EncodedCassandraYamlFragment;

    public Optional<Output<String>> base64EncodedCassandraYamlFragment() {
        return Optional.ofNullable(this.base64EncodedCassandraYamlFragment);
    }

    /**
     * The region this data center should be created in.
     * 
     */
    @Import(name="dataCenterLocation")
    private @Nullable Output<String> dataCenterLocation;

    public Optional<Output<String>> dataCenterLocation() {
        return Optional.ofNullable(this.dataCenterLocation);
    }

    /**
     * Resource id of a subnet the nodes in this data center should have their network interfaces connected to. The subnet must be in the same region specified in &#39;dataCenterLocation&#39; and must be able to route to the subnet specified in the cluster&#39;s &#39;delegatedManagementSubnetId&#39; property. This resource id will be of the form &#39;/subscriptions/&lt;subscription id&gt;/resourceGroups/&lt;resource group&gt;/providers/Microsoft.Network/virtualNetworks/&lt;virtual network&gt;/subnets/&lt;subnet&gt;&#39;.
     * 
     */
    @Import(name="delegatedSubnetId")
    private @Nullable Output<String> delegatedSubnetId;

    public Optional<Output<String>> delegatedSubnetId() {
        return Optional.ofNullable(this.delegatedSubnetId);
    }

    /**
     * The number of nodes the data center should have. This is the desired number. After it is set, it may take some time for the data center to be scaled to match. To monitor the number of nodes and their status, use the fetchNodeStatus method on the cluster.
     * 
     */
    @Import(name="nodeCount")
    private @Nullable Output<Integer> nodeCount;

    public Optional<Output<Integer>> nodeCount() {
        return Optional.ofNullable(this.nodeCount);
    }

    /**
     * The status of the resource at the time the operation was called.
     * 
     */
    @Import(name="provisioningState")
    private @Nullable Output<Either<String,ManagedCassandraProvisioningState>> provisioningState;

    public Optional<Output<Either<String,ManagedCassandraProvisioningState>>> provisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }

    private DataCenterResourcePropertiesArgs() {}

    private DataCenterResourcePropertiesArgs(DataCenterResourcePropertiesArgs $) {
        this.base64EncodedCassandraYamlFragment = $.base64EncodedCassandraYamlFragment;
        this.dataCenterLocation = $.dataCenterLocation;
        this.delegatedSubnetId = $.delegatedSubnetId;
        this.nodeCount = $.nodeCount;
        this.provisioningState = $.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataCenterResourcePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataCenterResourcePropertiesArgs $;

        public Builder() {
            $ = new DataCenterResourcePropertiesArgs();
        }

        public Builder(DataCenterResourcePropertiesArgs defaults) {
            $ = new DataCenterResourcePropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder base64EncodedCassandraYamlFragment(@Nullable Output<String> base64EncodedCassandraYamlFragment) {
            $.base64EncodedCassandraYamlFragment = base64EncodedCassandraYamlFragment;
            return this;
        }

        public Builder base64EncodedCassandraYamlFragment(String base64EncodedCassandraYamlFragment) {
            return base64EncodedCassandraYamlFragment(Output.of(base64EncodedCassandraYamlFragment));
        }

        public Builder dataCenterLocation(@Nullable Output<String> dataCenterLocation) {
            $.dataCenterLocation = dataCenterLocation;
            return this;
        }

        public Builder dataCenterLocation(String dataCenterLocation) {
            return dataCenterLocation(Output.of(dataCenterLocation));
        }

        public Builder delegatedSubnetId(@Nullable Output<String> delegatedSubnetId) {
            $.delegatedSubnetId = delegatedSubnetId;
            return this;
        }

        public Builder delegatedSubnetId(String delegatedSubnetId) {
            return delegatedSubnetId(Output.of(delegatedSubnetId));
        }

        public Builder nodeCount(@Nullable Output<Integer> nodeCount) {
            $.nodeCount = nodeCount;
            return this;
        }

        public Builder nodeCount(Integer nodeCount) {
            return nodeCount(Output.of(nodeCount));
        }

        public Builder provisioningState(@Nullable Output<Either<String,ManagedCassandraProvisioningState>> provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        public Builder provisioningState(Either<String,ManagedCassandraProvisioningState> provisioningState) {
            return provisioningState(Output.of(provisioningState));
        }

        public DataCenterResourcePropertiesArgs build() {
            return $;
        }
    }

}
