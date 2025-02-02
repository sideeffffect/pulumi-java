// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProfileArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProfileArgs Empty = new GetProfileArgs();

    /**
     * The name of the hub.
     * 
     */
    @Import(name="hubName", required=true)
    private Output<String> hubName;

    /**
     * @return The name of the hub.
     * 
     */
    public Output<String> hubName() {
        return this.hubName;
    }

    /**
     * Locale of profile to retrieve, default is en-us.
     * 
     */
    @Import(name="localeCode")
    private @Nullable Output<String> localeCode;

    /**
     * @return Locale of profile to retrieve, default is en-us.
     * 
     */
    public Optional<Output<String>> localeCode() {
        return Optional.ofNullable(this.localeCode);
    }

    /**
     * The name of the profile.
     * 
     */
    @Import(name="profileName", required=true)
    private Output<String> profileName;

    /**
     * @return The name of the profile.
     * 
     */
    public Output<String> profileName() {
        return this.profileName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetProfileArgs() {}

    private GetProfileArgs(GetProfileArgs $) {
        this.hubName = $.hubName;
        this.localeCode = $.localeCode;
        this.profileName = $.profileName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProfileArgs $;

        public Builder() {
            $ = new GetProfileArgs();
        }

        public Builder(GetProfileArgs defaults) {
            $ = new GetProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hubName The name of the hub.
         * 
         * @return builder
         * 
         */
        public Builder hubName(Output<String> hubName) {
            $.hubName = hubName;
            return this;
        }

        /**
         * @param hubName The name of the hub.
         * 
         * @return builder
         * 
         */
        public Builder hubName(String hubName) {
            return hubName(Output.of(hubName));
        }

        /**
         * @param localeCode Locale of profile to retrieve, default is en-us.
         * 
         * @return builder
         * 
         */
        public Builder localeCode(@Nullable Output<String> localeCode) {
            $.localeCode = localeCode;
            return this;
        }

        /**
         * @param localeCode Locale of profile to retrieve, default is en-us.
         * 
         * @return builder
         * 
         */
        public Builder localeCode(String localeCode) {
            return localeCode(Output.of(localeCode));
        }

        /**
         * @param profileName The name of the profile.
         * 
         * @return builder
         * 
         */
        public Builder profileName(Output<String> profileName) {
            $.profileName = profileName;
            return this;
        }

        /**
         * @param profileName The name of the profile.
         * 
         * @return builder
         * 
         */
        public Builder profileName(String profileName) {
            return profileName(Output.of(profileName));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetProfileArgs build() {
            $.hubName = Objects.requireNonNull($.hubName, "expected parameter 'hubName' to be non-null");
            $.profileName = Objects.requireNonNull($.profileName, "expected parameter 'profileName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
