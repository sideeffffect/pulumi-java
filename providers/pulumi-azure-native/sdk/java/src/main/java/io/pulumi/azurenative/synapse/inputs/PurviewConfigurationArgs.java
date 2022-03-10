// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Purview Configuration
 * 
 */
public final class PurviewConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final PurviewConfigurationArgs Empty = new PurviewConfigurationArgs();

    /**
     * Purview Resource ID
     * 
     */
    @InputImport(name="purviewResourceId")
      private final @Nullable Input<String> purviewResourceId;

    public Input<String> getPurviewResourceId() {
        return this.purviewResourceId == null ? Input.empty() : this.purviewResourceId;
    }

    public PurviewConfigurationArgs(@Nullable Input<String> purviewResourceId) {
        this.purviewResourceId = purviewResourceId;
    }

    private PurviewConfigurationArgs() {
        this.purviewResourceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PurviewConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> purviewResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(PurviewConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.purviewResourceId = defaults.purviewResourceId;
        }

        public Builder purviewResourceId(@Nullable Input<String> purviewResourceId) {
            this.purviewResourceId = purviewResourceId;
            return this;
        }

        public Builder purviewResourceId(@Nullable String purviewResourceId) {
            this.purviewResourceId = Input.ofNullable(purviewResourceId);
            return this;
        }
        public PurviewConfigurationArgs build() {
            return new PurviewConfigurationArgs(purviewResourceId);
        }
    }
}
