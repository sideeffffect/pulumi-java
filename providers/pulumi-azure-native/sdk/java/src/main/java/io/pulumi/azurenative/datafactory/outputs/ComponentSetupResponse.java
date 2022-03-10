// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ComponentSetupResponse {
    /**
     * The name of the 3rd party component.
     * 
     */
    private final String componentName;
    /**
     * The license key to activate the component.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> licenseKey;
    /**
     * The type of custom setup.
     * Expected value is 'ComponentSetup'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private ComponentSetupResponse(
        @OutputCustomType.Parameter("componentName") String componentName,
        @OutputCustomType.Parameter("licenseKey") @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> licenseKey,
        @OutputCustomType.Parameter("type") String type) {
        this.componentName = componentName;
        this.licenseKey = licenseKey;
        this.type = type;
    }

    /**
     * The name of the 3rd party component.
     * 
    */
    public String getComponentName() {
        return this.componentName;
    }
    /**
     * The license key to activate the component.
     * 
    */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getLicenseKey() {
        return Optional.ofNullable(this.licenseKey);
    }
    /**
     * The type of custom setup.
     * Expected value is 'ComponentSetup'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComponentSetupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String componentName;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> licenseKey;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ComponentSetupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentName = defaults.componentName;
    	      this.licenseKey = defaults.licenseKey;
    	      this.type = defaults.type;
        }

        public Builder componentName(String componentName) {
            this.componentName = Objects.requireNonNull(componentName);
            return this;
        }

        public Builder licenseKey(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> licenseKey) {
            this.licenseKey = licenseKey;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ComponentSetupResponse build() {
            return new ComponentSetupResponse(componentName, licenseKey, type);
        }
    }
}
