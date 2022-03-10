// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CmkKeyVaultPropertiesResponse {
    /**
     * The key uri of the Customer Managed Key
     * 
     */
    private final @Nullable String keyUri;

    @OutputCustomType.Constructor
    private CmkKeyVaultPropertiesResponse(@OutputCustomType.Parameter("keyUri") @Nullable String keyUri) {
        this.keyUri = keyUri;
    }

    /**
     * The key uri of the Customer Managed Key
     * 
    */
    public Optional<String> getKeyUri() {
        return Optional.ofNullable(this.keyUri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CmkKeyVaultPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyUri;

        public Builder() {
    	      // Empty
        }

        public Builder(CmkKeyVaultPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyUri = defaults.keyUri;
        }

        public Builder keyUri(@Nullable String keyUri) {
            this.keyUri = keyUri;
            return this;
        }
        public CmkKeyVaultPropertiesResponse build() {
            return new CmkKeyVaultPropertiesResponse(keyUri);
        }
    }
}
