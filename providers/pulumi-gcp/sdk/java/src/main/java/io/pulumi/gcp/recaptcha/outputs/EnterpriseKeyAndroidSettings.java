// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.recaptcha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EnterpriseKeyAndroidSettings {
    /**
     * If set to true, it means allowed_package_names will not be enforced.
     * 
     */
    private final @Nullable Boolean allowAllPackageNames;
    /**
     * Android package names of apps allowed to use the key. Example: 'com.companyname.appname'
     * 
     */
    private final @Nullable List<String> allowedPackageNames;

    @OutputCustomType.Constructor
    private EnterpriseKeyAndroidSettings(
        @OutputCustomType.Parameter("allowAllPackageNames") @Nullable Boolean allowAllPackageNames,
        @OutputCustomType.Parameter("allowedPackageNames") @Nullable List<String> allowedPackageNames) {
        this.allowAllPackageNames = allowAllPackageNames;
        this.allowedPackageNames = allowedPackageNames;
    }

    /**
     * If set to true, it means allowed_package_names will not be enforced.
     * 
    */
    public Optional<Boolean> getAllowAllPackageNames() {
        return Optional.ofNullable(this.allowAllPackageNames);
    }
    /**
     * Android package names of apps allowed to use the key. Example: 'com.companyname.appname'
     * 
    */
    public List<String> getAllowedPackageNames() {
        return this.allowedPackageNames == null ? List.of() : this.allowedPackageNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnterpriseKeyAndroidSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowAllPackageNames;
        private @Nullable List<String> allowedPackageNames;

        public Builder() {
    	      // Empty
        }

        public Builder(EnterpriseKeyAndroidSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowAllPackageNames = defaults.allowAllPackageNames;
    	      this.allowedPackageNames = defaults.allowedPackageNames;
        }

        public Builder allowAllPackageNames(@Nullable Boolean allowAllPackageNames) {
            this.allowAllPackageNames = allowAllPackageNames;
            return this;
        }

        public Builder allowedPackageNames(@Nullable List<String> allowedPackageNames) {
            this.allowedPackageNames = allowedPackageNames;
            return this;
        }
        public EnterpriseKeyAndroidSettings build() {
            return new EnterpriseKeyAndroidSettings(allowAllPackageNames, allowedPackageNames);
        }
    }
}
