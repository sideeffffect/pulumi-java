// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticache.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClusterArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterArgs Empty = new GetClusterArgs();

    /**
     * Group identifier.
     * 
     */
    @Import(name="clusterId", required=true)
    private String clusterId;

    public String clusterId() {
        return this.clusterId;
    }

    /**
     * The tags assigned to the resource
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetClusterArgs() {}

    private GetClusterArgs(GetClusterArgs $) {
        this.clusterId = $.clusterId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterArgs $;

        public Builder() {
            $ = new GetClusterArgs();
        }

        public Builder(GetClusterArgs defaults) {
            $ = new GetClusterArgs(Objects.requireNonNull(defaults));
        }

        public Builder clusterId(String clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetClusterArgs build() {
            $.clusterId = Objects.requireNonNull($.clusterId, "expected parameter 'clusterId' to be non-null");
            return $;
        }
    }

}
