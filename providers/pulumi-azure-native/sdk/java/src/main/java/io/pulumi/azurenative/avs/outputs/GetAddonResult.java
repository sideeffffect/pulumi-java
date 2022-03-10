// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAddonResult {
    /**
     * The type of private cloud addon
     * 
     */
    private final @Nullable String addonType;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * The SRM license
     * 
     */
    private final @Nullable String licenseKey;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The state of the addon provisioning
     * 
     */
    private final String provisioningState;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetAddonResult(
        @OutputCustomType.Parameter("addonType") @Nullable String addonType,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("licenseKey") @Nullable String licenseKey,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("type") String type) {
        this.addonType = addonType;
        this.id = id;
        this.licenseKey = licenseKey;
        this.name = name;
        this.provisioningState = provisioningState;
        this.type = type;
    }

    /**
     * The type of private cloud addon
     * 
    */
    public Optional<String> getAddonType() {
        return Optional.ofNullable(this.addonType);
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The SRM license
     * 
    */
    public Optional<String> getLicenseKey() {
        return Optional.ofNullable(this.licenseKey);
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The state of the addon provisioning
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAddonResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String addonType;
        private String id;
        private @Nullable String licenseKey;
        private String name;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAddonResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addonType = defaults.addonType;
    	      this.id = defaults.id;
    	      this.licenseKey = defaults.licenseKey;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder addonType(@Nullable String addonType) {
            this.addonType = addonType;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder licenseKey(@Nullable String licenseKey) {
            this.licenseKey = licenseKey;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetAddonResult build() {
            return new GetAddonResult(addonType, id, licenseKey, name, provisioningState, type);
        }
    }
}
