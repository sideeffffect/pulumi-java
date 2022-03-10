// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.accesscontextmanager_v1.enums.OsConstraintOsType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A restriction on the OS type and version of devices making requests.
 * 
 */
public final class OsConstraintArgs extends io.pulumi.resources.ResourceArgs {

    public static final OsConstraintArgs Empty = new OsConstraintArgs();

    /**
     * The minimum allowed OS version. If not set, any version of this OS satisfies the constraint. Format: `"major.minor.patch"`. Examples: `"10.5.301"`, `"9.2.1"`.
     * 
     */
    @InputImport(name="minimumVersion")
      private final @Nullable Input<String> minimumVersion;

    public Input<String> getMinimumVersion() {
        return this.minimumVersion == null ? Input.empty() : this.minimumVersion;
    }

    /**
     * The allowed OS type.
     * 
     */
    @InputImport(name="osType", required=true)
      private final Input<OsConstraintOsType> osType;

    public Input<OsConstraintOsType> getOsType() {
        return this.osType;
    }

    /**
     * Only allows requests from devices with a verified Chrome OS. Verifications includes requirements that the device is enterprise-managed, conformant to domain policies, and the caller has permission to call the API targeted by the request.
     * 
     */
    @InputImport(name="requireVerifiedChromeOs")
      private final @Nullable Input<Boolean> requireVerifiedChromeOs;

    public Input<Boolean> getRequireVerifiedChromeOs() {
        return this.requireVerifiedChromeOs == null ? Input.empty() : this.requireVerifiedChromeOs;
    }

    public OsConstraintArgs(
        @Nullable Input<String> minimumVersion,
        Input<OsConstraintOsType> osType,
        @Nullable Input<Boolean> requireVerifiedChromeOs) {
        this.minimumVersion = minimumVersion;
        this.osType = Objects.requireNonNull(osType, "expected parameter 'osType' to be non-null");
        this.requireVerifiedChromeOs = requireVerifiedChromeOs;
    }

    private OsConstraintArgs() {
        this.minimumVersion = Input.empty();
        this.osType = Input.empty();
        this.requireVerifiedChromeOs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsConstraintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> minimumVersion;
        private Input<OsConstraintOsType> osType;
        private @Nullable Input<Boolean> requireVerifiedChromeOs;

        public Builder() {
    	      // Empty
        }

        public Builder(OsConstraintArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minimumVersion = defaults.minimumVersion;
    	      this.osType = defaults.osType;
    	      this.requireVerifiedChromeOs = defaults.requireVerifiedChromeOs;
        }

        public Builder minimumVersion(@Nullable Input<String> minimumVersion) {
            this.minimumVersion = minimumVersion;
            return this;
        }

        public Builder minimumVersion(@Nullable String minimumVersion) {
            this.minimumVersion = Input.ofNullable(minimumVersion);
            return this;
        }

        public Builder osType(Input<OsConstraintOsType> osType) {
            this.osType = Objects.requireNonNull(osType);
            return this;
        }

        public Builder osType(OsConstraintOsType osType) {
            this.osType = Input.of(Objects.requireNonNull(osType));
            return this;
        }

        public Builder requireVerifiedChromeOs(@Nullable Input<Boolean> requireVerifiedChromeOs) {
            this.requireVerifiedChromeOs = requireVerifiedChromeOs;
            return this;
        }

        public Builder requireVerifiedChromeOs(@Nullable Boolean requireVerifiedChromeOs) {
            this.requireVerifiedChromeOs = Input.ofNullable(requireVerifiedChromeOs);
            return this;
        }
        public OsConstraintArgs build() {
            return new OsConstraintArgs(minimumVersion, osType, requireVerifiedChromeOs);
        }
    }
}
