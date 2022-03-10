// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakestore.inputs;

import io.pulumi.azurenative.datalakestore.enums.EncryptionIdentityType;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


/**
 * The encryption identity properties.
 * 
 */
public final class EncryptionIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final EncryptionIdentityArgs Empty = new EncryptionIdentityArgs();

    /**
     * The type of encryption being used. Currently the only supported type is 'SystemAssigned'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<EncryptionIdentityType> type;

    public Input<EncryptionIdentityType> getType() {
        return this.type;
    }

    public EncryptionIdentityArgs(Input<EncryptionIdentityType> type) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private EncryptionIdentityArgs() {
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<EncryptionIdentityType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(Input<EncryptionIdentityType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(EncryptionIdentityType type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public EncryptionIdentityArgs build() {
            return new EncryptionIdentityArgs(type);
        }
    }
}
