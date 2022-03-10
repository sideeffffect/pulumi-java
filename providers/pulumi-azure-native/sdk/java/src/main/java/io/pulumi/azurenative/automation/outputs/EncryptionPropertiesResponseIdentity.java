// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EncryptionPropertiesResponseIdentity {
    /**
     * The user identity used for CMK. It will be an ARM resource id in the form: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     * 
     */
    private final @Nullable Object userAssignedIdentity;

    @OutputCustomType.Constructor
    private EncryptionPropertiesResponseIdentity(@OutputCustomType.Parameter("userAssignedIdentity") @Nullable Object userAssignedIdentity) {
        this.userAssignedIdentity = userAssignedIdentity;
    }

    /**
     * The user identity used for CMK. It will be an ARM resource id in the form: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     * 
    */
    public Optional<Object> getUserAssignedIdentity() {
        return Optional.ofNullable(this.userAssignedIdentity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionPropertiesResponseIdentity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object userAssignedIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionPropertiesResponseIdentity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.userAssignedIdentity = defaults.userAssignedIdentity;
        }

        public Builder userAssignedIdentity(@Nullable Object userAssignedIdentity) {
            this.userAssignedIdentity = userAssignedIdentity;
            return this;
        }
        public EncryptionPropertiesResponseIdentity build() {
            return new EncryptionPropertiesResponseIdentity(userAssignedIdentity);
        }
    }
}
