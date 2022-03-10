// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Purview Configuration
 * 
 */
public final class PurviewConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final PurviewConfigurationResponse Empty = new PurviewConfigurationResponse();

    /**
     * Purview Resource ID
     * 
     */
    @InputImport(name="purviewResourceId")
      private final @Nullable String purviewResourceId;

    public Optional<String> getPurviewResourceId() {
        return this.purviewResourceId == null ? Optional.empty() : Optional.ofNullable(this.purviewResourceId);
    }

    public PurviewConfigurationResponse(@Nullable String purviewResourceId) {
        this.purviewResourceId = purviewResourceId;
    }

    private PurviewConfigurationResponse() {
        this.purviewResourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PurviewConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String purviewResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(PurviewConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.purviewResourceId = defaults.purviewResourceId;
        }

        public Builder purviewResourceId(@Nullable String purviewResourceId) {
            this.purviewResourceId = purviewResourceId;
            return this;
        }
        public PurviewConfigurationResponse build() {
            return new PurviewConfigurationResponse(purviewResourceId);
        }
    }
}
