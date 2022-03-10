// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.mixedreality.inputs;

import io.pulumi.azurenative.mixedreality.enums.ResourceIdentityType;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ObjectAnchorsAccountIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final ObjectAnchorsAccountIdentityArgs Empty = new ObjectAnchorsAccountIdentityArgs();

    /**
     * The identity type.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<ResourceIdentityType> type;

    public Input<ResourceIdentityType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public ObjectAnchorsAccountIdentityArgs(@Nullable Input<ResourceIdentityType> type) {
        this.type = type;
    }

    private ObjectAnchorsAccountIdentityArgs() {
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectAnchorsAccountIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ResourceIdentityType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectAnchorsAccountIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(@Nullable Input<ResourceIdentityType> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable ResourceIdentityType type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public ObjectAnchorsAccountIdentityArgs build() {
            return new ObjectAnchorsAccountIdentityArgs(type);
        }
    }
}
