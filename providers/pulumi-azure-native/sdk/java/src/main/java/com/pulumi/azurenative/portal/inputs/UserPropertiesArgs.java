// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.portal.inputs;

import com.pulumi.azurenative.portal.enums.OsType;
import com.pulumi.azurenative.portal.enums.ShellType;
import com.pulumi.azurenative.portal.inputs.StorageProfileArgs;
import com.pulumi.azurenative.portal.inputs.TerminalSettingsArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The cloud shell user settings properties.
 * 
 */
public final class UserPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserPropertiesArgs Empty = new UserPropertiesArgs();

    /**
     * The preferred location of the cloud shell.
     * 
     */
    @Import(name="preferredLocation", required=true)
    private Output<String> preferredLocation;

    public Output<String> preferredLocation() {
        return this.preferredLocation;
    }

    /**
     * The operating system type of the cloud shell. Deprecated, use preferredShellType.
     * 
     */
    @Import(name="preferredOsType", required=true)
    private Output<Either<String,OsType>> preferredOsType;

    public Output<Either<String,OsType>> preferredOsType() {
        return this.preferredOsType;
    }

    /**
     * The shell type of the cloud shell.
     * 
     */
    @Import(name="preferredShellType", required=true)
    private Output<Either<String,ShellType>> preferredShellType;

    public Output<Either<String,ShellType>> preferredShellType() {
        return this.preferredShellType;
    }

    /**
     * The storage profile of the user settings.
     * 
     */
    @Import(name="storageProfile", required=true)
    private Output<StorageProfileArgs> storageProfile;

    public Output<StorageProfileArgs> storageProfile() {
        return this.storageProfile;
    }

    /**
     * Settings for terminal appearance.
     * 
     */
    @Import(name="terminalSettings", required=true)
    private Output<TerminalSettingsArgs> terminalSettings;

    public Output<TerminalSettingsArgs> terminalSettings() {
        return this.terminalSettings;
    }

    private UserPropertiesArgs() {}

    private UserPropertiesArgs(UserPropertiesArgs $) {
        this.preferredLocation = $.preferredLocation;
        this.preferredOsType = $.preferredOsType;
        this.preferredShellType = $.preferredShellType;
        this.storageProfile = $.storageProfile;
        this.terminalSettings = $.terminalSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserPropertiesArgs $;

        public Builder() {
            $ = new UserPropertiesArgs();
        }

        public Builder(UserPropertiesArgs defaults) {
            $ = new UserPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder preferredLocation(Output<String> preferredLocation) {
            $.preferredLocation = preferredLocation;
            return this;
        }

        public Builder preferredLocation(String preferredLocation) {
            return preferredLocation(Output.of(preferredLocation));
        }

        public Builder preferredOsType(Output<Either<String,OsType>> preferredOsType) {
            $.preferredOsType = preferredOsType;
            return this;
        }

        public Builder preferredOsType(Either<String,OsType> preferredOsType) {
            return preferredOsType(Output.of(preferredOsType));
        }

        public Builder preferredShellType(Output<Either<String,ShellType>> preferredShellType) {
            $.preferredShellType = preferredShellType;
            return this;
        }

        public Builder preferredShellType(Either<String,ShellType> preferredShellType) {
            return preferredShellType(Output.of(preferredShellType));
        }

        public Builder storageProfile(Output<StorageProfileArgs> storageProfile) {
            $.storageProfile = storageProfile;
            return this;
        }

        public Builder storageProfile(StorageProfileArgs storageProfile) {
            return storageProfile(Output.of(storageProfile));
        }

        public Builder terminalSettings(Output<TerminalSettingsArgs> terminalSettings) {
            $.terminalSettings = terminalSettings;
            return this;
        }

        public Builder terminalSettings(TerminalSettingsArgs terminalSettings) {
            return terminalSettings(Output.of(terminalSettings));
        }

        public UserPropertiesArgs build() {
            $.preferredLocation = Objects.requireNonNull($.preferredLocation, "expected parameter 'preferredLocation' to be non-null");
            $.preferredOsType = Objects.requireNonNull($.preferredOsType, "expected parameter 'preferredOsType' to be non-null");
            $.preferredShellType = Objects.requireNonNull($.preferredShellType, "expected parameter 'preferredShellType' to be non-null");
            $.storageProfile = Objects.requireNonNull($.storageProfile, "expected parameter 'storageProfile' to be non-null");
            $.terminalSettings = Objects.requireNonNull($.terminalSettings, "expected parameter 'terminalSettings' to be non-null");
            return $;
        }
    }

}
