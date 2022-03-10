// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.configuration;

import io.pulumi.awsnative.configuration.inputs.AggregationAuthorizationTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AggregationAuthorizationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AggregationAuthorizationArgs Empty = new AggregationAuthorizationArgs();

    /**
     * The 12-digit account ID of the account authorized to aggregate data.
     * 
     */
    @InputImport(name="authorizedAccountId", required=true)
      private final Input<String> authorizedAccountId;

    public Input<String> getAuthorizedAccountId() {
        return this.authorizedAccountId;
    }

    /**
     * The region authorized to collect aggregated data.
     * 
     */
    @InputImport(name="authorizedAwsRegion", required=true)
      private final Input<String> authorizedAwsRegion;

    public Input<String> getAuthorizedAwsRegion() {
        return this.authorizedAwsRegion;
    }

    /**
     * The tags for the AggregationAuthorization.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<AggregationAuthorizationTagArgs>> tags;

    public Input<List<AggregationAuthorizationTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public AggregationAuthorizationArgs(
        Input<String> authorizedAccountId,
        Input<String> authorizedAwsRegion,
        @Nullable Input<List<AggregationAuthorizationTagArgs>> tags) {
        this.authorizedAccountId = Objects.requireNonNull(authorizedAccountId, "expected parameter 'authorizedAccountId' to be non-null");
        this.authorizedAwsRegion = Objects.requireNonNull(authorizedAwsRegion, "expected parameter 'authorizedAwsRegion' to be non-null");
        this.tags = tags;
    }

    private AggregationAuthorizationArgs() {
        this.authorizedAccountId = Input.empty();
        this.authorizedAwsRegion = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AggregationAuthorizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> authorizedAccountId;
        private Input<String> authorizedAwsRegion;
        private @Nullable Input<List<AggregationAuthorizationTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(AggregationAuthorizationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizedAccountId = defaults.authorizedAccountId;
    	      this.authorizedAwsRegion = defaults.authorizedAwsRegion;
    	      this.tags = defaults.tags;
        }

        public Builder authorizedAccountId(Input<String> authorizedAccountId) {
            this.authorizedAccountId = Objects.requireNonNull(authorizedAccountId);
            return this;
        }

        public Builder authorizedAccountId(String authorizedAccountId) {
            this.authorizedAccountId = Input.of(Objects.requireNonNull(authorizedAccountId));
            return this;
        }

        public Builder authorizedAwsRegion(Input<String> authorizedAwsRegion) {
            this.authorizedAwsRegion = Objects.requireNonNull(authorizedAwsRegion);
            return this;
        }

        public Builder authorizedAwsRegion(String authorizedAwsRegion) {
            this.authorizedAwsRegion = Input.of(Objects.requireNonNull(authorizedAwsRegion));
            return this;
        }

        public Builder tags(@Nullable Input<List<AggregationAuthorizationTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<AggregationAuthorizationTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public AggregationAuthorizationArgs build() {
            return new AggregationAuthorizationArgs(authorizedAccountId, authorizedAwsRegion, tags);
        }
    }
}
