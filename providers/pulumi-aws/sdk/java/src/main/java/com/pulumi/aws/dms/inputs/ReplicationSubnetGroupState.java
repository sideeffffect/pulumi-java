// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReplicationSubnetGroupState extends com.pulumi.resources.ResourceArgs {

    public static final ReplicationSubnetGroupState Empty = new ReplicationSubnetGroupState();

    @Import(name="replicationSubnetGroupArn")
    private @Nullable Output<String> replicationSubnetGroupArn;

    public Optional<Output<String>> replicationSubnetGroupArn() {
        return Optional.ofNullable(this.replicationSubnetGroupArn);
    }

    /**
     * The description for the subnet group.
     * 
     */
    @Import(name="replicationSubnetGroupDescription")
    private @Nullable Output<String> replicationSubnetGroupDescription;

    /**
     * @return The description for the subnet group.
     * 
     */
    public Optional<Output<String>> replicationSubnetGroupDescription() {
        return Optional.ofNullable(this.replicationSubnetGroupDescription);
    }

    /**
     * The name for the replication subnet group. This value is stored as a lowercase string.
     * 
     */
    @Import(name="replicationSubnetGroupId")
    private @Nullable Output<String> replicationSubnetGroupId;

    /**
     * @return The name for the replication subnet group. This value is stored as a lowercase string.
     * 
     */
    public Optional<Output<String>> replicationSubnetGroupId() {
        return Optional.ofNullable(this.replicationSubnetGroupId);
    }

    /**
     * A list of the EC2 subnet IDs for the subnet group.
     * 
     */
    @Import(name="subnetIds")
    private @Nullable Output<List<String>> subnetIds;

    /**
     * @return A list of the EC2 subnet IDs for the subnet group.
     * 
     */
    public Optional<Output<List<String>>> subnetIds() {
        return Optional.ofNullable(this.subnetIds);
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * The ID of the VPC the subnet group is in.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return The ID of the VPC the subnet group is in.
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    private ReplicationSubnetGroupState() {}

    private ReplicationSubnetGroupState(ReplicationSubnetGroupState $) {
        this.replicationSubnetGroupArn = $.replicationSubnetGroupArn;
        this.replicationSubnetGroupDescription = $.replicationSubnetGroupDescription;
        this.replicationSubnetGroupId = $.replicationSubnetGroupId;
        this.subnetIds = $.subnetIds;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReplicationSubnetGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReplicationSubnetGroupState $;

        public Builder() {
            $ = new ReplicationSubnetGroupState();
        }

        public Builder(ReplicationSubnetGroupState defaults) {
            $ = new ReplicationSubnetGroupState(Objects.requireNonNull(defaults));
        }

        public Builder replicationSubnetGroupArn(@Nullable Output<String> replicationSubnetGroupArn) {
            $.replicationSubnetGroupArn = replicationSubnetGroupArn;
            return this;
        }

        public Builder replicationSubnetGroupArn(String replicationSubnetGroupArn) {
            return replicationSubnetGroupArn(Output.of(replicationSubnetGroupArn));
        }

        /**
         * @param replicationSubnetGroupDescription The description for the subnet group.
         * 
         * @return builder
         * 
         */
        public Builder replicationSubnetGroupDescription(@Nullable Output<String> replicationSubnetGroupDescription) {
            $.replicationSubnetGroupDescription = replicationSubnetGroupDescription;
            return this;
        }

        /**
         * @param replicationSubnetGroupDescription The description for the subnet group.
         * 
         * @return builder
         * 
         */
        public Builder replicationSubnetGroupDescription(String replicationSubnetGroupDescription) {
            return replicationSubnetGroupDescription(Output.of(replicationSubnetGroupDescription));
        }

        /**
         * @param replicationSubnetGroupId The name for the replication subnet group. This value is stored as a lowercase string.
         * 
         * @return builder
         * 
         */
        public Builder replicationSubnetGroupId(@Nullable Output<String> replicationSubnetGroupId) {
            $.replicationSubnetGroupId = replicationSubnetGroupId;
            return this;
        }

        /**
         * @param replicationSubnetGroupId The name for the replication subnet group. This value is stored as a lowercase string.
         * 
         * @return builder
         * 
         */
        public Builder replicationSubnetGroupId(String replicationSubnetGroupId) {
            return replicationSubnetGroupId(Output.of(replicationSubnetGroupId));
        }

        /**
         * @param subnetIds A list of the EC2 subnet IDs for the subnet group.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(@Nullable Output<List<String>> subnetIds) {
            $.subnetIds = subnetIds;
            return this;
        }

        /**
         * @param subnetIds A list of the EC2 subnet IDs for the subnet group.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(List<String> subnetIds) {
            return subnetIds(Output.of(subnetIds));
        }

        /**
         * @param subnetIds A list of the EC2 subnet IDs for the subnet group.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param vpcId The ID of the VPC the subnet group is in.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The ID of the VPC the subnet group is in.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public ReplicationSubnetGroupState build() {
            return $;
        }
    }

}
