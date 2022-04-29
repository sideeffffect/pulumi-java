// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessLevelsAccessLevelBasicConditionDevicePolicyOsConstraintArgs extends ResourceArgs {

    public static final AccessLevelsAccessLevelBasicConditionDevicePolicyOsConstraintArgs Empty = new AccessLevelsAccessLevelBasicConditionDevicePolicyOsConstraintArgs();

    /**
     * The minimum allowed OS version. If not set, any version
     * of this OS satisfies the constraint.
     * Format: &#34;major.minor.patch&#34; such as &#34;10.5.301&#34;, &#34;9.2.1&#34;.
     * 
     */
    @Import(name="minimumVersion")
    private @Nullable Output<String> minimumVersion;

    /**
     * @return The minimum allowed OS version. If not set, any version
     * of this OS satisfies the constraint.
     * Format: &#34;major.minor.patch&#34; such as &#34;10.5.301&#34;, &#34;9.2.1&#34;.
     * 
     */
    public Optional<Output<String>> minimumVersion() {
        return Optional.ofNullable(this.minimumVersion);
    }

    /**
     * The operating system type of the device.
     * Possible values are `OS_UNSPECIFIED`, `DESKTOP_MAC`, `DESKTOP_WINDOWS`, `DESKTOP_LINUX`, `DESKTOP_CHROME_OS`, `ANDROID`, and `IOS`.
     * 
     */
    @Import(name="osType", required=true)
    private Output<String> osType;

    /**
     * @return The operating system type of the device.
     * Possible values are `OS_UNSPECIFIED`, `DESKTOP_MAC`, `DESKTOP_WINDOWS`, `DESKTOP_LINUX`, `DESKTOP_CHROME_OS`, `ANDROID`, and `IOS`.
     * 
     */
    public Output<String> osType() {
        return this.osType;
    }

    private AccessLevelsAccessLevelBasicConditionDevicePolicyOsConstraintArgs() {}

    private AccessLevelsAccessLevelBasicConditionDevicePolicyOsConstraintArgs(AccessLevelsAccessLevelBasicConditionDevicePolicyOsConstraintArgs $) {
        this.minimumVersion = $.minimumVersion;
        this.osType = $.osType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessLevelsAccessLevelBasicConditionDevicePolicyOsConstraintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessLevelsAccessLevelBasicConditionDevicePolicyOsConstraintArgs $;

        public Builder() {
            $ = new AccessLevelsAccessLevelBasicConditionDevicePolicyOsConstraintArgs();
        }

        public Builder(AccessLevelsAccessLevelBasicConditionDevicePolicyOsConstraintArgs defaults) {
            $ = new AccessLevelsAccessLevelBasicConditionDevicePolicyOsConstraintArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param minimumVersion The minimum allowed OS version. If not set, any version
         * of this OS satisfies the constraint.
         * Format: &#34;major.minor.patch&#34; such as &#34;10.5.301&#34;, &#34;9.2.1&#34;.
         * 
         * @return builder
         * 
         */
        public Builder minimumVersion(@Nullable Output<String> minimumVersion) {
            $.minimumVersion = minimumVersion;
            return this;
        }

        /**
         * @param minimumVersion The minimum allowed OS version. If not set, any version
         * of this OS satisfies the constraint.
         * Format: &#34;major.minor.patch&#34; such as &#34;10.5.301&#34;, &#34;9.2.1&#34;.
         * 
         * @return builder
         * 
         */
        public Builder minimumVersion(String minimumVersion) {
            return minimumVersion(Output.of(minimumVersion));
        }

        /**
         * @param osType The operating system type of the device.
         * Possible values are `OS_UNSPECIFIED`, `DESKTOP_MAC`, `DESKTOP_WINDOWS`, `DESKTOP_LINUX`, `DESKTOP_CHROME_OS`, `ANDROID`, and `IOS`.
         * 
         * @return builder
         * 
         */
        public Builder osType(Output<String> osType) {
            $.osType = osType;
            return this;
        }

        /**
         * @param osType The operating system type of the device.
         * Possible values are `OS_UNSPECIFIED`, `DESKTOP_MAC`, `DESKTOP_WINDOWS`, `DESKTOP_LINUX`, `DESKTOP_CHROME_OS`, `ANDROID`, and `IOS`.
         * 
         * @return builder
         * 
         */
        public Builder osType(String osType) {
            return osType(Output.of(osType));
        }

        public AccessLevelsAccessLevelBasicConditionDevicePolicyOsConstraintArgs build() {
            $.osType = Objects.requireNonNull($.osType, "expected parameter 'osType' to be non-null");
            return $;
        }
    }

}
