// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.memorydb;

import io.pulumi.awsnative.memorydb.inputs.SubnetGroupTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubnetGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubnetGroupArgs Empty = new SubnetGroupArgs();

    /**
     * An optional description of the subnet group.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The name of the subnet group. This value must be unique as it also serves as the subnet group identifier.
     * 
     */
    @InputImport(name="subnetGroupName")
      private final @Nullable Input<String> subnetGroupName;

    public Input<String> getSubnetGroupName() {
        return this.subnetGroupName == null ? Input.empty() : this.subnetGroupName;
    }

    /**
     * A list of VPC subnet IDs for the subnet group.
     * 
     */
    @InputImport(name="subnetIds", required=true)
      private final Input<List<String>> subnetIds;

    public Input<List<String>> getSubnetIds() {
        return this.subnetIds;
    }

    /**
     * An array of key-value pairs to apply to this subnet group.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<SubnetGroupTagArgs>> tags;

    public Input<List<SubnetGroupTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public SubnetGroupArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> subnetGroupName,
        Input<List<String>> subnetIds,
        @Nullable Input<List<SubnetGroupTagArgs>> tags) {
        this.description = description;
        this.subnetGroupName = subnetGroupName;
        this.subnetIds = Objects.requireNonNull(subnetIds, "expected parameter 'subnetIds' to be non-null");
        this.tags = tags;
    }

    private SubnetGroupArgs() {
        this.description = Input.empty();
        this.subnetGroupName = Input.empty();
        this.subnetIds = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> subnetGroupName;
        private Input<List<String>> subnetIds;
        private @Nullable Input<List<SubnetGroupTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.subnetGroupName = defaults.subnetGroupName;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder subnetGroupName(@Nullable Input<String> subnetGroupName) {
            this.subnetGroupName = subnetGroupName;
            return this;
        }

        public Builder subnetGroupName(@Nullable String subnetGroupName) {
            this.subnetGroupName = Input.ofNullable(subnetGroupName);
            return this;
        }

        public Builder subnetIds(Input<List<String>> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }

        public Builder subnetIds(List<String> subnetIds) {
            this.subnetIds = Input.of(Objects.requireNonNull(subnetIds));
            return this;
        }

        public Builder tags(@Nullable Input<List<SubnetGroupTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<SubnetGroupTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public SubnetGroupArgs build() {
            return new SubnetGroupArgs(description, subnetGroupName, subnetIds, tags);
        }
    }
}
