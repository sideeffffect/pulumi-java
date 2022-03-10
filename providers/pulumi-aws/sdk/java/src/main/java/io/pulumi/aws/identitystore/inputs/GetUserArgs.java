// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.identitystore.inputs;

import io.pulumi.aws.identitystore.inputs.GetUserFilter;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetUserArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetUserArgs Empty = new GetUserArgs();

    /**
     * Configuration block(s) for filtering. Currently, the AWS Identity Store API supports only 1 filter. Detailed below.
     * 
     */
    @InputImport(name="filters", required=true)
      private final List<GetUserFilter> filters;

    public List<GetUserFilter> getFilters() {
        return this.filters;
    }

    /**
     * The Identity Store ID associated with the Single Sign-On Instance.
     * 
     */
    @InputImport(name="identityStoreId", required=true)
      private final String identityStoreId;

    public String getIdentityStoreId() {
        return this.identityStoreId;
    }

    /**
     * The identifier for a user in the Identity Store.
     * 
     */
    @InputImport(name="userId")
      private final @Nullable String userId;

    public Optional<String> getUserId() {
        return this.userId == null ? Optional.empty() : Optional.ofNullable(this.userId);
    }

    public GetUserArgs(
        List<GetUserFilter> filters,
        String identityStoreId,
        @Nullable String userId) {
        this.filters = Objects.requireNonNull(filters, "expected parameter 'filters' to be non-null");
        this.identityStoreId = Objects.requireNonNull(identityStoreId, "expected parameter 'identityStoreId' to be non-null");
        this.userId = userId;
    }

    private GetUserArgs() {
        this.filters = List.of();
        this.identityStoreId = null;
        this.userId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetUserFilter> filters;
        private String identityStoreId;
        private @Nullable String userId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.identityStoreId = defaults.identityStoreId;
    	      this.userId = defaults.userId;
        }

        public Builder filters(List<GetUserFilter> filters) {
            this.filters = Objects.requireNonNull(filters);
            return this;
        }

        public Builder identityStoreId(String identityStoreId) {
            this.identityStoreId = Objects.requireNonNull(identityStoreId);
            return this;
        }

        public Builder userId(@Nullable String userId) {
            this.userId = userId;
            return this;
        }
        public GetUserArgs build() {
            return new GetUserArgs(filters, identityStoreId, userId);
        }
    }
}
