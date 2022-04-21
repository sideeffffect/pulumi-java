// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudidentity_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudidentity_v1.inputs.DynamicGroupQueryArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Dynamic group metadata like queries and status.
 * 
 */
public final class DynamicGroupMetadataArgs extends com.pulumi.resources.ResourceArgs {

    public static final DynamicGroupMetadataArgs Empty = new DynamicGroupMetadataArgs();

    /**
     * Memberships will be the union of all queries. Only one entry with USER resource is currently supported. Customers can create up to 100 dynamic groups.
     * 
     */
    @Import(name="queries")
    private @Nullable Output<List<DynamicGroupQueryArgs>> queries;

    public Optional<Output<List<DynamicGroupQueryArgs>>> queries() {
        return Optional.ofNullable(this.queries);
    }

    private DynamicGroupMetadataArgs() {}

    private DynamicGroupMetadataArgs(DynamicGroupMetadataArgs $) {
        this.queries = $.queries;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DynamicGroupMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DynamicGroupMetadataArgs $;

        public Builder() {
            $ = new DynamicGroupMetadataArgs();
        }

        public Builder(DynamicGroupMetadataArgs defaults) {
            $ = new DynamicGroupMetadataArgs(Objects.requireNonNull(defaults));
        }

        public Builder queries(@Nullable Output<List<DynamicGroupQueryArgs>> queries) {
            $.queries = queries;
            return this;
        }

        public Builder queries(List<DynamicGroupQueryArgs> queries) {
            return queries(Output.of(queries));
        }

        public Builder queries(DynamicGroupQueryArgs... queries) {
            return queries(List.of(queries));
        }

        public DynamicGroupMetadataArgs build() {
            return $;
        }
    }

}
