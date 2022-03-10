// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PrivateLinkServiceConnectionStateResponse {
    private final String actionRequired;
    private final @Nullable String description;
    private final String status;

    @OutputCustomType.Constructor
    private PrivateLinkServiceConnectionStateResponse(
        @OutputCustomType.Parameter("actionRequired") String actionRequired,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("status") String status) {
        this.actionRequired = actionRequired;
        this.description = description;
        this.status = status;
    }

    public String getActionRequired() {
        return this.actionRequired;
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkServiceConnectionStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String actionRequired;
        private @Nullable String description;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServiceConnectionStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionRequired = defaults.actionRequired;
    	      this.description = defaults.description;
    	      this.status = defaults.status;
        }

        public Builder actionRequired(String actionRequired) {
            this.actionRequired = Objects.requireNonNull(actionRequired);
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public PrivateLinkServiceConnectionStateResponse build() {
            return new PrivateLinkServiceConnectionStateResponse(actionRequired, description, status);
        }
    }
}
