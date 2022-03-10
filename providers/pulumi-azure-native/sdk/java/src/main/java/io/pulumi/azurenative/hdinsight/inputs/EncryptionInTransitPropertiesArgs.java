// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The encryption-in-transit properties.
 * 
 */
public final class EncryptionInTransitPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final EncryptionInTransitPropertiesArgs Empty = new EncryptionInTransitPropertiesArgs();

    /**
     * Indicates whether or not inter cluster node communication is encrypted in transit.
     * 
     */
    @InputImport(name="isEncryptionInTransitEnabled")
      private final @Nullable Input<Boolean> isEncryptionInTransitEnabled;

    public Input<Boolean> getIsEncryptionInTransitEnabled() {
        return this.isEncryptionInTransitEnabled == null ? Input.empty() : this.isEncryptionInTransitEnabled;
    }

    public EncryptionInTransitPropertiesArgs(@Nullable Input<Boolean> isEncryptionInTransitEnabled) {
        this.isEncryptionInTransitEnabled = isEncryptionInTransitEnabled == null ? Input.ofNullable(false) : isEncryptionInTransitEnabled;
    }

    private EncryptionInTransitPropertiesArgs() {
        this.isEncryptionInTransitEnabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionInTransitPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> isEncryptionInTransitEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionInTransitPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isEncryptionInTransitEnabled = defaults.isEncryptionInTransitEnabled;
        }

        public Builder isEncryptionInTransitEnabled(@Nullable Input<Boolean> isEncryptionInTransitEnabled) {
            this.isEncryptionInTransitEnabled = isEncryptionInTransitEnabled;
            return this;
        }

        public Builder isEncryptionInTransitEnabled(@Nullable Boolean isEncryptionInTransitEnabled) {
            this.isEncryptionInTransitEnabled = Input.ofNullable(isEncryptionInTransitEnabled);
            return this;
        }
        public EncryptionInTransitPropertiesArgs build() {
            return new EncryptionInTransitPropertiesArgs(isEncryptionInTransitEnabled);
        }
    }
}
